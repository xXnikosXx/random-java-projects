/* Εκφώνηση: Να γραφεί πρόγραμμα που θα ελέγχει το πρόσημο ενός αριθμού που δίνει ο χρήστης. Θα εισάγονται συνεχόμενες τιμές και θα δίνεται το πρόσημό τοιυς μέχρι ο χρήστης να δώσει τον αριθμό 0, οπου και το πρόγραμμα θα κλείνει.  */
package MyFirstPackage;

import java.util.Scanner;

public class ElegxosThetikouArithmou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		Scanner sc = new Scanner(System.in);
		do { 
			System.out.println("vale timh gia elegxo, axrhste");
		
			
			x = sc.nextInt();
			if ( x > 0) {
				System.out.println("o arithmos " + x + " einai thetikos" );
			}
			else if (x == 0) {
				System.out.println("o arithmos den exei prosimo");
			}
			else {
				System.out.println("o arithmos " +x +" einai arnitikos");
			}
		} 
		while (x != 0);
		sc.close();
	}

}
