/**
 * <h1>Directive</h1>
 *
 * <p>Jasmin directives.</p>
 *
 * <p>Copyright (c) 2020 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
#ifndef DIRECTIVE_H_
#define DIRECTIVE_H_

#include "../../Object.h"

namespace backend { namespace compiler {

using namespace std;

enum class Directive
{
    CLASS_PUBLIC,
    END_CLASS,
    SUPER,
    FIELD,
    FIELD_PRIVATE_STATIC,
    METHOD_PUBLIC,
    METHOD_STATIC,
    METHOD_PUBLIC_STATIC,
    METHOD_PRIVATE_STATIC,
    END_METHOD,
    LIMIT_LOCALS,
    LIMIT_STACK,
    VAR,
    LINE,
};

static const string DIRECTIVE_STRINGS[] =
{
    ".class public",
    ".end class",
    ".super",
    ".field",
    ".field private static",
    ".method public",
    ".method static",
    ".method public static",
    ".method private static",
    ".end method",
    ".limit locals",
    ".limit stack",
    ".var",
    ".line",
};

constexpr Directive CLASS_PUBLIC          = Directive::CLASS_PUBLIC;
constexpr Directive END_CLASS             = Directive::END_CLASS;
constexpr Directive SUPER                 = Directive::SUPER;
constexpr Directive FIELD                 = Directive::FIELD;
constexpr Directive FIELD_PRIVATE_STATIC  = Directive::FIELD_PRIVATE_STATIC;
constexpr Directive METHOD_PUBLIC         = Directive::METHOD_PUBLIC;
constexpr Directive METHOD_STATIC         = Directive::METHOD_STATIC;
constexpr Directive METHOD_PUBLIC_STATIC  = Directive::METHOD_PUBLIC_STATIC;
constexpr Directive METHOD_PRIVATE_STATIC = Directive::METHOD_PRIVATE_STATIC;
constexpr Directive END_METHOD            = Directive::END_METHOD;
constexpr Directive LIMIT_LOCALS          = Directive::LIMIT_LOCALS;
constexpr Directive LIMIT_STACK           = Directive::LIMIT_STACK;
constexpr Directive VAR                   = Directive::VAR;
constexpr Directive LINE                  = Directive::LINE;

inline ostream& operator << (ostream& ofs, const Directive& directive)
{
    ofs << toLowerCase(DIRECTIVE_STRINGS[static_cast<int>(directive)]);
    return ofs;
}

}}  // namespace wci::backend::compiler

#endif /* DIRECTIVE_H_ */
