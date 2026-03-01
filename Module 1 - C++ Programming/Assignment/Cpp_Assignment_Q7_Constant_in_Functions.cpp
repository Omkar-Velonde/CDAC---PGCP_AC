//============================================================================
// Name        : Cpp_Assignment_Q7_Constant_in_Functions.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================
/*
 * Q7. const Constant in Functions
Write two C++ functions that use a const float PI = 3.14159f declared at the global scope:
float circleArea(float radius) — returns area of a circle.
float circlePerimeter(float radius) — returns circumference.
In main(), call both with radius = 7.0 and print results to 4 decimal places.
Additionally, add this line inside main() and describe what happens when you compile:
PI = 3.0f; // attempt to modify const
Do not delete the line — comment it out after observing the error and write the compiler error message as a
comment beside it.
 */

#include <iostream>
using namespace std;

const float PI = 3.14159f;
float circleArea(float radius){
	float area;
	return area = PI*(radius*radius);
}
float circlePerimeter(float radius){
	float perimeter;
	return perimeter = 2*PI*(radius);
}
int main() {
	//PI = 3.0f; //error: read only variable PI
	float r = 7.0;
	float area = circleArea(r);
	float perimeter = circlePerimeter(r);

	cout<<"Area of Circle: "<<area<<endl;
	cout<<"Perimeter of Circle: "<<perimeter<<endl;
	return 0;
}
