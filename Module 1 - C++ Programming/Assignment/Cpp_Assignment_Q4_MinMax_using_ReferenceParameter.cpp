//============================================================================
// Name        : Cpp_Assignment_Q4_MinMax_using_ReferenceParameter.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================
/*
 * Q4. Min-Max via Reference Parameters
Write a C++ function:
void findMinMax(int a, int b, int c, int &minVal, int &maxVal);
The function must Ënd the minimum and maximum of three integers without using any library function
and store the results into minVal and maxVal through reference parameters.
In main(), declare two variables int lo, hi, pass them to findMinMax, and print the results. Verify that
the original variables lo and hi are updated after the call.
 */


#include <iostream>
using namespace std;

void findMinMax(int a, int b, int c, int &minVal, int &maxVal);

int main() {

	int x = 8;
	int y = 5;
	int z = 9;
	int lo;
	int hi;
	findMinMax(x,y,z,lo,hi);
	cout << "Minimum Value: "<< lo << endl;
	cout << "Maximum Value: "<< hi << endl;
	return 0;
}

void findMinMax(int a, int b, int c, int &minVal, int &maxVal){
	minVal = a;
	if(b<minVal){
		minVal=b;
	}
	else if(c<minVal){
		minVal=c;
	}

	maxVal = a;
	if(b>maxVal){
		maxVal=b;
	}
	else if(c>maxVal){
		maxVal=c;
	}
}
