//============================================================================
// Name        : CppAssignmentQ2.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================
/*
 * Q2. Type Size Explorer
Write a C program that prints the size in bytes of each of the following types using sizeof:
short int, int, long int, long long int, unsigned int, float, double, long double, char
Then answer in a comment inside your code:
Which two types have the same size on your machine? Does unsigned int have a dierent size than int?
 */
#include <iostream>
using namespace std;

int main() {
	short int a;
	cout << "Size of short int: " << sizeof(a) <<endl;

	int b;
	cout << "Size of int: " << sizeof(b) <<endl;

	long int c;
	cout << "Size of long int: " << sizeof(c) <<endl;

	long long int d;
	cout << "Size of long long int: " << sizeof(d) <<endl;

	unsigned int e;
	cout << "Size of unsigned int: " << sizeof(e) <<endl;

	float f;
	cout << "Size of float: " << sizeof(f) <<endl;

	double g;
	cout << "Size of double: " << sizeof(g) <<endl;

	long double h;
	cout << "Size of long double: " << sizeof(h) <<endl;

	char i;
	cout << "Size of double: " << sizeof(i) <<endl;

	/*
	 * Which two types have the same size on your machine?
	 * Size of short int: 2
      Size of int: 4
      Size of long int: 4
      Size of long long int: 8
      Size of unsigned int: 4
      Size of float: 4
      Size of double: 8
      Size of long double: 12
      Size of double: 1
	 *
	 *
	 * Does unsigned int have a dierent size than int?
	 * No, both have same size which is 4 bytes.
	 */
	return 0;
}
