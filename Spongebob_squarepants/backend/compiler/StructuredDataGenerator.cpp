#include <string>
#include <vector>

#include "Spongebob_SquarepantsBaseVisitor.h"
#include "antlr4-runtime.h"

#include "intermediate/symbtab/Predefined.h"
#include "intermediate/type/Typespec.h"
#include "Compiler.h"
#include "Instruction.h"
#include "CodeGenerator.h"
#include "ExpressionGenerator.h"
#include "StructuredDataGenerator.h"

namespace backend { namespace compiler {

using namespace std;

/**
 * Emit code to allocate the string, array, and record variables
 * of a program, procedure, or function.
 * @param routineId the routine's symbol table entry.
 */
void StructuredDataGenerator::emitData(SymtabEntry *routineId)
{
    Symtab *symtab = routineId->getRoutineSymtab();
    vector<SymtabEntry *> ids = symtab->sortedEntries();

    // Loop over all the symbol table's identifiers to emit
    // data allocation code for array and record variables.
    for (SymtabEntry *id : ids)
    {
        if (id->getKind() == VARIABLE)
        {
            Typespec *type = id->getType();
            Form form = type->getForm();

        }
    }
}

}} // namespace backend::compiler
