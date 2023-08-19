//bar.cpp
#include "bar.hpp"
#include <iostream>
using namespace std;
void bar::f2() {
    f1();
    cout << "I am f2" << endl;
}
void bar::f3() {
    cout << "I am f3" << endl;
}