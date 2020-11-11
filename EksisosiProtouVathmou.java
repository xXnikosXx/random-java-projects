/* Να γραφεί πρόγραμμα που θα δέχεται τιμές απο το πληκτρολόγιο και θα τις χρησιμοποιεί για να λύσει 1βαθμια εξίσωση. */
package MyFirstPackage;

import java.util.Scanner;

public class EksisosiProtouVathmou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Λύση εξίσωσης της μορφής Ax+B=0.");
		float A;
		float B;
		float R = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Εισάγετε τιμή για το Α...");
		A = sc.nextFloat();
		System.out.println("Εισάγετε τιμή για το Β...");
		B = sc.nextFloat();
		if(A == 0 && B == 0) {
			System.out.println("Η εξίσωση " +(int)A +"x+" +(int)B +"=0 είναι αόριστη.");
		
		}
		else if(A == 0 && B != 0) {
			if(B > 0) {
				System.out.println("Η εξίσωση " +(int)A +"x+" +(int)B +"=0 είναι αδύνατη.");
			}
			else if(B < 0) {
				System.out.println("Η εξίσωση " +(int)A +"x" +(int)B +"=0 είναι αδύνατη.");
			}
		}
		else if(A != 0) {
			R = -B / A;
			
			if(B > 0) {
				System.out.println( "Το αποτέλεσμα της εξίσωσης " +(int)A +"x+" +(int)B +"=0 είναι: " +R +".");
			}
			else if(B < 0) {
				System.out.println( "Το αποτέλεσμα της εξίσωσης " +(int)A +"x" +(int)B +"=0 είναι: " +R +".");
			}
			
			
		}
	sc.close();		
	}

}
