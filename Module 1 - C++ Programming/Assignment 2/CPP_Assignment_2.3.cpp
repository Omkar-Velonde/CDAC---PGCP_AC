//============================================================================
// Name        : 3.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
	int a=10;
	cout<<"Initial value of x: "<<a<<endl;
	int* ptr=&a;
	int &ref=a;

	*ptr=20;
	cout<<"After modifying using pointer: "<<a<<endl;

	ref=30;
	cout<<"After modifying using reference: "<<a<<endl;
	return 0;
}
