/*
 * Write a Java program that takes three numbers as input to calculate and print the average of the numbers. 
 */
package w3resourceExcersises;

import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers to calculate their average..");
		double numA = sc.nextDouble();
		double numB = sc.nextDouble();
		double numC = sc.nextDouble();
		
		double sum = ( numA + numB + numC ) ;
		
		double avg = ( sum / 3 );
		
		System.out.println("The average of the 3 numbers entered is: " + avg + " .");
		
		sc.close();
		
	}

}
