/* ��� ������� ������� ���������� ������� ��������� ������� �������� ����� ����������� ���. ������� �� �� ���������� ����������� ��� ���� �����������, ��������� 500�� ������ �� ����� 10� ���
 * ���� �������� 0,25� ��� ���� �������� �� ��� ���������� ��� ������ ���� ��� �� internet. �� ����� ��������� ��� ��  �������� ��� ������ ��� �� ��� ������� ����������� �������� ��� ������
 * ��� ��� �� ���������� ��� �� ��������� �� ���� ��� �� ������ �� ��������� ���� ��������. */
package MyFirstPackage;

import java.util.Scanner;

public class ParoxhInternet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MB;
		Scanner sc = new Scanner (System.in);
		System.out.println("�������� ��� ������ ��� �� ��� ��������������� ��� ��������� ����.");
		MB = sc.nextInt();
		if( MB <= 500 && MB >= 0) {
			System.out.println("�� �������� ���� ����� 10.00�");
		}
		else if ( MB < 0) {
			System.out.println("�������� ������ ����������/��� ��� 0.");
		}
		else if( MB > 500 ) {
			System.out.println("�� �������� ���� ����� " +((MB - 500) * 0.25 + 10));
		}
		sc.close();
	}

}