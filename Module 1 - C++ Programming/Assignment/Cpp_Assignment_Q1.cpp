//============================================================================
// Name        : CppAssignment.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

/*
 * Q1. Grade Calculator
A student appeared in 5 subjects. Store the marks of each subject as a float. Compute the total and
percentage. Use the ternary operator (no if-else allowed) to determine and print the grade according to
the table below. */
/*
Percentage Grade
>= 75 A
>= 60 B
>= 45 C
< 45 Fail
 */

#include <iostream>
using namespace std;

int main() {
	/*
	float s1 = 77.9;
	float s2 = 89.67;
	float s3 = 76.31;
	float s4 = 91.34;
	float s5 = 93.10;
	*/

	float s1;
	float s2;
	float s3;
	float s4;
	float s5;
	cout << "Enter Subject1 marks: " << endl;
	cin >> s1;
	cout << "Enter Subject2 marks: " << endl;
	cin >> s2;
	cout << "Enter Subject3 marks: " << endl;
	cin >> s3;
	cout << "Enter Subject4 marks: " << endl;
	cin >> s4;
	cout << "Enter Subject5 marks: " << endl;
	cin >> s5;


	float total = s1+s2+s3+s4+s5;
	float percentage = total/5;

	cout << "Total: "<< total << endl;
	cout << "Percentage: " << percentage <<"%"<< endl;

	string grade = (percentage>=75) ? "A" :
			(percentage>=60) ? "B" :
			(percentage>=45) ? "C" : "Fail";
	cout << "Grade: "<< grade << endl;

	return 0;
}
