/**
 * <h1>Label</h1>
 *
 * <p>Jasmin instruction label.</p>
 *
 * <p>Copyright (c) 2020 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
#ifndef LABEL_H_
#define LABEL_H_

#include <sstream>
#include <iomanip>
#include <string>

namespace backend { namespace compiler {

using namespace std;

class Label
{
private:
    static int index;  // index for generating label strings
    string label;      // the label string

public:
    /**
     * Constructor.
     */
    Label()
    {
        stringstream ss;
        ss << setw(3) << setfill('0') << ++index;
        label = "L" + ss.str();
    }

    /**
     * Getter.
     * @return the label's string.
     */
    string getString() const { return label; }

    /**
     * Print a label string.
     */
    friend ostream& operator << (ostream& ofs, const Label *label);
};

inline ostream& operator << (ostream& ofs, const Label *label)
{
    ofs << label->getString();
    return ofs;
}

}}  // namespace backend::compiler

#endif /* LABEL_H_ */
