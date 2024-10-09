package edu.wit.cs.comp1000;
/**
 *  Solution to the third programming assignment.
 *  When it runs it sum of non and positive and all numbers, 
 *  also average of non and positive and all numbers
 *  to the terminal.
 *  
 *  @author Ethan DeSousa
 */
import java.util.Scanner;

public class PA2a {			// Finds sum of non and positive and all numbers, also average of non and positive and all numbers
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, num3, num4, num5;		// 5 user inputed numbers
		int posNum = 0; 						// variable for total positive numbers
		int nonposNum = 0; 						// variable for total non positive numbers
		int sumNum = 0;							// variable for total numbers
		int pos = 0;							// counter for positive numbers
		int neg = 0;							// counter for non positive numbers
		double avgPos, avgNeg, avgTotal;		// variables for average postive, non postive and total values
		
		
		System.out.printf("Enter five whole numbers: ");		// User input
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		num4 = input.nextInt();
		num5 = input.nextInt();
		
		if (num1 > 0) {						//If statement to determine positive or non positive inputs
			posNum = posNum + num1;			// If positive add to total positive number
			pos++;							// while also adding to positive or non positive counter
		}
		else {
			nonposNum = nonposNum + num1;
			neg++;
		}
		if (num2 > 0) {
			posNum = posNum + num2;
			pos++;
		}
		else {
			nonposNum = nonposNum + num2;
			neg++;
		}
		if (num3 > 0) {
			posNum = posNum + num3;
			pos++;
		}
		else {
			nonposNum = nonposNum + num3;
			neg++;
		}
		if (num4 > 0) {
			posNum = posNum + num4;
			pos++;
		}
		else {
			nonposNum = nonposNum + num4;
			neg++;
		}
		if (num5 > 0) {
			posNum = posNum + num5;
			pos++;
		}
		else {
			nonposNum = nonposNum + num5;
			neg++;
		}
		sumNum = num1 + num2 + num3 + num4 +num5;		// calculates sum of all numbers
		avgTotal = sumNum / 5.0;						// calculates average of all numbers
		if (pos > 0) {									// If statement to find the averages without doing division by 0
			avgPos = (posNum * 1.0) / pos;
		}
		else {
			avgPos = 0;
		}
		if (neg > 0) {
			avgNeg = (nonposNum * 1.0) / neg;
		}
		else {
			avgNeg = 0;
		}
		
		if(pos == 1 && neg > 1) {					// if statement to determine how output should look										
			System.out.printf("The sum of the %d positive number: %d%n", pos, posNum);
			System.out.printf("The sum of the %d non-positive numbers: %d%n", neg, nonposNum);
			System.out.printf("The sum of the 5 numbers: %d%n",sumNum);
			System.out.printf("The average of the %d positive number: %.2f%n", pos, avgPos);
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", neg, avgNeg);
			System.out.printf("The average of the 5 numbers: %.2f%n", avgTotal);
		}
		else if (pos > 1 && neg == 1){
			System.out.printf("The sum of the %d positive numbers: %d%n", pos, posNum);
			System.out.printf("The sum of the %d non-positive number: %d%n", neg, nonposNum);
			System.out.printf("The sum of the 5 numbers: %d%n",sumNum);
			System.out.printf("The average of the %d positive numbers: %.2f%n", pos, avgPos);
			System.out.printf("The average of the %d non-positive number: %.2f%n", neg, avgNeg);
			System.out.printf("The average of the 5 numbers: %.2f%n", avgTotal);
		}
		else {
			System.out.printf("The sum of the %d positive numbers: %d%n", pos, posNum);
			System.out.printf("The sum of the %d non-positive numbers: %d%n", neg, nonposNum);
			System.out.printf("The sum of the 5 numbers: %d%n",sumNum);
			System.out.printf("The average of the %d positive numbers: %.2f%n", pos, avgPos);
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", neg, avgNeg);
			System.out.printf("The average of the 5 numbers: %.2f%n", avgTotal);
		}
		
	}

}
