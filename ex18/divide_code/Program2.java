 /*
 * �ڵ� ������ ����
 * �޴�, ��ºκе� �и��غ���.
 * ����ȭ�� �ڵ�� �׷��� ���� �ڵ带 ���ϸ� ������ ã�ƺ���.
 */

package ex18.divide_code;

import java.util.Scanner;

public class Program2 {
	
	// ������ ����ȭ(��� �Լ��� ����)�Ϸ��� static (does not move or change) �� �ٿ��ش�.
	// ������ static�� �Լ��� static�� �ǹ̰� �ٸ���.
	
	static int[] kors = new int[3];
	
	public static void main(String[] args) {
		
		int menu;
		boolean keepLoop = true;

		for (int i=0; i<3; i++) {
			kors[i] = 0;
		}

//		����:
		while (keepLoop) {

			// �޴��Լ��� menu�� ��������� �Ѵ�.
			menu = �޴��Է�();
			
			switch (menu) {

			case 1: 
				�����Է�();
				break;
				
			case 2:
				�������();
				break;
				
			case 3: 
				System.out.println("Good-bye~");
				keepLoop = false;
//				break ����;
				break;

			default:
				System.out.println("�Է¿���, 1~3�������� �Է��� �� �ֽ��ϴ�.");
				break;
			
			}
		}
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
	
	static void �������() {

		// -------------- ���� ��� �Լ� -----------------
		
		// �Ʒ� �������� ���� ��¿��� ���ǰ� �����Ƿ� ����ȭ�� �ʿ� ����.
		int total;
		float avg;
		
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
		
	}

	// �޴��Է��Լ��� ���ϰ��� �ִ� �Լ��̹Ƿ� ���ϰ��� ������ ����� �Ѵ�. 
	static int �޴��Է�() {
		
		Scanner scan = new Scanner(System.in);
		
		// -------------- �޴� �Լ� -----------------
		System.out.println("����������������������������������������");
		System.out.println("��      �޴�        ��");
		System.out.println("����������������������������������������");
		
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		
		System.out.print("> ");
		int menu = scan.nextInt();
		
		return menu;
	}
}