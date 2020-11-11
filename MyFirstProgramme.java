/* Να γραφεί πρόγραμμα που θα προσθέτει 2 αριθμούς που θα δίνει ο χρήστης μέσω πληκτρολογίου και να εμφανίζει το άθροισμά τους. */
package MyFirstPackage;

import java.util.Scanner;

public class MyFirstProgramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int z;
		Scanner a = new Scanner (System.in);
		System.out.println("Εισάγετε 1o αριθμό για πρόσθεση");
		x = a.nextInt();
		System.out.println("Εισάγετε 2o αριθμό για πρόσθεση");
		y = a.nextInt();
		z = x + y;
		System.out.println("Το άθροισμα είναι: " + z);
		a.close();
	}

}