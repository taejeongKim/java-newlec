 /*
 * ���ݱ����� �ڵ带 array�� ����Ͽ� �ٲپ��.
 * array�� ȿ�뼺�� ���� �� �ִ°�?
 */

package ex14.array;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		//int kor1, kor2, kor3;
		int[] kors = new int[3];
		int total;
		float avg;
		int menu;

//		kor1 = 0;
//		kor2 = 0;
//		kor3 = 0;
		
		// �迭�� data�� �⺻������ 0���� �ʱ�ȭ�ȴ�. ����, �Ʒ��� ���� ���� �ʾƵ� �ȴ�.
		for (int i=0; i<3; i++) {
			kors[i] = 0;
		}

		// break �� ���������� ����.
		����:
		while (true) {

			Scanner scan = new Scanner(System.in);

			// -------------- �޴� �κ� -----------------
			System.out.println("����������������������������������������");
			System.out.println("��      �޴�         ��");
			System.out.println("����������������������������������������");
			
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			
			System.out.print("> ");
			menu = scan.nextInt();
			
			switch (menu) {
			// label
			case 1: 
				
				// -------------- ���� �Է� �κ� -----------------
				System.out.println("����������������������������������������");
				System.out.println("��      �����Է�       ��");
				System.out.println("����������������������������������������");
				
				
				// do while �� �ݺ��� for������ ... array ���
				/*
				do {
					System.out.print("����1 : ");
					kor1 = scan.nextInt();
					if (kor1 < 0 || 100 < kor1)
						System.out.println("��ȿ�� ����(0~100)�� �Ѿ���ϴ�. �ٽ� �Է��� �ּ���.");
				} while (kor1 < 0 || 100 < kor1);
				
				do {
					System.out.print("����2 : ");
					kor2 = scan.nextInt();
					if (kor2 < 0 || 100 < kor2)
						System.out.println("��ȿ�� ����(0~100)�� �Ѿ���ϴ�. �ٽ� �Է��� �ּ���.");
				} while (kor2 < 0 || 100 < kor2);
				
				do {
					System.out.print("����3 : ");
					kor3 = scan.nextInt();
					if (kor3 < 0 || 100 < kor3)
						System.out.println("��ȿ�� ����(0~100)�� �Ѿ���ϴ�. �ٽ� �Է��� �ּ���.");
				} while (kor3 < 0 || 100 < kor3);
				*/
				
				for (int i=0; i<3; i++)
					do {
						System.out.printf("����%d : ", i+1);
						kors[i] = scan.nextInt();
						if (kors[i] < 0 || 100 < kors[i])
							System.out.println("��ȿ�� ����(0~100)�� �Ѿ���ϴ�. �ٽ� �Է��� �ּ���.");
					} while (kors[i] < 0 || 100 < kors[i]);
									
				
				break;
				
			// label
			case 2:
				
				// -------------- ���� ��� �κ� -----------------
				
				//total = kor1 + kor2 + kor3;
				total = kors[0] + kors[1] + kors[2];
				avg = total / 3.0f; // ó������ float���� ������.
				
				System.out.println("����������������������������������������");
				System.out.println("��      �������       ��");
				System.out.println("����������������������������������������");
				
				// ---- For ���� Ȱ���� ����, array Ȱ��
				
				for (int i = 0; i < 3; i++) {
					System.out.printf("����%d : %3d\n", i + 1, kors[i]);
					
				}
				
				System.out.printf("���� : %3d\n", total);
				System.out.printf("��� : %6.2f\n", avg);
				System.out.println("����������������������������������������");
				
				break;
				
			// label	
			case 3: 
				//�Ʒ� break�� switch���� �������� �� while���� ���������� ���Ѵ�.
				break ����;
			// label	
			default:
				
				System.out.println("�Է¿���, 1~3�������� �Է��� �� �ֽ��ϴ�.");
				break;
			
			}
			
			
		}
		System.out.println("Good-bye~");
	}
}