/*
 * ����ڷ� ���� �Է��� ���� ���� ����Ͽ� ������ ����� ����ϰ� ����ϴ� ���α׷�
 * 
 * */

package ex06.operator;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		int kor1, kor2, kor3;
		int total;
		float avg;

		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;


		// --------------  ���� �Է� �κ� -----------------
		System.out.println("����������������������������������������");
		System.out.println("��      �����Է�       ��");
		System.out.println("����������������������������������������");		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("����1 : ");
		kor1 = scan.nextInt();
		
		// -----��ȿ�� �˻�
		System.out.println(0<=kor1 && kor1 <= 100);
		System.out.println((0<=kor1 && kor1 <= 100)?"��ȿ":"�߸�");
		int validate = (0<=kor1 && kor1 <= 100)? 1 : 0;
		System.out.println(validate);
		
		// --------------------
		
		System.out.print("����2 : ");
		kor2 = scan.nextInt();
		
		System.out.print("����3 : ");
		kor3 = scan.nextInt();

		// --------------  ���� ��� �κ� -----------------

		total = kor1 + kor2 + kor3;
		avg = total / 3.0f; // ó������ float���� ������.	
		
		
		System.out.println("����������������������������������������");
		System.out.println("��      �������       ��");
		System.out.println("����������������������������������������");
		System.out.printf("����1 : %3d\n", kor1);
		System.out.printf("����2 : %3d\n", kor2);
		System.out.printf("����3 : %3d\n", kor3);
		System.out.printf("���� : %3d\n", total);
		// ����� 63.33�� �ƴ� 63.00�� ���� ����
		// ������ ������ ������ �������ȴ�. �̸� float�� ��ȯ�ϸ� �Ҽ��ڸ��� ��� 0ó���ȴ�.
		System.out.printf("��� : %6.2f\n", avg);
		System.out.println("����������������������������������������");
	
		
	}
}