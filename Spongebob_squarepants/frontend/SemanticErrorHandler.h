#ifndef SEMANTICERRORHANDLER_H_
#define SEMANTICERRORHANDLER_H_

#include <string>
#include <map>

#include "antlr4-runtime.h"

namespace frontend {

using namespace std;

/**
 * Semantic error codes.
 */
enum class Error
{
    UNDECLARED_IDENTIFIER,
    REDECLARED_IDENTIFIER,
    INVALID_CONSTANT,
    INVALID_SIGN,
    INVALID_TYPE,
    INVALID_VARIABLE,
    TYPE_MISMATCH,
    TYPE_MUST_BE_INTEGER,
    TYPE_MUST_BE_NUMERIC,
    TYPE_MUST_BE_BOOLEAN,
    INCOMPATIBLE_ASSIGNMENT,
    INCOMPATIBLE_COMPARISON,
    INVALID_CONTROL_VARIABLE,
    DUPLICATE_CASE_CONSTANT,
    NAME_MUST_BE_PROCEDURE,
    NAME_MUST_BE_FUNCTION,
    ARGUMENT_COUNT_MISMATCH,
    ARGUMENT_MUST_BE_VARIABLE,
    INVALID_REFERENCE_PARAMETER,
    INVALID_RETURN_TYPE,
    TOO_MANY_SUBSCRIPTS,
    INVALID_FIELD
};

constexpr Error UNDECLARED_IDENTIFIER       = Error::UNDECLARED_IDENTIFIER;
constexpr Error REDECLARED_IDENTIFIER       = Error::REDECLARED_IDENTIFIER;
constexpr Error INVALID_CONSTANT            = Error::INVALID_CONSTANT;
constexpr Error INVALID_SIGN                = Error::INVALID_SIGN;
constexpr Error INVALID_TYPE                = Error::INVALID_TYPE;
constexpr Error INVALID_VARIABLE            = Error::INVALID_VARIABLE;
constexpr Error TYPE_MISMATCH               = Error::TYPE_MISMATCH;
constexpr Error TYPE_MUST_BE_INTEGER        = Error::TYPE_MUST_BE_INTEGER;
constexpr Error TYPE_MUST_BE_NUMERIC        = Error::TYPE_MUST_BE_NUMERIC;
constexpr Error TYPE_MUST_BE_BOOLEAN        = Error::TYPE_MUST_BE_BOOLEAN;
constexpr Error INCOMPATIBLE_ASSIGNMENT     = Error::INCOMPATIBLE_ASSIGNMENT;
constexpr Error INCOMPATIBLE_COMPARISON     = Error::INCOMPATIBLE_COMPARISON;
constexpr Error INVALID_CONTROL_VARIABLE    = Error::INVALID_CONTROL_VARIABLE;
constexpr Error DUPLICATE_CASE_CONSTANT     = Error::DUPLICATE_CASE_CONSTANT;
constexpr Error NAME_MUST_BE_PROCEDURE      = Error::NAME_MUST_BE_PROCEDURE;
constexpr Error NAME_MUST_BE_FUNCTION       = Error::NAME_MUST_BE_FUNCTION;
constexpr Error ARGUMENT_COUNT_MISMATCH     = Error::ARGUMENT_COUNT_MISMATCH;
constexpr Error ARGUMENT_MUST_BE_VARIABLE   = Error::ARGUMENT_MUST_BE_VARIABLE;
constexpr Error INVALID_REFERENCE_PARAMETER = Error::INVALID_REFERENCE_PARAMETER;
constexpr Error INVALID_RETURN_TYPE         = Error::INVALID_RETURN_TYPE;
constexpr Error TOO_MANY_SUBSCRIPTS         = Error::TOO_MANY_SUBSCRIPTS;
constexpr Error INVALID_FIELD               = Error::INVALID_FIELD;

class SemanticErrorHandler
{
private:
    int  count;
    bool first;
    map<Error, string> SEMANTIC_ERROR_MESSAGES;

public:
    SemanticErrorHandler() : count(0), first(true)
    {
        SEMANTIC_ERROR_MESSAGES[UNDECLARED_IDENTIFIER] =
                "Undeclared identifier";
        SEMANTIC_ERROR_MESSAGES[REDECLARED_IDENTIFIER] =
                "Redeclared identifier";
        SEMANTIC_ERROR_MESSAGES[INVALID_CONSTANT] =
                "Invalid constant";
        SEMANTIC_ERROR_MESSAGES[INVALID_SIGN] =
                "Invalid sign";
        SEMANTIC_ERROR_MESSAGES[INVALID_TYPE] =
                "Mismatched datatype";
        SEMANTIC_ERROR_MESSAGES[INVALID_VARIABLE] =
                "Invalid variable";
        SEMANTIC_ERROR_MESSAGES[TYPE_MISMATCH] =
                "Invalid type";
        SEMANTIC_ERROR_MESSAGES[TYPE_MUST_BE_INTEGER] =
                "Datatype must be integer";
        SEMANTIC_ERROR_MESSAGES[TYPE_MUST_BE_NUMERIC] =
                "Datatype must be integer or real";
        SEMANTIC_ERROR_MESSAGES[TYPE_MUST_BE_BOOLEAN] =
                "Datatype must be boolean";
        SEMANTIC_ERROR_MESSAGES[INCOMPATIBLE_ASSIGNMENT] =
                "Incompatible assignment";
        SEMANTIC_ERROR_MESSAGES[INCOMPATIBLE_COMPARISON] =
                "Incompatible comparison";
        SEMANTIC_ERROR_MESSAGES[DUPLICATE_CASE_CONSTANT] =
                "Duplicate CASE constant";
        SEMANTIC_ERROR_MESSAGES[INVALID_CONTROL_VARIABLE] =
                "Invalid control variable datatype";
        SEMANTIC_ERROR_MESSAGES[NAME_MUST_BE_PROCEDURE] =
                "Must be a procedure name";
        SEMANTIC_ERROR_MESSAGES[NAME_MUST_BE_FUNCTION] =
                "Must be a function name";
        SEMANTIC_ERROR_MESSAGES[ARGUMENT_COUNT_MISMATCH] =
                "Invalid number of arguments";
        SEMANTIC_ERROR_MESSAGES[ARGUMENT_MUST_BE_VARIABLE] =
                "Argument must be a variable";
        SEMANTIC_ERROR_MESSAGES[INVALID_REFERENCE_PARAMETER] =
                "Reference parameter cannot be scalar";
        SEMANTIC_ERROR_MESSAGES[INVALID_RETURN_TYPE] =
                "Invalid function return type";
        SEMANTIC_ERROR_MESSAGES[TOO_MANY_SUBSCRIPTS] =
                "Too many subscripts";
        SEMANTIC_ERROR_MESSAGES[INVALID_FIELD] =
                "Invalid field";
    }

    int getCount() const { return count; }

    void flag(Error error, int lineNumber, string text)
    {
        if (first)
        {
            cout << endl;
            cout << "===== SEMANTIC ERRORS =====" << endl << endl;
            printf("%-4s %-40s %s\n", "Line", "Message", "Found near");
            printf("%-4s %-40s %s\n", "----", "-------", "----------");

            first = false;
        }

        count++;

        printf("%03d  %-40s \"%s\"\n", lineNumber,
                                       SEMANTIC_ERROR_MESSAGES[error].c_str(),
                                       text.c_str());
    }

    void flag(Error error, antlr4::ParserRuleContext *ctx)
    {
        flag(error, ctx->getStart()->getLine(), ctx->getText());
    }
};

} // namespace frontend

#endif /* SEMANTICERRORHANDLER_H_ */
