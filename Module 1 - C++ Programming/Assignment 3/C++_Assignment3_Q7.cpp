//============================================================================
// Name        : C++_Assignment3_Q7.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cstring>
using namespace std;

class String {
private:
    char *str;

public:
    String() {
        str = new char[1];
        str[0] = '\0';
    }

    String(const char *s) {
        str = new char[strlen(s) + 1];
        strcpy(str, s);
    }

    String(const String &s) {
        str = new char[strlen(s.str) + 1];
        strcpy(str, s.str);
    }

    ~String() {
        delete[] str;
    }

    String& operator=(const String &s) {
        if (this != &s) {
            delete[] str;
            str = new char[strlen(s.str) + 1];
            strcpy(str, s.str);
        }
        return *this;
    }

    String operator+(const String &s) {
        String temp;
        delete[] temp.str;
        temp.str = new char[strlen(str) + strlen(s.str) + 1];
        strcpy(temp.str, str);
        strcat(temp.str, s.str);
        return temp;
    }

    friend ostream& operator<<(ostream &out, const String &s);
    friend istream& operator>>(istream &in, String &s);
};

ostream& operator<<(ostream &out, const String &s) {
    out << s.str;
    return out;
}

istream& operator>>(istream &in, String &s) {
    char temp[100];
    in >> temp;
    delete[] s.str;
    s.str = new char[strlen(temp) + 1];
    strcpy(s.str, temp);
    return in;
}

int main() {

    String s1, s2, s3;

    cout << "Enter first string: ";
    cin >> s1;

    cout << "Enter second string: ";
    cin >> s2;

    s3 = s1 + s2;

    cout << "s1: " << s1 << endl;
    cout << "s2: " << s2 << endl;
    cout << "s3: " << s3 << endl;

    return 0;
}
