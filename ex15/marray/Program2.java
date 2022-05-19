 /*
 * �г⺰ ���������� �˾ƺ���. �� �Ʒ��� ���� ��µǸ� �ȴ�.
 * data�� �������� �Ǿ���. ������ �迭�� ����ؾ� �Ѵ�.
 * <1�г� �����>
 * ����1 : 23
 * ����2 : 33
 * ����3 : 45
 * ���� : 343
 * ��� : 23.32
 * <2�г� �����>
 * ...
 * ������ �迭�� �Ͽ��� �þ���� 1�������� ������ �����ϴ�. 
 * �켱 1���� �迭�� ��������θ� ������ó�� �ذ��� ����.
 */

package ex15.marray;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {

		//int kor1, kor2, kor3;
		//int[] kors = new int[3];
		//9�� ���Ұ� �� �� �ִ� 1���� �迭�� �����.
		//int [] kors = new int[3*3];
		int [][] kors = new int[3][3];
		int total;
		float avg;
		int menu;

	
		// �ʱ�ȭ. ��ø�� for�� ���, �ȹ����� 3���� ����. ����� 9��
		for (int j=0; j<3; j++) {
			for (int i=0; i<3; i++) {
				//kors[3*j + i] = 0;
				kors[j][i] = 0;
				
			}
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
				
				for (int j=0; j<3; j++) {
					
					for (int i=0; i<3; i++)
						do {
							System.out.printf("%d�г� ����%d : ", j+1, i+1);
							kors[j][i] = scan.nextInt();
							if (kors[j][i] < 0 || 100 < kors[j][i])
								System.out.println("��ȿ�� ����(0~100)�� �Ѿ���ϴ�. �ٽ� �Է��� �ּ���.");
						} while (kors[j][i] < 0 || 100 < kors[j][i]);
				}
									
				
				break;
				
			// label
			case 2:
				
				// -------------- ���� ��� �κ� -----------------
				System.out.println("����������������������������������������");
				System.out.println("��      �������       ��");
				System.out.println("����������������������������������������");
				
				for (int j=0; j<3; j++) {
					
					//total = kor1 + kor2 + kor3;
					total = kors[j][0] + kors[j][1] + kors[j][2];
					avg = total / 3.0f; // ó������ float���� ������.
					
					
					// ---- For ���� Ȱ���� ����, array Ȱ��
					
					System.out.printf("<%d�г� �����>\n", j+1);
					for (int i = 0; i < 3; i++) {
						System.out.printf("����%d : %3d\n", i + 1, kors[j][i]);
						
					}
					
					System.out.printf("���� : %3d\n", total);
					System.out.printf("��� : %6.2f\n", avg);
					System.out.println("����������������������������������������");
				}
				
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