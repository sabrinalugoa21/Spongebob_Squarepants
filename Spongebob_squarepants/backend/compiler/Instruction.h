/**
 * <h1>Instruction</h1>
 *
 * <p>Jasmin instructions.</p>
 *
 * <p>Copyright (c) 2020 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
#ifndef INSTRUCTION_H_
#define INSTRUCTION_H_

#include "../../Object.h"

namespace backend { namespace compiler {

using namespace std;

enum class Instruction
{
    // Load constant
    ICONST_0, ICONST_1, ICONST_2, ICONST_3,
    ICONST_4, ICONST_5, ICONST_M1,
    FCONST_0, FCONST_1, FCONST_2, ACONST_NULL,
    BIPUSH, SIPUSH, LDC,

    // Load value or address
    ILOAD_0, ILOAD_1, ILOAD_2, ILOAD_3,
    FLOAD_0, FLOAD_1, FLOAD_2, FLOAD_3,
    ALOAD_0, ALOAD_1, ALOAD_2, ALOAD_3,
    LLOAD_0, LLOAD_1, LLOAD_2, LLOAD_3,
    ILOAD, FLOAD, ALOAD,
    GETSTATIC, GETFIELD,

    // Store value or address
    ISTORE_0, ISTORE_1, ISTORE_2, ISTORE_3,
    FSTORE_0, FSTORE_1, FSTORE_2, FSTORE_3,
    ASTORE_0, ASTORE_1, ASTORE_2, ASTORE_3,
    LSTORE_0, LSTORE_1, LSTORE_2, LSTORE_3,
    ISTORE, FSTORE, ASTORE,
    PUTSTATIC, PUTFIELD,

    // Operand stack
    POP, SWAP, DUP, DUP_X1, DUP_X2,

    // Arithmetic and logical
    IADD, FADD, ISUB, FSUB, IMUL, FMUL,
    IDIV, FDIV, IREM, FREM, INEG, FNEG,
    IINC, IAND, IOR, IXOR,

    // Type conversion and checking
    I2F, I2C, I2D, F2I, F2D, D2F,
    CHECKCAST,

    // Objects and arrays
    NEW, NEWARRAY, ANEWARRAY, MULTIANEWARRAY,
    IALOAD, FALOAD, BALOAD, CALOAD, AALOAD,
    IASTORE, FASTORE, BASTORE, CASTORE, AASTORE,

    // Compare and branch
    IFEQ, IFNE, IFLT, IFLE, IFGT, IFGE,
    IF_ICMPEQ, IF_ICMPNE, IF_ICMPLT,
    IF_ICMPLE, IF_ICMPGT, IF_ICMPGE,
    FCMPG, GOTO, LOOKUPSWITCH,

    // Call and return
    INVOKESTATIC, INVOKESPECIAL,
    INVOKEVIRTUAL, INVOKENONVIRTUAL,
    RETURN, IRETURN, FRETURN, ARETURN,

    // No operation
    NOP
};

static const int STACK_USE[] =
{
    // Load constant
    1, 1, 1, 1,
    1, 1, 1,
    1, 1, 1, 1,
    1, 1, 1,

    // Load value or address
    1, 1, 1, 1,
    1, 1, 1, 1,
    1, 1, 1, 1,
    2, 2, 2, 2,
    1, 1, 1,
    1, 0,

    // Store value or address
    -1, -1, -1, -1,
    -1, -1, -1, -1,
    -1, -1, -1, -1,
    -2, -2, -2, -2,
    -1, -1, -1,
    -1, -2,

    // Operand stack
    -1, 0, 1, 1, 1,

    // Arithmetic and logical
    -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, 0, 0,
    0, -1, -1, -1,

    // Type conversion and checking
    0, 0, 0, 0, 0, 0,
    0,

    // Objects and arrays
    1, 0, 0, 0,
    -1, -1, -1, -1, -1,
    -3, -3, -3, -3, -3,

    // Compare and branch
    -1, -1, -1, -1, -1, -1,
    -2, -2, -2,
    -2, -2, -2,
    -1, 0, -1,

    // Call and return
    0, 0,
    0, 0,
    0, -1, -1, -1,

    // No operation
    0
};

inline int stackUse(Instruction instruction)
{
    return STACK_USE[static_cast<int>(instruction)];
}

static const string INSTRUCTION_STRINGS[] =
{
    // Load constant
    "ICONST_0", "ICONST_1", "ICONST_2", "ICONST_3",
    "ICONST_4", "ICONST_5", "ICONST_M1",
    "FCONST_0", "FCONST_1", "FCONST_2", "ACONST_NULL",
    "BIPUSH", "SIPUSH", "LDC",

    // Load value or address
    "ILOAD_0", "ILOAD_1", "ILOAD_2", "ILOAD_3",
    "FLOAD_0", "FLOAD_1", "FLOAD_2", "FLOAD_3",
    "ALOAD_0", "ALOAD_1", "ALOAD_2", "ALOAD_3",
    "LLOAD_0", "LLOAD_1", "LLOAD_2", "LLOAD_3",
    "ILOAD", "FLOAD", "ALOAD",
    "GETSTATIC", "GETFIELD",

    // Store value or address
    "ISTORE_0", "ISTORE_1", "ISTORE_2", "ISTORE_3",
    "FSTORE_0", "FSTORE_1", "FSTORE_2", "FSTORE_3",
    "ASTORE_0", "ASTORE_1", "ASTORE_2", "ASTORE_3",
    "LSTORE_0", "LSTORE_1", "LSTORE_2", "LSTORE_3",
    "ISTORE", "FSTORE", "ASTORE",
    "PUTSTATIC", "PUTFIELD",

    // Operand stack
    "POP", "SWAP", "DUP", "DUP_X1", "DUP_X2",

    // Arithmetic and logical
    "IADD", "FADD", "ISUB", "FSUB", "IMUL", "FMUL",
    "IDIV", "FDIV", "IREM", "FREM", "INEG", "FNEG",
    "IINC", "IAND", "IOR", "IXOR",

    // Type conversion and checking
    "I2F", "I2C", "I2D", "F2I", "F2D", "D2F",
    "CHECKCAST",

    // Objects and arrays
    "NEW", "NEWARRAY", "ANEWARRAY", "MULTIANEWARRAY",
    "IALOAD", "FALOAD", "BALOAD", "CALOAD", "AALOAD",
    "IASTORE", "FASTORE", "BASTORE", "CASTORE", "AASTORE",

    // Compare and branch
    "IFEQ", "IFNE", "IFLT", "IFLE", "IFGT", "IFGE",
    "IF_ICMPEQ", "IF_ICMPNE", "IF_ICMPLT",
    "IF_ICMPLE", "IF_ICMPGT", "IF_ICMPGE",
    "FCMPG", "GOTO", "LOOKUPSWITCH",

    // Call and return
    "INVOKESTATIC", "INVOKESPECIAL",
    "INVOKEVIRTUAL", "INVOKENONVIRTUAL",
    "RETURN", "IRETURN", "FRETURN", "ARETURN",

    // No operation
    "NOP"
};

// Load constant
constexpr Instruction ICONST_0    = Instruction::ICONST_0;
constexpr Instruction ICONST_1    = Instruction::ICONST_1;
constexpr Instruction ICONST_2    = Instruction::ICONST_2;
constexpr Instruction ICONST_3    = Instruction::ICONST_3;
constexpr Instruction ICONST_4    = Instruction::ICONST_4;
constexpr Instruction ICONST_5    = Instruction::ICONST_5;
constexpr Instruction ICONST_M1   = Instruction::ICONST_M1;
constexpr Instruction FCONST_0    = Instruction::FCONST_0;
constexpr Instruction FCONST_1    = Instruction::FCONST_1;
constexpr Instruction FCONST_2    = Instruction::FCONST_2;
constexpr Instruction ACONST_NULL = Instruction::ACONST_NULL;
constexpr Instruction BIPUSH      = Instruction::BIPUSH;
constexpr Instruction SIPUSH      = Instruction::SIPUSH;
constexpr Instruction LDC         = Instruction::LDC;

// Load value or address
constexpr Instruction ILOAD_0   = Instruction::ILOAD_0;
constexpr Instruction ILOAD_1   = Instruction::ILOAD_1;
constexpr Instruction ILOAD_2   = Instruction::ILOAD_2;
constexpr Instruction ILOAD_3   = Instruction::ILOAD_3;
constexpr Instruction FLOAD_0   = Instruction::FLOAD_0;
constexpr Instruction FLOAD_1   = Instruction::FLOAD_1;
constexpr Instruction FLOAD_2   = Instruction::FLOAD_2;
constexpr Instruction FLOAD_3   = Instruction::FLOAD_3;
constexpr Instruction ALOAD_0   = Instruction::ALOAD_0;
constexpr Instruction ALOAD_1   = Instruction::ALOAD_1;
constexpr Instruction ALOAD_2   = Instruction::ALOAD_2;
constexpr Instruction ALOAD_3   = Instruction::ALOAD_3;
constexpr Instruction LLOAD_0   = Instruction::LLOAD_0;
constexpr Instruction LLOAD_1   = Instruction::LLOAD_1;
constexpr Instruction LLOAD_2   = Instruction::LLOAD_2;
constexpr Instruction LLOAD_3   = Instruction::LLOAD_3;
constexpr Instruction ILOAD     = Instruction::ILOAD;
constexpr Instruction FLOAD     = Instruction::FLOAD;
constexpr Instruction ALOAD     = Instruction::ALOAD;
constexpr Instruction GETSTATIC = Instruction::GETSTATIC;
constexpr Instruction GETFIELD  = Instruction::GETFIELD;

// Store value or address
constexpr Instruction ISTORE_0  = Instruction::ISTORE_0;
constexpr Instruction ISTORE_1  = Instruction::ISTORE_1;
constexpr Instruction ISTORE_2  = Instruction::ISTORE_2;
constexpr Instruction ISTORE_3  = Instruction::ISTORE_3;
constexpr Instruction FSTORE_0  = Instruction::FSTORE_0;
constexpr Instruction FSTORE_1  = Instruction::FSTORE_1;
constexpr Instruction FSTORE_2  = Instruction::FSTORE_2;
constexpr Instruction FSTORE_3  = Instruction::FSTORE_3;
constexpr Instruction ASTORE_0  = Instruction::ASTORE_0;
constexpr Instruction ASTORE_1  = Instruction::ASTORE_1;
constexpr Instruction ASTORE_2  = Instruction::ASTORE_2;
constexpr Instruction ASTORE_3  = Instruction::ASTORE_3;
constexpr Instruction LSTORE_0  = Instruction::LSTORE_0;
constexpr Instruction LSTORE_1  = Instruction::LSTORE_1;
constexpr Instruction LSTORE_2  = Instruction::LSTORE_2;
constexpr Instruction LSTORE_3  = Instruction::LSTORE_3;
constexpr Instruction ISTORE    = Instruction::ISTORE;
constexpr Instruction FSTORE    = Instruction::FSTORE;
constexpr Instruction ASTORE    = Instruction::ASTORE;
constexpr Instruction PUTSTATIC = Instruction::PUTSTATIC;
constexpr Instruction PUTFIELD  = Instruction::PUTFIELD;

// Operand stack
constexpr Instruction POP    = Instruction::POP;
constexpr Instruction SWAP   = Instruction::SWAP;
constexpr Instruction DUP    = Instruction::DUP;
constexpr Instruction DUP_X1 = Instruction::DUP_X1;
constexpr Instruction DUP_X2 = Instruction::DUP_X2;

// Arithmetic and logical
constexpr Instruction IADD = Instruction::IADD;
constexpr Instruction FADD = Instruction::FADD;
constexpr Instruction ISUB = Instruction::ISUB;
constexpr Instruction FSUB = Instruction::FSUB;
constexpr Instruction IMUL = Instruction::IMUL;
constexpr Instruction FMUL = Instruction::FMUL;
constexpr Instruction IDIV = Instruction::IDIV;
constexpr Instruction FDIV = Instruction::FDIV;
constexpr Instruction IREM = Instruction::IREM;
constexpr Instruction FREM = Instruction::FREM;
constexpr Instruction INEG = Instruction::INEG;
constexpr Instruction FNEG = Instruction::FNEG;
constexpr Instruction IINC = Instruction::IINC;
constexpr Instruction IAND = Instruction::IAND;
constexpr Instruction IOR  = Instruction::IOR;
constexpr Instruction IXOR = Instruction::IXOR;

// Type conversion and checking
constexpr Instruction I2F       = Instruction::I2F;
constexpr Instruction I2C       = Instruction::I2C;
constexpr Instruction I2D       = Instruction::I2D;
constexpr Instruction F2I       = Instruction::F2I;
constexpr Instruction F2D       = Instruction::F2D;
constexpr Instruction D2F       = Instruction::D2F;
constexpr Instruction CHECKCAST = Instruction::CHECKCAST;

// Objects and arrays
constexpr Instruction NEW            = Instruction::NEW;
constexpr Instruction NEWARRAY       = Instruction::NEWARRAY;
constexpr Instruction ANEWARRAY      = Instruction::ANEWARRAY;
constexpr Instruction MULTIANEWARRAY = Instruction::MULTIANEWARRAY;
constexpr Instruction IALOAD         = Instruction::IALOAD;
constexpr Instruction FALOAD         = Instruction::FALOAD;
constexpr Instruction BALOAD         = Instruction::BALOAD;
constexpr Instruction CALOAD         = Instruction::CALOAD;
constexpr Instruction AALOAD         = Instruction::AALOAD;
constexpr Instruction IASTORE        = Instruction::IASTORE;
constexpr Instruction FASTORE        = Instruction::FASTORE;
constexpr Instruction BASTORE        = Instruction::BASTORE;
constexpr Instruction CASTORE        = Instruction::CASTORE;
constexpr Instruction AASTORE        = Instruction::AASTORE;

// Compare and branch
constexpr Instruction IFEQ         = Instruction::IFEQ;
constexpr Instruction IFNE         = Instruction::IFNE;
constexpr Instruction IFLT         = Instruction::IFLT;
constexpr Instruction IFLE         = Instruction::IFLE;
constexpr Instruction IFGT         = Instruction::IFGT;
constexpr Instruction IFGE         = Instruction::IFGE;
constexpr Instruction IF_ICMPEQ    = Instruction::IF_ICMPEQ;
constexpr Instruction IF_ICMPNE    = Instruction::IF_ICMPNE;
constexpr Instruction IF_ICMPLT    = Instruction::IF_ICMPLT;
constexpr Instruction IF_ICMPLE    = Instruction::IF_ICMPLE;
constexpr Instruction IF_ICMPGT    = Instruction::IF_ICMPGT;
constexpr Instruction IF_ICMPGE    = Instruction::IF_ICMPGE;
constexpr Instruction FCMPG        = Instruction::FCMPG;
constexpr Instruction GOTO         = Instruction::GOTO;
constexpr Instruction LOOKUPSWITCH = Instruction::LOOKUPSWITCH;

// Call and return
constexpr Instruction INVOKESTATIC     = Instruction::INVOKESTATIC;
constexpr Instruction INVOKESPECIAL    = Instruction::INVOKESPECIAL;
constexpr Instruction INVOKEVIRTUAL    = Instruction::INVOKEVIRTUAL;
constexpr Instruction INVOKENONVIRTUAL = Instruction::INVOKENONVIRTUAL;
constexpr Instruction RETURN           = Instruction::RETURN;
constexpr Instruction IRETURN          = Instruction::IRETURN;
constexpr Instruction FRETURN          = Instruction::FRETURN;
constexpr Instruction ARETURN          = Instruction::ARETURN;

// No operation
constexpr Instruction NOP = Instruction::NOP;

inline ostream& operator << (ostream& ofs, const Instruction& instruction)
{
    ofs << toLowerCase(INSTRUCTION_STRINGS[static_cast<int>(instruction)]);
    return ofs;
}

}}  // namespace backend::compiler

#endif /* INSTRUCTION_H_ */
