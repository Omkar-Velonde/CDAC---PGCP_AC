//============================================================================
// Name        : C++_Assignment3_Q6.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Vector {
private:
    int *arr;
    int size;

public:
    Vector(int s) {
        size = s;
        arr = new int[size];
    }

    int& operator[](int index) {
        return arr[index];
    }

    int operator()() {
        int sum = 0;
        for(int i = 0; i < size; i++)
            sum += arr[i];
        return sum;
    }
};

int main() {

    Vector v(5);

    for(int i = 0; i < 5; i++)
        v[i] = i * 10;

    v[2] = 50;

    cout << v() << endl;

    return 0;
}
