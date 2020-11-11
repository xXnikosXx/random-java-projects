/*
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * 
 * Sum of two binary numbers: 101
 */

/*
 *  Binary numbers: In mathematics and digital electronics, a binary number is a number
 *  based in the base-2 numerical system, which uses only two symbols: typically 0s and 1s.
 *  
 *  Binary counting: Binary counting follows the same procedure with decimal counting, except
 *  that there only are the two symbols 0 and 1 available. Thus, after a digit reaches 1 in
 *  binary, an increment resets it to 0 but also causes an increment of the next digit to
 *  the left:
 *  
 *  0000,
 *  0001, (rightmost digit starts over, and the next digit is incremented)
 *  0010, 0011, (rightmost two digits start over, and the next digit is incremented)
 *  0100, 0101, 0110, 0111, (rightmost three digits start over, and the next digit is
 *  incremented)
 *  1000, 1001, 1010, 1011, 1101, 1110, 1111...
 *  
 *  In the binary system, each digit represents an increasing power of 2, with the rightmost
 *  digit representing (2^0), the next representing (2^1), then (2^2), and so on. The value
 *  of a binary number is the sum of the powers of 2 represented by each "1" digit.
 *     
 *     
 *  Summing binary numbers: Binary addition is much like your normal everyday addition
 *  (decimal addition), except that it carries on a value of 2 instead of a value of 10.
 *  
 *  For example, in decimal addition, if you add 8 + 2 you get ten, which you write as 10;
 *  in the sum this gives a digit of 0 and a carry of 1. Something similar happens in binary
 *  addition, when you add 1 and 1; the result is two (as always), but since two is written 
 *  as 10 in binary, we get, after summing 1 + 1 in binary, a digit 0 and a carry of 1.
 *  Therefore, in binary:
 *  0 + 0 = 1
 *  0 + 1 = 1
 *  1 + 0 = 1
 *  1 + 1 = 10 (which is 0 carry 1)
 *   So: 1 + 11 = 100
 *   	 1010 + 11 =  1101
 *   	 100101 + 10101 = 111010
 */
package w3resourceExcersises;

public class E17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Error intended!
		 
		 /*Temporary plan:
		  * Get 2 binary numbers (double-type variables)
		  * 
		  * Identify last digit of both binary numbers.
		  * 
		  * Using Binary Addition, add the 2 numbers, saving the number in a temp variable (type: string) and the number to 
		  * carry in a different variable (type: double) (0 or 1).
		  * 
		  * Identify second-to-last digits of both binary numbers, adding them together in a 2nd temp (type: string). Add carry to 2nd carry attirbute.
		  * 
		  * Add the 1st carry to last sum, and then 0 it.
		  *
		  * if: temp1 = 0 and temp2 = 0 then temp1 = 00 and temp2 = 0.
		  * else if t1 0 n t2 1 then t1 10 n t2 0
		  * else if t1 1 n t2 0 then t1 01 n t2 0
		  * else if t1 1 n t2 1 then t1 11 n t2 0.
		  * 
		  * repeat process up untill done for 1st digits. 
		  * 
		  * hail satan and print t1.
		  *  
		  *  never work with binary numbers ever ever again. ever.
		  *  
		  */
		
	}

}