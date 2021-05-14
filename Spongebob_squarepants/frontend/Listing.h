#ifndef LISTING_H_
#define LISTING_H_

#include <iostream>
#include <fstream>
#include <iomanip>
#include <string>

namespace frontend {

using namespace std;

class Listing
{
public:
    Listing(string sourceFileName);
    virtual ~Listing() {}
};

inline Listing::Listing(string sourceFileName)
{
    ifstream ifs(sourceFileName);

    if (ifs.fail())
    {
        cout << "ERROR: Failed to open source file \""
             << sourceFileName << "\"." << endl;
        exit(-1);
    }

    int lineNumber = 0;
    string line;

    while (getline(ifs, line))
    {
        cout << setw(3) << setfill('0') << ++lineNumber
             << " " << line << endl;
    }

    ifs.close();
}

} // namespace frontend


#endif /* LISTING_H_ */
