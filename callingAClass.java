package MyFirstPackage;

import java.util.Scanner;

public class callingAClass {
	static void trialMethod(int a, int b, int c) {
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		trialMethod(x, y, z);

		sc.close();
	}

}
