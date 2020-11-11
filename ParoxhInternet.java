/* Μία εταιρία κινητής τηλεφωνίας παρέχει υπηρεσίες παροχής ίντερνετ στους συνδρομητές της. Σύμφωνα με τα οικονομικά προγράμματα που έχει ανακοινώσει, προσφέρει 500ΜΒ δωρεάν με πάγιο 10Ε και
 * στην συνέχεια 0,25Ε για κάθε επιπλέον ΜΒ που κατεβάζουν στο κινητό τους απο το internet. Να γίνει πρόγραμμα που θα  διαβάζει τον αριθμό των ΜΒ που κάποιος συνδρομητής κατέβασε στο κινητό
 * του και να υπολογίζει και να εκτυπώνει το ποσό που θα πρέπει να καταβάλει στην εταιρεία. */
package MyFirstPackage;

import java.util.Scanner;

public class ParoxhInternet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MB;
		Scanner sc = new Scanner (System.in);
		System.out.println("Εισάγετε τον αριθμό των ΜΒ που χρησιμοποιήσατε τον τελευταίο μήνα.");
		MB = sc.nextInt();
		if( MB <= 500 && MB >= 0) {
			System.out.println("Το πληρωτέο ποσό είναι 10.00Ε");
		}
		else if ( MB < 0) {
			System.out.println("Εισάγετε αριθμό μεγαλύτερο/ίσο του 0.");
		}
		else if( MB > 500 ) {
			System.out.println("Το πληρωτέο ποσό είναι " +((MB - 500) * 0.25 + 10));
		}
		sc.close();
	}

}