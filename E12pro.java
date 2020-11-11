/*
 * Original: Write a Java program that takes three numbers as input to calculate and print the average of the numbers. 
 * 
 * Mine (pro): Write a Java program that takes an unknown amount of numbers as input to calculate and print their average. 
 */
package w3resourceExcersises;

import java.util.Scanner;

public class E12pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Start inputing numbers to calculate their average. Input 0 to terminate the input stream and get the output.");
		double numX = sc.nextDouble();
		double sum = numX;
		int i = 0;
		
		while (numX != 0) {
			System.out.println("Insert next number...");
			numX = sc.nextDouble();
			sum = sum + numX;
			i++;
		};
		
		double avg = (sum / i);
		System.out.println("The average of the inputed numbers( which were " + i + " in total ) is: " + avg +" .");
		
		sc.close();
	}

}
