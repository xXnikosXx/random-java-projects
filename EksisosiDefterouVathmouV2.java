/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
/* Να γραφεί πρόγραμμα που θα δέχεται τιμές απο το πληκτρολόγιο και θα τις χρησιμοποιεί για να λύσει 2βαθμια εξίσωση. (2η έκδοση, μικρότερη έκταση). */
package MyFirstPackage;

import java.util.Scanner;

public class EksisosiDefterouVathmouV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Λύση Δευτεροβάθμιας Εξίσωσης.");
		int A;
		int B;
		int C;
		double D;
		double S1 = 0;
		double S2 = 0;
		Scanner a = new Scanner (System.in);
		System.out.println("Εισάγετε τιμή για το Α.");
		A = a.nextInt();
		System.out.println("Εισάγετε τιμή για το Β.");
		B = a.nextInt();
		System.out.println("Εισάγετε τιμή για το Γ.");
		C = a.nextInt();
		D = B * B - 4 * A * C; // Διακρίνουσα.
		System.out.println("Η Διακρίνουσα είναι: " +(int)D +".");
		if (D < 0) {
			System.out.println("Η εξίσωση είναι αδύνατη, διότι η διακρίνουσα είναι μη-θετικός αριθμός.");
		}
		else if(D > 0) {
			S1 = ( -B + Math.sqrt(D) ) / ( 2 * A )  ;
			S2 = ( -B - Math.sqrt(D) ) / ( 2 * A )  ;
			System.out.println("Οι δύο λύσεις της εξίσωσης είναι η  " +S1 +"  και η  " +S2 + "  .");
		}
		else if(D == 0) {
			S1 = -B / ( 2 * A );
			System.out.println("Η μοναδική λύση της εξίσωσης είναι η  " +S1 +".");
		}
		System.out.println("Θέλετε να παραγοντοποιηθεί η εξίσωση; (Ναι/Όχι)");
		char YN = a.next().charAt(0);
		char N = 'Ν';
		char O = 'Ό';
		if(YN == N) {
			if(D > 0) {
				System.out.println(A +"*(x-" +S1 +")*(x-" +S2 +")."  );
			}
			else if(D == 0) {
				System.out.println(A +"(x-" +S1 +")^2" );
			}
			else if(D < 0) {
				System.out.println("Η εξίσωση ήταν αδύνατη, συνεπώς δεν παραγοντοποιείται.");
			}
		}
		else if(YN == O) {
			System.out.println("Okay.");
		}
		a.close();
	}
}