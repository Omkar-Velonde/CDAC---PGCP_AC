/*
 ============================================================================
 Name        : Cpp_Assignment_Q5_SpotTheBug_CallByValue.c
 Author      : Omkar Velonde
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C++, Ansi-style
 ============================================================================
 */
/*
 * Q5. Spot the Bug — Call by Value Trap
The following program is meant to double the value of n inside doubleIt() and see the change reÌected
in main(). It does not work as expected.
1. Compile and run it. Write the output.
2. Fix the function using call by reference (C++ style with &) so that num in main() is actually doubled.
3. Write the corrected program and its output.
 */
#include <stdio.h>
void doubleIt(int &n) {
	n = n * 2;
	printf("Inside doubleIt: %d\n", n);
}
int main() {
    int num = 7;
    doubleIt(num);
    printf("In main after call: %d\n", num);
    return 0;
}


/*
 * using call by value - before correcting
 * Inside doubleIt: 14
In main after call: 7
 */
