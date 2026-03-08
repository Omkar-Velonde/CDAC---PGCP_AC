//============================================================================
// Name        : C++_Assignment3_Q2.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <fstream>
using namespace std;

class Student{
	int roll;
	string name;
	int marks;
public:
	Student(int r=0, string n="", int m=0){
		roll=r;
		name=n;
		marks=m;
		cout<<"Parameterized constructor"<<endl;
	}
	void getData(){
		cout<<"Enter Roll No: "<<endl;
		cin>>roll;
		cout<<"Enter name: "<<endl;
		cin>>name;
		cout<<"Enter marks: "<<endl;
		cin>>marks;
	}
	void writeToFile(ofstream &out){
		out <<roll<<" "<<name<<" "<<marks<<endl;
	}

	~Student(){
		cout<<"Destroying Student"<<endl;
	}
};

int main() {
	Student s[3];
	for(int i=0; i<3; i++){
		cout<<"Enter Student details: "<<endl;
		s[i].getData();
	}
	ofstream ofs("student.txt");
	for(int i=0; i<3; i++){
		s[i].writeToFile(ofs);
	}

	ofs.close();

	ifstream ifs("student.txt");

	int roll;
	string name;
	int marks;

	cout<<"Details"<<endl;
	while(ifs >> roll >> name >> marks){
		cout<<"Roll No: "<<roll<<" name: "<<name<<" marks: "<<marks<<endl;
	}
	ifs.close();
	return 0;
}
