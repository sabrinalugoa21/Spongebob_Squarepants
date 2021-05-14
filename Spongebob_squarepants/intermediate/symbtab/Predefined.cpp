/**
 * <h1>Predefined</h1>
 *
 * <p>Enter the predefined Pascal types, identifiers, and constants
 * into the symbol table.</p>
 *
 * <p>Copyright (c) 2009 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
#include <vector>

#include "antlr4-runtime.h"

#include "intermediate/symtab/SymtabStack.h"
#include "intermediate/symtab/SymtabEntry.h"
#include "intermediate/symtab/Predefined.h"
#include "intermediate/type/Typespec.h"
#include "Predefined.h"

namespace intermediate { namespace symtab {

using namespace std;
using namespace intermediate::symtab;
using namespace intermediate::type;

// Predefined types.
intermediate::type::Typespec *Predefined::integerType;
intermediate::type::Typespec *Predefined::realType;
intermediate::type::Typespec *Predefined::booleanType;
intermediate::type::Typespec *Predefined::charType;
intermediate::type::Typespec *Predefined::stringType;
intermediate::type::Typespec *Predefined::undefinedType;

// Predefined identifiers.
SymtabEntry *Predefined::integerId;
SymtabEntry *Predefined::realId;
SymtabEntry *Predefined::booleanId;
SymtabEntry *Predefined::charId;
SymtabEntry *Predefined::stringId;
SymtabEntry *Predefined::falseId;
SymtabEntry *Predefined::trueId;
SymtabEntry *Predefined::readId;
SymtabEntry *Predefined::readlnId;
SymtabEntry *Predefined::writeId;
SymtabEntry *Predefined::writelnId;
SymtabEntry *Predefined::absId;
SymtabEntry *Predefined::arctanId;
SymtabEntry *Predefined::chrId;
SymtabEntry *Predefined::cosId;
SymtabEntry *Predefined::eofId;
SymtabEntry *Predefined::eolnId;
SymtabEntry *Predefined::expId;
SymtabEntry *Predefined::lnId;
SymtabEntry *Predefined::oddId;
SymtabEntry *Predefined::ordId;
SymtabEntry *Predefined::predId;
SymtabEntry *Predefined::roundId;
SymtabEntry *Predefined::sinId;
SymtabEntry *Predefined::sqrId;
SymtabEntry *Predefined::sqrtId;
SymtabEntry *Predefined::succId;
SymtabEntry *Predefined::truncId;

void Predefined::initialize(SymtabStack *symtabStack)
{
    initializeTypes(symtabStack);
    initializeConstants(symtabStack);
    initializeStandardRoutines(symtabStack);
}

void Predefined::initializeTypes(SymtabStack *symtabStack)
{
    // Type integer.
    integerId = symtabStack->enterLocal("integer", TYPE);
    integerType = new Typespec(SCALAR);
    integerType->setIdentifier(integerId);
    integerId->setType(integerType);

    // Type real.
    realId = symtabStack->enterLocal("real", TYPE);
    realType = new Typespec(SCALAR);
    realType->setIdentifier(realId);
    realId->setType(realType);

    // Type boolean.
    booleanId = symtabStack->enterLocal("boolean", TYPE);
    booleanType = new Typespec(ENUMERATION);
    booleanType->setIdentifier(booleanId);
    booleanId->setType(booleanType);

    // Type char.
    charId = symtabStack->enterLocal("char", TYPE);
    charType = new Typespec(SCALAR);
    charType->setIdentifier(charId);
    charId->setType(charType);

    // Type string.
    stringId = symtabStack->enterLocal("string", TYPE);
    stringType = new Typespec(SCALAR);
    stringType->setIdentifier(stringId);
    stringId->setType(stringType);

    // Undefined type.
    undefinedType = new Typespec(SCALAR);
}

void Predefined::initializeConstants(SymtabStack *symtabStack)
{
    // Boolean enumeration constant false.
    falseId = symtabStack->enterLocal("false", ENUMERATION_CONSTANT);
    falseId->setType(booleanType);
    falseId->setValue(0);

    // Boolean enumeration constant true.
    trueId = symtabStack->enterLocal("true", ENUMERATION_CONSTANT);
    trueId->setType(booleanType);
    trueId->setValue(1);

    // Add false and true to the boolean enumeration type.
    vector<SymtabEntry *> *constants = new vector<SymtabEntry *>;
    constants->push_back(falseId);
    constants->push_back(trueId);
    booleanType->setEnumerationConstants(constants);
}

void Predefined::initializeStandardRoutines(SymtabStack *symtabStack)
{
    readId    = enterStandard(symtabStack, PROCEDURE, "read",    READ);
    readlnId  = enterStandard(symtabStack, PROCEDURE, "readln",  READLN);
    writeId   = enterStandard(symtabStack, PROCEDURE, "write",   WRITE);
    writelnId = enterStandard(symtabStack, PROCEDURE, "writeln", WRITELN);

    absId    = enterStandard(symtabStack, FUNCTION,  "abs",     ABS);
    arctanId = enterStandard(symtabStack, FUNCTION,  "arctan",  ARCTAN);
    chrId    = enterStandard(symtabStack, FUNCTION,  "chr",     CHR);
    cosId    = enterStandard(symtabStack, FUNCTION,  "cos",     COS);
    eofId    = enterStandard(symtabStack, FUNCTION,  "eof",     EOF_FUNCTION);
    eolnId   = enterStandard(symtabStack, FUNCTION,  "eoln",    EOLN_FUNCTION);
    expId    = enterStandard(symtabStack, FUNCTION,  "exp",     EXP);
    lnId     = enterStandard(symtabStack, FUNCTION,  "ln",      LN);
    oddId    = enterStandard(symtabStack, FUNCTION,  "odd",     ODD);
    ordId    = enterStandard(symtabStack, FUNCTION,  "ord",     ORD);
    predId   = enterStandard(symtabStack, FUNCTION,  "pred",    PRED);
    roundId  = enterStandard(symtabStack, FUNCTION,  "round",   ROUND);
    sinId    = enterStandard(symtabStack, FUNCTION,  "sin",     SIN);
    sqrId    = enterStandard(symtabStack, FUNCTION,  "sqr",     SQR);
    sqrtId   = enterStandard(symtabStack, FUNCTION,  "sqrt",    SQRT);
    succId   = enterStandard(symtabStack, FUNCTION,  "succ",    SUCC);
    truncId  = enterStandard(symtabStack, FUNCTION,  "trunc",   TRUNC);
}

SymtabEntry *Predefined::enterStandard(SymtabStack *symtabStack,
                                       const Kind kind, const string name,
                                       const Routine code)
{
    SymtabEntry *procId = symtabStack->enterLocal(name, kind);
    procId->setRoutineCode(code);

    return procId;
}

}}  // namespace wci::intermediate::symtabimpl
