#ifndef BACKEND_SYNTAXERRORHANDLER_H_
#define BACKEND_SYNTAXERRORHANDLER_H_

#include "BaseErrorListener.h"

namespace frontend {

using namespace std;
using namespace antlr4;

class SyntaxErrorHandler : public BaseErrorListener
{
private:
    int  count;
    bool first;

public:
    SyntaxErrorHandler() : count(0), first(true) {}

    int getCount() const { return count; }

    void syntaxError(Recognizer *recognizer, Token *offendingSymbol,
                     size_t line, size_t charPositionInLine,
                     const std::string &msg, std::exception_ptr e) override
    {
        if (first)
        {
            cout << "\n\n===== SYNTAX ERRORS =====" << endl << endl;
            printf("%-4s %-35s\n", "Line", "Message");
            printf("%-4s %-35s\n", "----", "-------");

            first = false;
        }

        count++;
        printf("%03zu  %-35s\n", line, msg.c_str());
    }
};

} // namespace frontend

#endif /* BACKEND_SYNTAXERRORHANDLER_H_ */
