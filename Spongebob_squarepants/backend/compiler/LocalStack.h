/**
 * <h1>LocalStack</h1>
 *
 * <p>Compute the local runtime stack size.</p>
 *
 * <p>Copyright (c) 2020 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
#ifndef LOCALSTACK_H_
#define LOCALSTACK_H_

#include <algorithm>

namespace backend { namespace compiler {

using namespace std;

class LocalStack
{
private:
    int size;     // current stack size
    int maxSize;  // maximum attained stack size

public:
    /**
     * Constructor
     */
    LocalStack() : size(0), maxSize(0) {}

    /**
     * Reset the state of the local stack.
     */
    void reset()
    {
        this->size = 0;
        this->maxSize = 0;
    }

    /**
     * Getter
     * @return the current stack size.
     */
    int getSize() const { return size; }

    /**
     * Increase the stack size by a given amount.
     * @param amount the amount to increase.
     */
    void increase(const int amount)
    {
        size += amount;
        maxSize = max(maxSize, size);
    }

    /**
     * Decrease the stack size by a given amount.
     * @param amount the amount to decrease.
     */
    void decrease(const int amount)
    {
        size -= amount;
        if (size < 0) size = 0;
    }

    /**
     * Return the maximum attained stack size.
     * @return the maximum size.
     */
    int capacity() const { return maxSize; }
};

}}  // namespace backend::compiler

#endif /* LOCALSTACK_H_ */
