package edu.wit.cs.comp1000;
/**
 *  Solution to the third programming assignment.
 *  When it runs it outputs "Hello World!" to the
 *  terminal.
 *  
 *  @author Ethan DeSousa
 */
import java.util.Scanner;
 
public class PA2b { 		// Calculates discriminant then idicates number of roots 
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a,b,c;			// values inputed of quadratic function
		double dis = 0;			// discriminant
		double root1 = 0;       
		double root2 = 0;
		System.out.printf("Enter a b c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		dis = (b*b) - (4 * a *c);		// Calculates discriminant
		
		if (dis < 0) {
			System.out.printf("Roots: imaginary%n");		//If statement to use discriminant to determine roots
		}
		else if (dis == 0) {
			root1 = (-1.0 * b) / (2.0 * a);					// Finds the one root
			System.out.printf("Root: %.2f%n", root1);
		}
		else {
			root1 = (-b - Math.sqrt(dis)) / (2 * a);		// Finds the two roots
			root2 = (-b + Math.sqrt(dis)) / (2 * a);
			if (root1 > root2) {
			    double temp = root1;
			    root1 = root2;
			    root2 = temp;
			}
			System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
		}
	}

}
