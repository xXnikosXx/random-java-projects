/* Να γραφεί πρόγραμμα που θα παίρνει 2 αριθμούς που θα δίνει ο χρήστης μέσω πληκτρολογίου και θα αναθέτει τον ένα ως βάση, τον άλλο ως εκθέτει και θα υπολογίζει και θα εμφανίζει το αποτέλεσμα της δύναμης που προκύπτει. Να παρθούν περιπτώσεις για την βάση. */
package MyFirstPackage;

import java.util.Scanner;

public class PowerOfxAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int z = 1;
		Scanner a = new Scanner (System.in);
		System.out.println("Εισάγετε τιμή βάσης.");
		x = a.nextInt();
		System.out.println("Εισάγετε τιμή εκθέτη");
		y = a.nextInt();
		if (y >= 0) {
			for(int i = 1; i <= y; i++) {
			z *= x; // maybe?
			}
			System.out.println("Το αποτέλεσμα του " +x +" εις την " +y +" είναι: " +z);	
		}	
		else {
			System.out.println("Εισάγετε θετικό εκθέτη");
		}
		a.close();
	}

}
