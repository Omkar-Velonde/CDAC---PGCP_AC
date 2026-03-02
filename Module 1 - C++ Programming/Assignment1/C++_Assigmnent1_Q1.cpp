//============================================================================
// Name        : C++_Assigmnent1_Q1.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Student{

	string name;
	int rollNumber;
	float marks;
	char grade;
public:
	void setName(string n){
		name=n;
	}

	string getName() const{
		return name;
	}

	void setRollNo(int rn){
		rollNumber=rn;
	}

	int getRollNo()const{
		return rollNumber;
	}

	void setMarks(float m){
		marks=m;
	}

	float getMarks() const{
		return marks;
	}

	void calculateGrade(){
		if(marks>=90 && marks<=100){
			grade = 'A';
		}
		else if(marks<=89 && marks>=80){
			grade = 'B';
		}
		else if(marks<=79 && marks>=70){
			grade = 'C';
		}
		else if(marks<=69 && marks>=60){
			grade = 'E';
		}
		else{
			grade = 'F';
		}
	}
	char getGrade() const{
		return grade;
	}

};

int main() {
	/*
	 * 1. Accept Information
2. Display information
3. Calculate Grade
4. Exit the program.
	 */
	string a;
	int b;
	int c;
	Student s1;


	for(int i=0; i<=100; i++){

	cout << "1. Accept Information"<<endl;
	cout << "2. Display Information"<<endl;
	cout << "3. Calculate Grade"<<endl;
	cout << "4. Exit the Program"<<endl;
/*
	cout << "Name: "<<s1.getName()<<endl;
	cout << "Roll No: "<<s1.getRollNo()<<endl;
	cout << "Marks: "<<s1.getMarks()<<endl;
	cout << "Grade: "<<s1.getGrade()<<endl;*/
	int menu;
	cout << "Enter your choice: ";
	cin >> menu;

	switch(menu){
	case 1:
		cout << "\nEnter name: ";
		cin >> a;
		cout << "\nEnter Roll Number: ";
		cin >> b;
		cout << "\nEnter Marks: ";
		cin >> c;
		cout << "\nInformation accepted\n";
		s1.setName(a);
		s1.setRollNo(b);
		s1.setMarks(c);
		s1.calculateGrade();

		break;

	case 2:
		cout << "Name: "<<s1.getName()<<endl;
		cout << "Roll No: "<<s1.getRollNo()<<endl;
		cout << "Marks: "<<s1.getMarks()<<endl;
		break;

	case 3:
		cout << "Grade: "<<s1.getGrade()<<endl;
		break;

	case 4:
		return 0;
	}
	}


	return 0;
}


