//============================================================================
// Name        : C++_Assignment1_Q4.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Employee{
	int empID;
	string empName;
	double empSalary;
	double grossSalary;
public:
	void setEmployeeId(int empid){

		empID=empid;

	}
	int getEmployeeId(){
		return empID;
	}
	void setEmployeeName(string emp_name){
		empName = emp_name;
	}
	string getEmployeeName(){
		return empName;
	}
	void setEmployeeSalary(double emp_sal){
		empSalary = emp_sal;
	}
	double getEmployeeSalary(){
		return empSalary;
	}

	double calculateGrossSalary(){
		double bonus=0;
		if(empSalary <= 5000){
			bonus = empSalary*0.10;

		}
		else if(empSalary>5000 && empSalary<=10000){
			bonus = empSalary*0.15;

		}
		else if(empSalary>10000){
			bonus = empSalary*0.20;

		}
		grossSalary = empSalary+bonus;
		return grossSalary;
	}
	void displayEmployeeDetails(){
		cout << "\nEmployee ID: "<<empID;
		cout << "\nEmployee Name: "<<empName;
		cout << "\nEmployee Salary: "<<empSalary;
		cout << "\nEmployee Gross Salary: "<<grossSalary;
	}

};

int main() {

	int choice;
	int empID;
	string empName;
	double empSalary;

	Employee e;


	while(choice != 5){
		cout << "\n1. Add a new employee";
		cout << "\n2. Calculate the gross salary for an employee";
		cout << "\n3. Display the employee details";
		cout << "\n4. Update employee information";
		cout << "\n5. Exit the program";

		cout << "\nEnter your choice: ";
		cin >> choice;

		switch(choice){
		case 1:
			cout << "\nEnter Employee ID: ";
			cin >> empID;

			e.setEmployeeId(empID);
			cout << "\nEnter Employee Name: ";
			cin >> empName;
			e.setEmployeeName(empName);
			cout << "\nEnter Employee Salary: ";
			cin >> empSalary;
			e.setEmployeeSalary(empSalary);
			break;
		case 2:
			cout << "\nGross Salary of Employee: ";
			cout << e.calculateGrossSalary();
			break;
		case 3:
			e.calculateGrossSalary();
			e.displayEmployeeDetails();
			break;
		case 4:

		    cout << "\nEnter New Name: ";
		    cin >> empName;
		    e.setEmployeeName(empName);

		    cout << "\nEnter New Salary: ";
		    cin >> empSalary;
		    e.setEmployeeSalary(empSalary);

		    cout << "\nEmployee Updated Successfully!";
		    break;
		case 5:
			return 0;
		}
	}


	return 0;
}
