/* �������� �� ���������� ����������� ��� ������� ��� �� ������� ���� (� ����������� ����� ����������):
 * 	
 *         		�������� |	�����
 *     	 ------------------------------
 *     	      0 - 12.000 |	2%
 *     	 12.001 - 20.000 |	7%
 *     	 20.001 - 30.000 |	12%
 *       30.001 ��� ���� |	15%
 *     
 * �� ������� ��������� �� ����� �� �������� �� �������� ���� ������ ��� �� ��������� �� ���� ��� ����� ��� �� ��������.
 * */
package MyFirstPackage;

import java.util.Scanner;

public class KathgoriesForologhshs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float I; //Income
		float M; //Money to be paid.
		Scanner sc = new Scanner (System.in);
		System.out.println("�������� ������ ��������.");
		I = sc.nextFloat();
		if(I < 0) {
			// ����� ����� �� �������� ���� �� ��-�������� ����.
			System.out.println("�������� ������ ���������� � ��� ��� 0.");
		}
		else {
			// ����������� ��� ��� ���������� ��� ����� ��� ������� ��� ��������.
			if( 0 <= I && I <= 12000) {
				M = (I * 2) / 100;
				System.out.println("� ��������� ����� �����: " +M +".");
			}
			else if(12001 <= I && I <= 20000) {
				M =  12000 * 2 / 100  + (I - 12000) * 7 / 100 ;
				System.out.println("� ��������� ����� �����: " +M +".");
			}
			else if(20001 <= I && I <= 30000) {
				M =  12000 * 2 / 100  + 8000 * 7 / 100  + (I - 20000) * 12 / 100;
				System.out.println("� ��������� ����� �����: " +M +".");	
			}
			else if (I >= 30001) {
				M =  12000 * 2 / 100  + 8000 * 7 / 100  + 10000 * 12 / 100 + (I - 30000) * 15 / 100;
				System.out.println("� ��������� ����� �����: " +M +".");	
			}
		}
		sc.close();
	}

}
