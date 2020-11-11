/*
 * 15. Write a program to swap two variables.
 */
package w3resourceExcersises;

import java.util.Scanner;

public class E15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert the value of the 1st variable...");
		int varA = sc.nextInt();
		
		System.out.println("Insert the value of the second variable...");
		int varB = sc.nextInt();
		
		int temp = varA;
		varA = varB;
		varB = temp;
		
		System.out.println("varA: " + varA + " !   .   varB: " + varB + " !");
		
		sc.close();
	}

}
