 /*
 * �ڵ� ������ ����
 * �Լ��� ��ȭ�� �ܺ� ȯ�濡 ������� �Լ��� ���ϰ� �����
 */

package ex18.divide_code;

import java.util.Scanner;

public class Program3 {
	
	
	
	public static void main(String[] args) {
		
		// ������ kors�� korList�� �ٲپ���... 
		int[] korList = new int[3];
		int menu;
		boolean keepLoop = true;

		for (int i=0; i<3; i++) {
			korList[i] = 0;
		}

//		����:
		while (keepLoop) {

			// �޴��Լ��� menu�� ��������� �Ѵ�.
			menu = �޴��Է�();
			
			switch (menu) {

			case 1: 
				�����Է�(korList);
				break;
				
			case 2:
				�������(korList);
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
	
	static void �����Է�(int[] kors) {
		
		// ���� �Է� �Լ� 
		
		Scanner scan = new Scanner(System.in);
		int kor; // ���ʿ��� ������ �ּ�ȭ�ϱ� ���� ����Ȱ��
		
		System.out.println("����������������������������������������");
		System.out.println("��      �����Է�    ��");
		System.out.println("����������������������������������������");
		
		for (int i=0; i<3; i++) {
			
			do {
				System.out.printf("����%d : ", i+1);
				kor = scan.nextInt();
				if (kor < 0 || 100 < kor)
					System.out.println("��ȿ�� ����(0~100)�� �Ѿ���ϴ�. �ٽ� �Է��� �ּ���.");
			} while (kor < 0 || 100 < kor);
			kors[i] = kor;
		}
	}
	
	static void �������(int[] kors) {

		// ���� ��� �Լ� 
		
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
		
		// �޴� �Լ�
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