/*
 ============================================================================
 Name        : CPP_Assignment_Q2_Temp_Converter.c
 Author      : Omkar Velonde
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */
/*
 * Q3. Temperature Converter
Write a C program with the following two functions — declare prototypes before main(), deËne them
after main():
float celsiusToFahrenheit(float c) — converts Celsius to Fahrenheit
(Formula: F = (C × 9/5) + 32)
float fahrenheitToCelsius(float f) — converts Fahrenheit to Celsius
(Formula: C = (F − 32) × 5/9)
In main(), call both functions with sample values and print the results formatted to 2 decimal places.
 */

#include <stdio.h>
#include <stdlib.h>

float celsiusToFahrenheit(float c);
float fahrenheitToCelsius(float f);
int main(void) {
	float c = 23.33;
	float f = 34.67;
	float resultF = celsiusToFahrenheit(c);
	float resultC = fahrenheitToCelsius(f);
	printf("Celsius to Fahrenheit: %f\n", resultF);
	printf("Fahrenheit to Celsius: %f\n", resultC);
	return 0;
}

float celsiusToFahrenheit(float c){
	float F = (c * 9/5) + 32;
	return F;
}

float fahrenheitToCelsius(float f){
	float C = (f - 32) * 5/9;
	return C;
}
