/*
 * 32. Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39

 */
package w3resourceExcersises;

import java.util.Scanner;

public class E32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input first integer...");
		int int1 = sc.nextInt();
		
		System.out.println("Input 2nd integer...");
		int int2 = sc.nextInt();
		
		if (int1 == int2) {
			System.out.println(int1 +" = " + int2);
		}
		else if (int1 > int2){
			System.out.println(int1 + " != " + int2);
			System.out.println(int1 + " > " + int2);
		}
		else if (int1 < int2) {
			System.out.println(int1 + " != " + int2);
			System.out.println(int1 + " < " + int2);
		};
	
		sc.close();
		
	}

}
