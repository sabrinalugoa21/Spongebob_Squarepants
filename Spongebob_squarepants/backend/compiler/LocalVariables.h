/**
 * <h1>LocalVariables</h1>
 *
 * <p>Keep track of the use of slots in a local variables array.</p>
 *
 * <p>Copyright (c) 2020 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
#ifndef LOCALVARIABLES_H_
#define LOCALVARIABLES_H_

#include <vector>

namespace backend { namespace compiler {

using namespace std;

class LocalVariables
{
public:
    /**
     * Constructor.
     * @param index initially reserve local variables 0 through index.
     */
    LocalVariables(int index)
    {
        for (int i = 0; i <= index; ++i)
        {
            reserved.push_back(true);
        }
    }

    /**
     * Reserve a local variable.
     * @return the index of the newly reserved variable.
     */
    int reserve()
    {
        // Search for existing but unreserved local variables.
        for (int i = 0; i < reserved.size(); ++i)
        {
            if (!reserved[i])
            {
                reserved[i] = true;
                return i;
            }
        }

        // Reserved a new variable.
        reserved.push_back(true);
        return reserved.size() - 1;
    }

    /**
     * Release a local variable that's no longer needed.
     * @param index the index of the variable.
     */
    void release(int index) { reserved[index] = false; }

    /**
     * Return the count of local variables needed by the method.
     * @return the count.
     */
    int count() const { return reserved.size(); }

private:
    // List of booleans to keep track of reserved local variables. The ith
    // element is true if the ith variable is being used, else it is false.
    // The final size of the list is the total number of local variables
    // used by the method.
    vector<bool> reserved;
};

}}  // namespace backend::compiler

#endif /* LOCALVARIABLES_H_ */
