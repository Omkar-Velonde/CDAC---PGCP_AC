//============================================================================
// Name        : C++_Assignment1_Q3.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
class TollBooth{
	int totalVehicles=0;
	double totalRevenue=0.0;

public:
	void reset(){
		totalVehicles=0;
		totalRevenue=0.0;
	}

	void vehiclePayingTool(int vehicleType, double tollAmount){
		/*
		 * The vehicleType represents the type of car (1
for standard car, 2 for truck, 3 for bus). The function should increment totalVehicles
by 1 and add tollAmount to totalRevenue based on the car type.
Define a fixed toll amount for each type of car (e.g., RS.180 for standard cars, Rs.300 for
trucks, Rs. 350 for buses).
		 */
		if(vehicleType==1){
			totalVehicles+=1;
			totalRevenue += tollAmount;
		}
		else if(vehicleType==2){
			totalVehicles+=1;
			totalRevenue += tollAmount;
		}
		else if(vehicleType==3){
			totalVehicles+=1;
			totalRevenue += tollAmount;
		}

	}

	int getTotalVehicles(){
		return totalVehicles;
	}

	double getTotalRevenue(){
		return totalRevenue;
	}

};
int main() {

	double cartoll=180.0;
	double trucktoll=300.0;
	double bustoll=350.0;
	int choice;

	TollBooth tb;



	for(int i=0; i<=25; i++){
		cout << "\n1. Add a standard car and collect toll";
		cout << "\n2. Add a truck and collect toll";
		cout << "\n3. Add a bus and collect toll";
		cout << "\n4. Display total cars passed";
		cout << "\n5. Display total revenue collected";
		cout << "\n6. Reset booth statistics";
		cout << "\n7. Exit";

		cout <<"\nEnter your choice: ";
		cin >> choice;

		switch(choice){
		case 1:
			cout << "\nStandard Car Tool Collected";
			tb.vehiclePayingTool(1,cartoll);
			break;
		case 2:
			cout << "\nTruck Tool Collected";
			tb.vehiclePayingTool(2,trucktoll);
			break;
		case 3:
			cout << "\nBus Tool Collected";
			tb.vehiclePayingTool(3,bustoll);
			break;
		case 4:
			cout <<"\nTotal Vehicles: ";
			cout << tb.getTotalVehicles();
			break;
		case 5:
			cout<<"\nTotal Revenue: ";
			cout << tb.getTotalRevenue();
			break;
		case 6:
			cout<<"\nReset Done";
			tb.reset();
			break;
		case 7:
			return 0;
		}

	}
	return 0;
}
