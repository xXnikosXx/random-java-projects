package  trialPackage;

import java.util.Scanner;

class trialClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double hrs = sc.nextDouble();
		double hrsInt;
		double days;
		double mins;
		double secs;
		
		
		hrsInt = (long)hrs ;  //hrs before decimal point
		hrs = hrs - hrsInt;   //hrs after decimal point
		
		days = hrsInt / 24;
		long daysInt = (long)days;
		
		mins = hrs * 60;
		
		long minsInt = (long)mins ; //mins before decimal point
		mins = mins - minsInt;  //mins after decimal point
		
		secs = mins * 60;
		
		hrsInt = hrs % 24;
		
		System.out.print(daysInt + ":" + hrsInt + ":" + minsInt + ":" + secs);
		
		sc.close();
	}
	
	
}