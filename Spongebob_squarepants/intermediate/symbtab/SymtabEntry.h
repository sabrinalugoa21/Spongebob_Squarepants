/**
 * <h1>SymtabEntry</h1>
 *
 * <p>The symbol table entry for various kinds of identifiers.</p>
 *
 * <p>Copyright (c) 2020 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
#ifndef SYMTABENTRY_H_
#define SYMTABENTRY_H_

#include <string>
#include <vector>

#include "antlr4-runtime.h"

#include "../../Object.h"

// Forward declaration of class Typespec in namespace intermediate::type.
namespace intermediate { namespace type {
    class Typespec;
}};

namespace intermediate { namespace symtab {

using namespace std;
using intermediate::type::Typespec;

// More forward class declarations but in the same namespace.
class Symtab;
class SymtabEntry;

/**
 * What kind of identifier.
 */
enum class Kind
{
    CONSTANT, ENUMERATION_CONSTANT, TYPE, VARIABLE, RECORD_FIELD,
    VALUE_PARAMETER, REFERENCE_PARAMETER, PROGRAM_PARAMETER,
    PROGRAM, PROCEDURE, FUNCTION,
    UNDEFINED
};

static const string KIND_STRINGS[] =
{
    "constant", "enumeration constant", "type", "variable", "record field",
    "value parameter", "reference parameter", "program parameter",
    "PROGRAM", "PROCEDURE", "FUNCTION",
    "undefined"
};

constexpr Kind CONSTANT             = Kind::CONSTANT;
constexpr Kind ENUMERATION_CONSTANT = Kind::ENUMERATION_CONSTANT;
constexpr Kind TYPE                 = Kind::TYPE;
constexpr Kind VARIABLE             = Kind::VARIABLE;
constexpr Kind RECORD_FIELD         = Kind::RECORD_FIELD;
constexpr Kind VALUE_PARAMETER      = Kind::VALUE_PARAMETER;
constexpr Kind REFERENCE_PARAMETER  = Kind::REFERENCE_PARAMETER;
constexpr Kind PROGRAM_PARAMETER    = Kind::PROGRAM_PARAMETER;
constexpr Kind PROGRAM              = Kind::PROGRAM;
constexpr Kind PROCEDURE            = Kind::PROCEDURE;
constexpr Kind FUNCTION             = Kind::FUNCTION;
constexpr Kind UNDEFINED            = Kind::UNDEFINED;

/**
 * Which routine.
 */
enum class Routine
{
    DECLARED, FORWARD,
    READ, READLN, WRITE, WRITELN,
    ABS, ARCTAN, CHR, COS, EXP, LN, ODD, ORD,
    EOF_FUNCTION, EOLN_FUNCTION,
    PRED, ROUND, SIN, SQR, SQRT, SUCC, TRUNC,
};

constexpr Routine DECLARED      = Routine::DECLARED;
constexpr Routine FORWARD       = Routine::FORWARD;
constexpr Routine READ          = Routine::READ;
constexpr Routine READLN        = Routine::READLN;
constexpr Routine WRITE         = Routine::WRITE;
constexpr Routine WRITELN       = Routine::WRITELN;
constexpr Routine ABS           = Routine::ABS;
constexpr Routine ARCTAN        = Routine::ARCTAN;
constexpr Routine CHR           = Routine::CHR;
constexpr Routine COS           = Routine::COS;
constexpr Routine EXP           = Routine::EXP;
constexpr Routine LN            = Routine::LN;
constexpr Routine ODD           = Routine::ODD;
constexpr Routine ORD           = Routine::ORD;
constexpr Routine EOF_FUNCTION  = Routine::EOF_FUNCTION;
constexpr Routine EOLN_FUNCTION = Routine::EOLN_FUNCTION;
constexpr Routine PRED          = Routine::PRED;
constexpr Routine ROUND         = Routine::ROUND;
constexpr Routine SIN           = Routine::SIN;
constexpr Routine SQR           = Routine::SQR;
constexpr Routine SQRT          = Routine::SQRT;
constexpr Routine SUCC          = Routine::SUCC;
constexpr Routine TRUNC         = Routine::TRUNC;

class SymtabEntry
{
private:
    /**
     * Information for each kind of identifier.
     */
    union EntryInfo
    {
        struct
        {
        	Object *value;
        } data;

        struct
        {
        public:
            Routine code;                        // routine code
            Symtab *symtab;                      // routine's symbol table
            vector<SymtabEntry *> *parameters;   // routine's formal parameters
            vector<SymtabEntry *> *subroutines;  // symtab entries of subroutines
            Object *executable;                  // routine's executable code
        } routine;
    };

    string name;              // identifier name
    Kind kind;                // what kind of identifier
    Symtab   *symtab;         // parent symbol table
    Typespec *typespec;       // type specification
    int slotNumber;           // local variables array slot number
    vector<int> lineNumbers;  // source line numbers
    EntryInfo info;           // entry information

public:
    /**
     * Constructor.
     * @param name the name of the entry.
     * @param kind the kind of entry.
     * @param symTab the symbol table that contains this entry.
     */
    SymtabEntry(const string name, const Kind kind, Symtab *symtab)
        : name(name), kind(kind), symtab(symtab), typespec(nullptr),
          slotNumber(0)
    {
        switch (kind)
        {
            case Kind::CONSTANT:
            case Kind::ENUMERATION_CONSTANT:
            case Kind::VARIABLE:
            case Kind::RECORD_FIELD:
            case Kind::VALUE_PARAMETER:
                info.data.value = nullptr;
                break;

            case Kind::PROGRAM:
            case Kind::PROCEDURE:
            case Kind::FUNCTION:
                info.routine.symtab = nullptr;
                info.routine.parameters  = new vector<SymtabEntry *>();
                info.routine.subroutines = new vector<SymtabEntry *>();
                break;

            default: break;
        }
    }

    /**
     * Destructor.
     */
    virtual ~SymtabEntry() {}

    /**
     * Get the name of the entry.
     * @return the name.
     */
    string getName() const { return name; }

    /**
     * Get the kind of entry.
     * @return the kind.
     */
    Kind getKind() const { return kind; }

    /**
     * Set the kind of entry.
     * @param kind the kind to set.
     */
    void setKind(Kind kind) { this->kind = kind; }

    /**
     * Getter.
     * @return the symbol table that contains this entry.
     */
    Symtab *getSymtab() const { return symtab; }

    /**
     * Get the slot number of the local variables array.
     * @return the number.
     */
    int getSlotNumber() const { return slotNumber; }

    /**
     * Set the slot number of the local variables array.
     * @param slotNumber the number to set.
     */
    void setSlotNumber(int slotNumber) { this->slotNumber = slotNumber; }

    /**
     * Getter.
     * @return the type specification.
     */
    Typespec *getType() const { return typespec; }

    /**
     * Setter.
     * @param typespec the type specification to set.
     */
    void setType(Typespec *typespec) { this->typespec = typespec; }

    /**
     * Getter.
     * @return the list of source line numbers.
     */
    vector<int> *getLineNumbers() { return &lineNumbers; }

    /**
     * Append a source line number to the entry.
     * @param _number the line number to append.
     */
    void appendLineNumber(const int _number)
    {
        lineNumbers.push_back(_number);
    }

    /**
     * Get the data value stored with this entry.
     * @return the data value.
     */
    Object getValue() const { return *(info.data.value); }

    /**
     * Set the data value into this entry.
     * @parm value the value to set.
     */
    void setValue(Object value) { info.data.value = new Object(value); }

    /**
     * Get the routine code.
     * @return the code.
     */
    Routine getRoutineCode() const { return info.routine.code; }

    /**
     * Set the routine code.
     * @parm code the code to set.
     */
    void setRoutineCode(const Routine code) { info.routine.code = code;}

    /**
     * Get the routine's symbol table.
     * @return the symbol table.
     */
    Symtab *getRoutineSymtab() const { return info.routine.symtab; }

    /**
     * Set the routine's symbol table.
     * @parm symtab the symbol table to set.
     */
    void setRoutineSymtab(Symtab *symtab) { info.routine.symtab = symtab; }

    /**
     * Get the vector of symbol table entries of the routine's formal parameters.
     * @return the vector.
     */
    vector<SymtabEntry *> *getRoutineParameters() const
    {
        return info.routine.parameters;
    }

    /**
     * Set the vector symbol table entries of parameters of the routine.
     * @parm parameters the vector to set.
     */
    void setRoutineParameters(vector<SymtabEntry *> *parameters)
    {
        info.routine.parameters = parameters;
    }

    /**
     * Get the vector of symbol table entries of the nested subroutines.
     * @return the vector.
     */
    vector<SymtabEntry *> *getSubroutines() const
    {
        return info.routine.subroutines;
    }

    /**
     * Append to the arraylist of symbol table entries of the nested subroutines.
     * @parm subroutineId the symbol table entry of the subroutine to append.
     */
    void appendSubroutine(SymtabEntry *subroutineId)
    {
        info.routine.subroutines->push_back(subroutineId);
    }

    /**
     * Get the routine's executable code.
     * @return the executable code.
     */
    Object getExecutable() const { return *(info.routine.executable); }

    /**
     * Set the routine's executable code.
     * @parm executable the executable code to set.
     */
    void setExecutable(Object executable)
    {
        info.routine.executable = new Object(executable);
    }
};

}}  // namespace intermediate::symtab

#endif /* SYMTABENTRY_H_ */
