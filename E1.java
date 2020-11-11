/*
 * 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
Expected Output :
Hello
Alexandra Abramov
*/

package w3resourceExcersises;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		
		String firstName; // Declare string variable for first name.
		String lastName; // Declare string variable for last name
		Scanner sc = new Scanner(System.in); // creates scanner to receive input of first and last name.
		
		System.out.println("Please, enter your first name..."); // Asks for input of first name.
		firstName = sc.nextLine(); // Saves first name to firstName string using scanner(sc) for later use.
		
		System.out.println("Please, enter your last name..."); //Asks for input of last name.
		lastName = sc.nextLine(); // Saves last name to lastName string using scanner(sc) for later use.
		
		System.out.println("Hello"); // Prints Hello
		System.out.println(firstName + " " + lastName); // Prints: firstname lastname.
		
		sc.close(); // Closes Scanner (sc) to prevent resource leak.
		
	}

}
