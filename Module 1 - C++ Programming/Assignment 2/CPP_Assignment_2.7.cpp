//============================================================================
// Name        : 7.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Employee{
	const int employeeId;
	string name;
	float salary;

public:
	Employee(int e_id, string n, float s) : employeeId(e_id), name(n), salary(s){
		cout<<"value initialized using initializer list"<<endl;
	}

	void display() const{
		cout<<"Employee Id: "<<employeeId<<endl;
		cout<<"Employee Name: "<<name<<endl;
		cout<<"Employee Salary: "<<salary<<endl;
	}
};

int main() {
	Employee e(10, "Omkar", 20000);
	e.display();
	return 0;
}
