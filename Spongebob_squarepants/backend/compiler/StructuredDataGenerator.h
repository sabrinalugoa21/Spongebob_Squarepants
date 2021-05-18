#ifndef STRUCTUREDDATAGENERATOR_H_
#define STRUCTUREDDATAGENERATOR_H_

#include "CodeGenerator.h"

namespace backend { namespace compiler {

class StructuredDataGenerator : public CodeGenerator
{
public:
    StructuredDataGenerator(CodeGenerator *parent, Compiler *compiler)
        : CodeGenerator(parent, compiler) {}

    /**
     * Emit code to allocate the string, array, and record variables
     * of a program, procedure, or function.
     * @param routineId the routine's symbol table entry.
     */
    void emitData(SymtabEntry *routineId);
};

}} // namespace backend::compiler

#endif /* STRUCTUREDDATAGENERATOR_H_ */
