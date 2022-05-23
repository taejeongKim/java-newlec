 /*
 * �ڵ� ������ ����
 * �����Լ����� '�����Է�'�κи� ������.
 */

package ex18.divide_code;

import java.util.Scanner;

public class Program1 {
	
	// ������ ����ȭ(��� �Լ��� ����)�Ϸ��� static (does not move or change) �� �ٿ��ش�.
	// ������ static�� �Լ��� static�� �ǹ̰� �ٸ���.
	
	static int[] kors = new int[3];
	
	public static void main(String[] args) {
		
		int total;
		float avg;
		int menu;
		boolean keepLoop = true;

		for (int i=0; i<3; i++) {
			kors[i] = 0;
		}

		����:
		while (keepLoop) {

			Scanner scan = new Scanner(System.in);

			// -------------- �޴� �κ� -----------------
			System.out.println("����������������������������������������");
			System.out.println("��      �޴�        ��");
			System.out.println("����������������������������������������");
			
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			
			System.out.print("> ");
			menu = scan.nextInt();
			
			switch (menu) {

			case 1: 
				
				// -------------- ���� �Է� �κ� -----------------
				�����Է�();
				
				break;
				
			case 2:
				
				// -------------- ���� ��� �κ� -----------------
				
				total = kors[0] + kors[1] + kors[2];
				avg = total / 3.0f; 
				
				System.out.println("����������������������������������������");
				System.out.println("��      �������    ��");
				System.out.println("����������������������������������������");
				
				for (int i = 0; i < 3; i++) {
					System.out.printf("����%d : %3d\n", i + 1, kors[i]);
					
				}
				
				System.out.printf("���� : %3d\n", total);
				System.out.printf("��� : %6.2f\n", avg);
				System.out.println("����������������������������������������");
				
				break;
				
			case 3: 
				
				break ����;

			default:
				
				System.out.println("�Է¿���, 1~3�������� �Է��� �� �ֽ��ϴ�.");
				break;
			
			}
			
		}
		System.out.println("Good-bye~");
	}
	
	static void �����Է�() {
		
		// -------------- ���� �Է� �Լ� -----------------
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����������������������������������������");
		System.out.println("��      �����Է�    ��");
		System.out.println("����������������������������������������");
		
		for (int i=0; i<3; i++)
			do {
				System.out.printf("����%d : ", i+1);
				kors[i] = scan.nextInt();
				if (kors[i] < 0 || 100 < kors[i])
					System.out.println("��ȿ�� ����(0~100)�� �Ѿ���ϴ�. �ٽ� �Է��� �ּ���.");
			} while (kors[i] < 0 || 100 < kors[i]);
		
	}
	
}