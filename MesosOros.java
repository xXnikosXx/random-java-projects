/* Να γραφεί πρόγραμμα που να δέχεται αριθμούς και να βγάζει τον μέσο όρο τους. Θα δίνουμε εμείς το πόσοι και το ποιοί. */
package MyFirstPackage;

import java.util.Scanner;

public class MesosOros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte x; // # μαθημάτων
		float y;
		float z = 0;
		boolean b = true;
		Scanner sc = new Scanner (System.in); 
		System.out.println("Εισάγετε αριθμό μαθημάτων.");
		x = sc.nextByte();
		System.out.println(""); // line down
		System.out.println(""); // line down
		for(int i = 1; i <= x; i++ ) {
			System.out.println("Εισάγετε τον βαθμό του " +i +"ου μαθήματος.");
			y = sc.nextFloat();
			if(y >= 0 && y <= 20) {
				z += y; // z = z + y
				b = true;
			}
			else {
				System.out.println("Error. 0 <= x <= 20.");
				b = false;
			}
		}
		if(b == true) {
			System.out.print("Ο μέσος όρος των " +x +" μαθημάτων είναι: " + z / x);
			if (z / x <= 5) {
				System.out.print(". Άνοιξε και κανένα βιβλίο...");
			}
			else if(z / x > 5 && z / x <= 10) {
				System.out.print(". Προσπάθησε παραπάνω.");
			}
			else if(z / x > 10 && z / x <= 15) {
				System.out.print(". Καλή προσπάθεια.");
			}
			else if(z / x > 15 && z / x <= 17) {
				System.out.print(". Λίαν καλώς.");
			}
			else if(z / x > 17 && z / x <= 19) {
				System.out.print(". Πολύ καλά!");
			}
			else if(z / x > 19 && z / x <= 20) {
				System.out.print(". Άριστα!!!");
			}
		}
		else if(b == false) {
			System.out.println("Restart the program.");
		}
		sc.close();
	}

}
