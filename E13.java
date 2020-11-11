/*
 * 
 * Something's wrong, I can feel it... (delete line 41 to get rid of error once excersise is solved properly)
 * 
 * 
 * Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 
 */
package w3resourceExcersises;

import java.util.Scanner;

public class E13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the width of the rectangle of which you wish to calculate the area and perimeter..");
		final double width = sc.nextDouble();
		
		System.out.println("Enter the height of the rectangle of which you wish to calculate the area and perimeter..");
		final double height = sc.nextDouble();
		
		double area = ( width * height ) ;
		double perimeter = 2 * ( width + height );
		
		System.out.println("The rectangle's area is: " + width + " * " + height + " = " + area + " .");
		System.out.println("The rectangle's perimeter is: 2 * ( " + width + " + " + height + " ) = " + perimeter + " .");
		
		sc.close();
		
	}

	blah
}
