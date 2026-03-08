//============================================================================
// Name        : C++_Assignment3_Q4.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class DivideByZero{
public:
	string message(){
		return "Error: Division by zero.";
	}
	int divide(int a, int b) throw(DivideByZero){
		if(b==0){
			throw DivideByZero();
		}

		return a/b;
	}
};


int main() {
	int num1, num2, result;
	DivideByZero dbz;
	cout<<"Enter two numbers: "<<endl;
	cin>>num1>>num2;

	try{
		try{
			result=dbz.divide(num1,num2);
			cout<<"Result: "<<result<<endl;
		}catch(DivideByZero e){
			cout<<"Inside inner catch"<<endl;
			throw;
		}

	}catch(DivideByZero e){
		cout<<"Handled in outer catch"<<endl;
		cout<<e.message();
	}
	return 0;
}
