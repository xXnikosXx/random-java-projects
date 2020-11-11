/*
 * 11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586 
 */
package w3resourceExcersises;

import java.util.Scanner;

public class E11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a circle radius (in cm) to calculate it's perimeter and area..");
		double radius = sc.nextDouble();
		
		double perimeter = ( 2 * Math.PI * radius);
		double area = ( Math.PI * ( radius * radius) );
		
		System.out.println("The circle with a radius of " + radius + "cm has a perimeter of " + perimeter + "cm and an area of " + area + "cm.");
		
		sc.close();
	}

}
