//============================================================================
// Name        : 5.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
	int* arr=(int*) malloc(5 * sizeof(int));
	cout<<"Enter 5 numbers: "<<endl;
	for(int i=0; i<5; i++){
		cin>>arr[i];
	}
	cout<<"Entered number: "<<endl;
	for(int i=0; i<5; i++){
		cout<<arr[i]<<" ";
	}
	free(arr);
	arr = NULL;
	return 0;
}
