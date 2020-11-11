package MyFirstPackage;

import java.util.Scanner;

public class Dieretes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int D;
		int O;
		int x;
		int counter = 0;
		System.out.println("Εισάγετε τιμή για τον διαιρέτη.");
		D = sc.nextInt();
		System.out.println("Εισάγετε τιμή για το όριο των διαιρετέων.");
		O = sc.nextInt();
		
		for(int i = D; i <= O; i++ ){
			x = i % D;
			if(x == 0) {
				System.out.print(i +"  ");
				counter += 1;
			
			}
		}
		if(counter == 0) {
			System.out.println("Δεν υπάρχουν διαιρέτες.");
		}
		sc.close();
	}

}
