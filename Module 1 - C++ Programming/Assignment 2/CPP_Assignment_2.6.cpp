//============================================================================
// Name        : 6.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Student{
	int rollNo;
	string name;
	float marks;
public:
	Student(){
		rollNo=0;
		name="not initialized";
		marks=0.0;
	}

	Student(int rn, string n, float m){
		rollNo=rn;
		name=n;
		marks=m;
	}

	Student(int rollNo, string name, float marks, int a){
		this->rollNo=rollNo;
		this->name=name;
		this->marks=marks;
	}

	int printDetails(){
		cout<<"\nRoll Number: "<<rollNo<<endl;
		cout<<"Name: "<<name<<endl;
		cout<<"Marks: "<<marks<<endl;
		return 0;
	}
};

int main() {
	Student s1;

	Student s2(10, "Omkar", 84);
	Student s3(11, "omkarcv", 86.46,1);

	cout<<"Default Constructor: "<<endl;
	s1.printDetails();

	cout<<"Parameterized constructor"<<endl;
	s2.printDetails();

	cout<<"Parameterized constructor with this pointer"<<endl;
	s3.printDetails();

	return 0;
}
