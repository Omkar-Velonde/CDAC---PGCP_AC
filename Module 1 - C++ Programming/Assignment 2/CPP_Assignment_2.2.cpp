//============================================================================
// Name        : 2.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void swapByValue(int a, int b){
	int temp=a;
	a=b;
	b=temp;
}
void swapByAddress(int *a, int *b){
	int temp=*a;
	*a=*b;
	*b=temp;
}
void swapByReference(int &a, int &b){
	int temp=a;
	a=b;
	b=temp;
}

int main() {
	int a=10;
	int b=20;
	cout<<"Original Values: "<<"a: "<<a<<"  "<<"b: "<<b<<endl;
	swapByValue(a,b);
	cout<<"Swap By Value: "<<"a: "<<a<<"  "<<"b: "<<b<<endl;
	swapByAddress(&a,&b);
	cout<<"Swap By Address Values: "<<"a: "<<a<<"  "<<"b: "<<b<<endl;
	swapByReference(a,b);
	cout<<"Swap By Reference Values: "<<"a: "<<a<<"  "<<"b: "<<b<<endl;
	return 0;
}
