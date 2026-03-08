//============================================================================
// Name        : C++_Assignment3_Q1.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Employee{
	int id;
	string name;

public:
	mutable int accessCount;

	Employee(int i, string n){
		id = i;
		name = n;
		accessCount=0;
	}

	Employee(const Employee &e){
		id=e.id;
		name=e.name;
		accessCount=e.accessCount;
		cout<<"user defined copy constructor"<<endl;
	}

	const void display(){
		accessCount++;
		cout<<"Id: "<<id<<endl;
		cout<<"Name: "<<name<<endl;
		cout<<"accessCount: "<<accessCount<<endl;
	}

};

int main() {
	Employee e1(101, "Omkar");
	e1.display();
	e1.display();
	e1.display();

	Employee e2=e1;
	cout<<"After copying e2 from e1: "<<endl;
	e2.display();

	cout<<"Again e1"<<endl;
	e1.display();


	return 0;
}
