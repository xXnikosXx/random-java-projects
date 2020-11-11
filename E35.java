/*
 * 35. Write a Java program to compute the area of a polygon.
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output
*
The area is: 130.82084798405722
*
 */

package w3resourceExcersises;

import java.util.Scanner;

public class E35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("How many sides does the polygon have?");
		
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble(); //"n" sides of the polygon
		
		System.out.println("What is the length of each side of the polygon? (in cm)");
		double s = sc.nextDouble(); //"s" the length of each side of the polygon
		
		System.out.println("Calculating the area of the polygon...");
		
		System.out.println("5%");
		System.out.println("12%");
		System.out.println("23%");
		System.out.println("39%");
		System.out.println("42%");
		System.out.println("65%");
		System.out.println("78%");
		System.out.println("86%");
		
		double area = ( n * (s * s) ) / ( 4.0 * ( Math.tan(Math.PI / n) ) );  //We're using Math.PI instead of just 3.14 for more accurate calculations!!
		
		System.out.println("99%");
		System.out.println("The area of a " + n +"-sided polygon with each side being " + s + "cm long, is:" + area +" .");
		
		sc.close();
	}

}
