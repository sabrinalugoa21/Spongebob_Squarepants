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


private:
    /**
     * Emit code to allocate an array for a target variable or field.
     * @param targetId the target variable's or field's symbol table entry.
     * @param arrayType the array type.
     */
    void emitAllocateArray(SymtabEntry *targetId, Typespec *arrayType);

    /**
     * Emit code that loops over the array dimensions to allocate
     * data for each element.
     * @param targetId the symbol table entry of the target variable.
     * @param elmtType the data type of the array element.
     * @param dimensionIndex the first dimension is 1, second is 2, etc.
     * @param dimensionCount the count of dimensions.
     */
    void emitAllocateArrayElements(SymtabEntry *targetId, Typespec *elmtType,
                                   int dimensionIndex, int dimensionCount);

    /**
     * Emit code to allocate a record variable as a class.
     * @param variableId the symbol table entry of the variable.
     * @param recordType the record data type.
     */
    void emitAllocateRecord(SymtabEntry *variableId, Typespec *recordType,
                            Instruction dup);
};

}} // namespace backend::compiler

#endif /* STRUCTUREDDATAGENERATOR_H_ */
