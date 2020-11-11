/* Να γραφεί πρόγραμμα που θα δέχεται τιμές απο το πληκτρολόγιο και θα τις χρησιμοποιεί για να λύσει 2βαθμια εξίσωση. */
package MyFirstPackage;

import java.util.Scanner;

public class EksisosiDefterouVathmou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Λύση Δευτεροβάθμιας Εξίσωσης.");
		double A; // α
		double B; // β
		double C; // γ
		double D; // διακρίνουσα
		double R1 = 1; // χ1
		double R2 = 1; // χ2
		Scanner scn = new Scanner (System.in);
		System.out.println("Εισάγετε τιμή για το Α");
		A = scn.nextDouble();
		System.out.println("Εισάγετε τιμή για το Β");
		B = scn.nextDouble();
		double B2 = B; // β για διατήρηση τιμής.
		System.out.println("Εισάγετε τιμή για το Γ");
		C = scn.nextDouble();
		B *= B; //τετράγωνο β
		D = B - 4 * A * C; //ευρεση διακρίνουσας.
		double DS = Math.sqrt(D); //τετρ. ρίζα διακρίνουσας.
		double MB = -B2; // μείον β.
		double R1B = 2 * A; //παρονομαστής λύσεων.
		if(D > 0) {
			double R1A = MB + DS; // αριθμητής πρώτης περίπτωσης.
			R1 = R1A / R1B; //αποτελεσμα πρώτης περίπτωσης.
			double R2A = MB - DS; // αριθμητης 2ης περίπτωσης.
			R2 = R2A / R1B; // αποτέλεσμα 2ης περίπτωσης.
			System.out.println( "Η εξίσωση " +A +"x^2+" +B2 +"+" +C +": " +"Δ = " +D +". x1 = " +R1 +". x2 = " +R2); // Να γραφει η Διακρίνουσα και οι λύσεις της εξίσωσης το ένα κάτω απο το άλλο.
		}
		else if(D == 0) {
			R1 = MB / R1B; // αποτέλεσμα 
					System.out.println( "Η εξίσωση " +A +"x+" +B2 +"+" +C +": " +"Δ = " +D +". x1,2 = " +R1 +"."); // Να γραφει η Διακρίνουσα και οι λύσεις της εξίσωσης το ένα κάτω απο το άλλο.
		}
		else if(D < 0) {
			System.out.println("Η εξίσωση " +A +"x+" +B2 +"+" +C +" δεν έχει πραγματικές ρίζες.");
		}
		boolean TF; 
		System.out.println("Να παραγοντοποιηθεί η εξίσωση; Ναι:true Όχι:false ");
		TF = scn.nextBoolean();
		if(TF == true) {
			if(D > 0) {
				System.out.println(A +"x^2" +B2 +"x" +C +" = " +A +"*(x-" +R1 +")*(x-" +R2 +")."  );
			}
			else if(D == 0) {
				System.out.println(A +"x^2" +B2 +"x" +C +" = " +A +"(x-" +R1 +")^2" );
			}
			else if(D < 0) {
				System.out.println("Η εξίσωση ήταν αδύνατη, συνεπώς δεν παραγοντοποιείται.");
			}
		}
		else if(TF == false) {
			System.out.println("Okay.");
		}
		scn.close();
	}
	


	}
