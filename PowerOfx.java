/* Να γραφεί πρόγραμμα που θα παίρνει 2 αριθμούς που θα δίνει ο χρήστης μέσω πληκτρολογίου και θα αναθέτει τον ένα ως βάση, τον άλλο ως εκθέτει και θα υπολογίζει και θα εμφανίζει το αποτέλεσμα της δύναμης που προκύπτει. Να παρθούν περιπτώσεις για την βάση. */
package MyFirstPackage;

import java.util.Scanner;

public class PowerOfx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float x;
		float y;
		float z = 1;
		float b = 1;
		Scanner a = new Scanner (System.in);
		System.out.println("Εισάγετε τιμή βάσης.");
		x = a.nextFloat();
		float v = x;
		System.out.println("Εισάγετε τιμή εκθέτη");
		y = a.nextFloat();
		if (y > 0) {
			for(int i = 1; i <= y; i++) {
			z *= x; 
			}
			System.out.println("Το αποτέλεσμα του " +(int)x +" εις την " +(int)y +" είναι: " +(int)z);	
		}	
		else if (y == 0) {
			z = 1;
			System.out.println("Το αποτέλεσμα του " +(int)x +" εις την " +(int)y +" είναι: " +(int)z);
		}
		else {
			for(int i = 1; i <= -y; i++) {
				b *= x;
				z = 1/b;
				}
			System.out.println("Το αποτέλεσμα του " +(int)v +" εις την " +(int)y +" είναι: " +(int)z);	
		}
		a.close();
	}
		
	

}
