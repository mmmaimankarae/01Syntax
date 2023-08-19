//foo.cpp
#include "foo.hpp"
#include <iostream>
using namespace std;
void foo::setA(int val) {
    a = val;
}
int foo::getA() {
    return a;
}
void foo::f1() {
    cout << "I am f1" << endl;
}
/*void foo::f3() {
    cout << "I am f3" << endl;
}*/
