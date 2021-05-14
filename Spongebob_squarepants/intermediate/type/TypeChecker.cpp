/**
 * <h1>TypeChecker</h1>
 *
 * <p>Perform type checking.</p>
 *
 * <p>Copyright (c) 2020 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
#include "intermediate/symtab/Predefined.h"
#include "TypeChecker.h"
#include "Typespec.h"

namespace intermediate { namespace type {

using namespace std;
using namespace intermediate::symtab;
using namespace intermediate::type;

bool TypeChecker::isInteger(Typespec *typespec)
{
    return    (typespec != nullptr)
           && (typespec->baseType() == Predefined::integerType);
}

bool TypeChecker::areBothInteger(Typespec *typespec1, Typespec *typespec2)
{
    return isInteger(typespec1) && isInteger(typespec2);
}

bool TypeChecker::isReal(Typespec *typespec)
{
    return    (typespec != nullptr)
           && (typespec->baseType() == Predefined::realType);
}

bool TypeChecker::isIntegerOrReal(Typespec *typespec)
{
    return isInteger(typespec) || isReal(typespec);
}

bool TypeChecker::isAtLeastOneReal(Typespec *typespec1, Typespec *typespec2)
{
    return (isReal(typespec1) && isReal(typespec2)) ||
           (isReal(typespec1) && isInteger(typespec2)) ||
           (isInteger(typespec1) && isReal(typespec2));
}

bool TypeChecker::isBoolean(Typespec *typespec)
{
    return    (typespec != nullptr)
           && (typespec->baseType() == Predefined::booleanType);
}

bool TypeChecker::areBothBoolean(Typespec *typespec1, Typespec *typespec2)
{
    return isBoolean(typespec1) && isBoolean(typespec2);
}

bool TypeChecker::isChar(Typespec *typespec)
{
    return    (typespec != nullptr)
           && (typespec->baseType() == Predefined::charType);
}

bool TypeChecker::isString(Typespec *typespec)
{
    return    (typespec != nullptr)
           && (typespec->baseType() == Predefined::stringType);
}

bool TypeChecker::areBothString(Typespec *typespec1, Typespec *typespec2)
{
    return isString(typespec1) && isString(typespec2);
}

bool TypeChecker::areAssignmentCompatible(Typespec *targetType,
                                          Typespec *valueType)
{
    if ((targetType == nullptr) || (valueType == nullptr)) return false;

    targetType = targetType->baseType();
    valueType  = valueType->baseType();

    bool compatible = false;

    // Identical types.
    if (targetType == valueType) compatible = true;

    // real := integer
    else if (isReal(targetType) && isInteger(valueType)) compatible = true;

    return compatible;
}

bool TypeChecker::areComparisonCompatible(Typespec *type1,
                                          Typespec *type2)
{
    if ((type1 == nullptr) || (type2 == nullptr))  return false;

    type1 = type1->baseType();
    type2 = type2->baseType();
    Form form = type1->getForm();

    bool compatible = false;

    // Two identical scalar or enumeration types.
    if (   (type1 == type2)
        && ((form == SCALAR) || (form == ENUMERATION)))
    {
        compatible = true;
    }

    // One integer and one real.
    else if (isAtLeastOneReal(type1, type2)) compatible = true;

    return compatible;
}

}}  // namespace :intermediate::typ
