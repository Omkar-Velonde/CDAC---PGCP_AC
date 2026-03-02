//============================================================================
// Name        : C++_Assignment_Q2.cpp
// Author      : Omkar Velonde
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
class BankAccount{
	int accountNumber;
	string accountHolderName;
	double balance;

public:
	void setAccountNumber(int an){
		accountNumber = an;
	}

	int getAcccountNumber() const{
		return accountNumber;
	}

	void setAccountHolderName(string ahn){
		accountHolderName = ahn;
	}

	string setAccountHolderName() const{
		return accountHolderName;
	}

	void setBalance(double bal){
		balance = bal;
	}

	double getBalance(){
		return balance;
	}


	void deposite(int amount){
		balance += amount;
	}

	void withdraw(int amount){
		balance -= amount;
	}

	int displayAccountDetails(){
		cout << "\nAccount Number: "<< accountNumber;
		cout << "\nAccount Holder Name: "<<accountHolderName;
		cout << "\nBalance: "<<balance;
		return 0;
	}
};
int main() {
	/*
	 * 1. Deposit money into an existing account.
2. Withdraw money from an existing account.
3. Display the account details.
4. Exit the program.
	 */
	int an;
	string ahn;
	int choice;
	double amount;
	int ib;
	BankAccount account;
	cout << "\nEnter Account Number: ";
	cin >> an;
	account.setAccountNumber(an);
	cout << "\nEnter Account Holder Name: ";
	cin >> ahn;
	account.setAccountHolderName(ahn);
	cout << "\nEnter Initial balance: ";
	cin >> ib;
	account.setBalance(ib);

	for(int i=0; i<=100; i++){
		cout << "\n1. Deposit money into an existing account. ";
		cout << "\n2. Withdraw money from an existing account. ";
		cout << "\n3. Display the account details. ";
		cout << "\n4. Exit the program. ";

		cout << "\nEnter your choice: ";
		cin >>choice;
		switch(choice){
		case 1:
			cout << "\nEnter amount to deposit: ";
			cin >> amount;
			account.deposite(amount);
			break;

		case 2:
			cout << "\nEnter amount to withdraw: ";
			cin >> amount;
			account.withdraw(amount);
			break;

		case 3:
			cout << "\nAccount Details";
			account.displayAccountDetails();
			break;

		case 4:
			return 0;
		}

	}

	return 0;
}
