/**
 * <h1>CrossReferencer</h1>
 *
 * <p>Generate a cross-reference listing.</p>
 *
 * <p>Copyright (c) 2020 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
#ifndef CROSSREFERENCER_H_
#define CROSSREFERENCER_H_

#include <string>
#include <vector>

#include "antlr4-runtime.h"

#include "intermediate/type/Typespec.h"
#include "intermediate/symtab/Symtab.h"
#include "intermediate/symtab/SymtabStack.h"

namespace intermediate { namespace util {

using namespace std;
using namespace intermediate::symtab;
using namespace intermediate::type;

class CrossReferencer
{
public:
    /**
     * Print the cross-reference table.
     * @param symtab_stack the symbol table stack.
     */
    void print(const SymtabStack *symtab_stack) const;

private:
    static const int NAME_WIDTH;

    static const string NAME_FORMAT;
    static const string NUMBERS_LABEL;
    static const string NUMBERS_UNDERLINE;
    static const string NUMBER_FORMAT;
    static const string ENUM_CONST_FORMAT;

    static const int LABEL_WIDTH;
    static const int INDENT_WIDTH;

    static const string INDENT;

    /**
     * Print a cross-reference table for a routine.
     * @param routineId the routine identifier's symbol table entry.
     */
    void printRoutine(SymtabEntry *routineId) const;

    /**
     * Print column headings.
     */
    void printColumnHeadings() const;

    /**
     * Print the entries in a symbol table.
     * @param symtab the symbol table.
     * @param recordTypes the list to fill with RECORD type specifications.
     */
    void printSymtab(Symtab *symtab,
                     vector<Typespec *>& recordTypes) const;

    /**
     * Print a symbol table entry.
     * @param entry the symbol table entry.
     * @param recordTypes the list to fill with RECORD type specifications.
     */
    void printEntry(SymtabEntry *entry, vector<Typespec *>& recordTypes) const;

    /**
     * Print a type specification.
     * @param typespec the type specification.
     */
    void printType(Typespec *typespec) const;

    /**
     * Print the details of a type specification.
     * @param typespec the type specification.
     * @param recordTypes the list to fill with RECORD type specifications.
     */
    void printTypeDetail(Typespec *typespec,
                         vector<Typespec *>& recordTypes) const;

    /**
     * Print cross-reference tables for records defined in the routine.
     * @param recordTypes the list to fill with RECORD type specifications.
     */
    void printRecords(vector<Typespec *>& recordTypes) const;

    /**
     * Convert a value to a string.
     * @param value the value.
     * @param type the value's datatype.
     * @return the string.
     */
    string toString(Object dataValue, Typespec *type) const;
};

}}  // namespace wci::util

#endif /* _CROSSREFERENCER_H_ */
