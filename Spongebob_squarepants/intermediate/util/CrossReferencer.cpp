/**
 * <h1>CrossReferencer</h1>
 *
 * <p>Generate a cross-reference listing.</p>
 *
 * <p>Copyright (c) 2020 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
#include <iostream>
#include <string>
#include <vector>

#include "antlr4-runtime.h"

#include "CrossReferencer.h"
#include "intermediate/type/Typespec.h"
#include "intermediate/symtab/SymtabStack.h"
#include "intermediate/symtab/Symtab.h"
#include "intermediate/symtab/SymtabEntry.h"
#include "intermediate/symtab/Predefined.h"

namespace intermediate { namespace util {

using namespace std;
using namespace intermediate::symtab;
using namespace intermediate::type;

const int CrossReferencer::NAME_WIDTH = 16;

const string CrossReferencer::NAME_FORMAT = string("%-") +
                                            to_string(NAME_WIDTH) +
                                            string("s");
const string CrossReferencer::NUMBERS_LABEL = " Line numbers    ";
const string CrossReferencer::NUMBERS_UNDERLINE = " ------------    ";
const string CrossReferencer::NUMBER_FORMAT = " %03d";
const string CrossReferencer::ENUM_CONST_FORMAT = string("%") +
                                                  to_string(NAME_WIDTH) +
                                                  string("s = %s");

const int CrossReferencer::LABEL_WIDTH  = NUMBERS_LABEL.length();
const int CrossReferencer::INDENT_WIDTH = NAME_WIDTH + LABEL_WIDTH;

const string CrossReferencer::INDENT = string(INDENT_WIDTH, ' ');

void CrossReferencer::print(const SymtabStack *symtabStack) const
{
    cout << "\n===== CROSS-REFERENCE TABLE =====" << endl;

    SymtabEntry *programId = symtabStack->getProgramId();
    printRoutine(programId);
}

void CrossReferencer::printRoutine(SymtabEntry *routineId) const
{
    Kind kind = routineId->getKind();
    cout << endl << "*** " << KIND_STRINGS[(int) kind]
         << " " << routineId->getName() << " ***" << endl;
    printColumnHeadings();

    // Print the entries in the routine's symbol table.
    Symtab *symtab = routineId->getRoutineSymtab();
    vector<Typespec *> newRecordTypes;
    printSymtab(symtab, newRecordTypes);

    // Print cross-reference tables for any records defined in the routine.
    if (newRecordTypes.size() > 0) printRecords(newRecordTypes);

    // Print any procedures and functions defined in the routine.
    vector<SymtabEntry *> *routineIds = routineId->getSubroutines();
    if (routineIds != nullptr)
    {
        for (SymtabEntry *routineId : *routineIds) printRoutine(routineId);
    }
}

void CrossReferencer::printColumnHeadings() const
{
    cout << endl;
    printf(NAME_FORMAT.c_str(), "Identifier");
    cout << NUMBERS_LABEL     << "Type specification" << endl;
    printf(NAME_FORMAT.c_str(), "----------");
    cout << NUMBERS_UNDERLINE << "------------------" << endl;
}

void CrossReferencer::printSymtab(Symtab *symtab,
                                  vector<Typespec *>& recordTypes) const
{
    // Loop over the sorted list of symbol table entries.
    vector<SymtabEntry *> sorted = symtab->sortedEntries();
    for (SymtabEntry *entry : sorted)
    {
        vector<int> *line_numbers = entry->getLineNumbers();

        // For each entry, print the identifier name
        // followed by the line numbers.
        printf(NAME_FORMAT.c_str(), entry->getName().c_str());
        if (line_numbers->size() > 0)
        {
            for (int line_number : *line_numbers)
            {
                printf(NUMBER_FORMAT.c_str(), line_number);
            }
        }

        // Print the symbol table entry.
        cout << endl;
        printEntry(entry, recordTypes);
    }
}

void CrossReferencer::printEntry(SymtabEntry *entry,
                                 vector<Typespec *>& recordTypes) const
{
    Kind kind = entry->getKind();
    int nestingLevel = entry->getSymtab()->getNestingLevel();
    cout << INDENT << "Defined as: " << KIND_STRINGS[(int) kind] << endl;
    cout << INDENT << "Scope nesting level: " << nestingLevel << endl;

    // Print the type specification.
    Typespec *type = entry->getType();
    printType(type);

    switch (kind)
    {
        case Kind::CONSTANT:
        {
            Object value = entry->getValue();
            cout << INDENT << "Value: " << toString(value, type) << endl;

            // Print the type details only if the type is unnamed.
            if (type->getIdentifier() == nullptr)
            {
                printTypeDetail(type, recordTypes);
            }

            break;
        }

        case Kind::ENUMERATION_CONSTANT:
        {
            Object value = entry->getValue();
            cout << INDENT << "Value = " << toString(value, type) << endl;

            break;
        }

        case Kind::TYPE:
        {
            // Print the type details only when the type is first defined.
            if (entry == type->getIdentifier())
            {
                printTypeDetail(type, recordTypes);
            }

            break;
        }

        case Kind::VARIABLE:
        {
            // Print the type details only if the type is unnamed.
            if (type->getIdentifier() == nullptr)
            {
                printTypeDetail(type, recordTypes);
            }

            break;
        }

        default: break;  // shouldn't get here
    }
}

void CrossReferencer::printType(Typespec *typespec) const
{
    if (typespec != nullptr)
    {
        Form form = typespec->getForm();
        SymtabEntry *type_id = typespec->getIdentifier();
        string type_name = type_id != nullptr ? type_id->getName()
                                              : "<unnamed>";

        cout << INDENT << "Type form = " << FORM_STRINGS[(int) form]
             << ", Type id = " << type_name << endl;
    }
}

void CrossReferencer::printTypeDetail(Typespec *type,
                                      vector<Typespec *>& recordTypes)
    const
{
    Form form = type->getForm();

    switch (form)
    {
        case Form::ENUMERATION:
        {
            vector<SymtabEntry *> *constant_ids = type->getEnumerationConstants();

            cout << INDENT << "--- Enumeration constants ---" << endl;

            // Print each enumeration constant and its value.
            for (SymtabEntry *constant_id : *constant_ids)
            {
                string name = constant_id->getName();
                Object value = constant_id->getValue();

                cout << INDENT;
                printf(ENUM_CONST_FORMAT.c_str(), name.c_str(),
                       toString(value, type).c_str());
                cout << endl;
            }

            break;
        }

        case Form::SUBRANGE:
        {
            int min_value = type->getSubrangeMinValue();
            int max_value = type->getSubrangeMaxValue();
            Typespec *baseTypespec = type->baseType();

            cout << INDENT + "--- Base type ---" << endl;
            printType(baseTypespec);

            // Print the base type details only if the type is unnamed.
            if (baseTypespec->getIdentifier() == nullptr)
            {
                printTypeDetail(baseTypespec, recordTypes);
            }

            cout << INDENT << "Range = ";
            cout << min_value << ".." << max_value << endl;

            break;
        }

        case Form::ARRAY:
        {
            Typespec *indexType = type->getArrayIndexType();
            Typespec *elementType = type->getArrayElementType();
            int count = type->getArrayElementCount();

            cout << INDENT << "--- INDEX TYPE ---" << endl;
            printType(indexType);

            // Print the index type details only if the type is unnamed.
            if (indexType->getIdentifier() == nullptr)
            {
                printTypeDetail(indexType, recordTypes);
            }

            cout << INDENT << "--- ELEMENT TYPE ---" << endl;
            printType(elementType);
            cout << INDENT << count << " elements" << endl;

            // Print the element type details only if the type is unnamed.
            if (elementType->getIdentifier() == nullptr)
            {
                printTypeDetail(elementType, recordTypes);
            }

            break;
        }

        case Form::RECORD:
        {
            recordTypes.push_back(type);
            break;
        }

        default: break;  // shouldn't get here
    }
}

void CrossReferencer::printRecords(vector<Typespec *>& recordTypes) const
{
    for (Typespec *recordType : recordTypes)
    {
        SymtabEntry *record_id = recordType->getIdentifier();
        string name = record_id != nullptr ? record_id->getName()
                                           : "<unnamed>";

        cout << endl << "--- RECORD " << name << " ---" << endl;
        printColumnHeadings();

        // Print the entries in the record's symbol table.
        Symtab *symtab = recordType->getRecordSymtab();
        vector<Typespec *> newRecordTypes;
        printSymtab(symtab, newRecordTypes);

        // Print cross-reference tables for any nested records.
        if (newRecordTypes.size() > 0)
        {
            printRecords(newRecordTypes);
        }
    }
}

string CrossReferencer::toString(Object value, Typespec *type) const
{
    if      (type == Predefined::integerType) return to_string(value.as<int>());
    else if (type == Predefined::realType)    return to_string(value.as<double>());
    else if (type == Predefined::booleanType) return to_string(value.as<bool>());
    else if (type == Predefined::charType)    return to_string(value.as<char>());
    else if (type == Predefined::stringType)  return "'" + *(value.as<string *>()) + "'";
    else  /* enumeration constant */          return to_string(value.as<int>());
}

}}  // namespace intermediate ::util
