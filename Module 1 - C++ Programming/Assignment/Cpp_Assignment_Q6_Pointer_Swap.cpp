//============================================================================
// Name        : Cpp_Assignment_Q6_Pointer_Swap.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================
/*
 * Q6. Pointer Swap
Declare three integer variables: x = 10, y = 20, z = 30.
Create three pointers px, py, pz pointing to them.
Using only pointer dereferencing (no direct use of x, y, z after declaration):
Swap the values of x and z.
Print all three variables before and after the swap.
Also print the addresses stored in each pointer to conËrm they did not change.
 */


#include <iostream>
using namespace std;

int main() {
	int x=10;
	int y=20;
	int z=30;

	int *px=&x;
	int *py=&y;
	int *pz=&z;

	cout<<"x = "<<*px<<"\ny = "<<*py<<"\nz = "<<*pz<<endl;
	cout<<"Address of x: "<<px<<endl;
	cout<<"Address of y: "<<py<<endl;
	cout<<"Address of z: "<<pz<<endl;

	int temp = *px;
	*px = *pz;
	*pz = temp;

	cout<<"x = "<<*px<<"\ny = "<<*py<<"\nz = "<<*pz<<endl;
	cout<<"Address of x: "<<px<<endl;
	cout<<"Address of y: "<<py<<endl;
	cout<<"Address of z: "<<pz<<endl;

	return 0;
}
