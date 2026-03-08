//============================================================================
// Name        : C++_Assignment3_Q5.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Inspector;

class Number {
private:
    int value;

public:
    Number(int v = 0) {
        value = v;
    }

    Number& operator++() {
        ++value;
        return *this;
    }

    Number operator++(int) {
        Number temp = *this;
        value++;
        return temp;
    }

    Number& operator=(const Number &n) {
        value = n.value;
        return *this;
    }

    friend bool operator>(Number n1, Number n2);
    friend class Inspector;
};

bool operator>(Number n1, Number n2) {
    return n1.value > n2.value;
}

class Inspector {
public:
    void show(Number n) {
        cout << n.value << endl;
    }
};

int main() {

    Number n1(5), n2(10), n3;
    Inspector ins;

    cout << "n1 = "; ins.show(n1);
    cout << "n2 = "; ins.show(n2);

    ++n1;
    cout << "After ++n1 : "; ins.show(n1);

    n1++;
    cout << "After n1++ : "; ins.show(n1);

    n3 = n1;
    cout << "n3 = "; ins.show(n3);

    if(n1 > n2)
        cout << "n1 greater\n";
    else
        cout << "n2 greater\n";

    return 0;
}
