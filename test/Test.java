package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		/* ----- �迭�� �̿��Ͽ� ����� �����ϱ�
		 * ���� ���� 3��
		 * �޴� : �����Է�/�������/����
		 * �����Է� : ���� 1, 2, 3
		 * ������� : total, avg
		*/
		
		//int kor1, kor2, kor3;
		int[] kors = new int[3];
		int total=0;
		float avg=0;
		Scanner scan = new Scanner(System.in);
		int menu;
		
		for (int i=0; i<3; i++) {
			
			kors[i] = 0;
		}
		
		����:
		while (true) {
			
			// ---- �޴� �κ�
			
			System.out.println("����������������������������������������");
			System.out.println("��      �޴�          ��");
			System.out.println("����������������������������������������");
			
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			
			
			menu = scan.nextInt();
			
			// switch�� �б� 1, 2, 3, �̿�
			
			switch(menu) {
			
			case 1: 
				// ---- �����Է� �κ�
				
				System.out.println("����������������������������������������");
				System.out.println("��      �����Է�       ��");
				System.out.println("����������������������������������������");
				// �Է¹��� ��ȿ�� �˻� �ʿ�
				
					
				for (int i = 0; i < 3; i++) {
					
					do {
						System.out.printf("����%d > ", i + 1);
						kors[i] = scan.nextInt();
						if (kors[i]<1 || 100 < kors[i]) 
							System.out.println("�Է¹��� (1~100)�� �Ѿ���ϴ�.");
					}while(kors[i]<1 || 100 < kors[i]);
				
				}
				
				break;
				
			case 2:
				
				// ---- ������� �κ�
				
				System.out.println("����������������������������������������");
				System.out.println("��      �������       ��");
				System.out.println("����������������������������������������");
				
				
				for (int i = 0; i < 3; i++) {
					System.out.printf("����%d : %d\n", i + 1, kors[i]);
				}
				
				for (int i = 0; i < 3; i++) {
					total += kors[i];
				}
				
				avg = total / 3.0f;
				
				
				System.out.printf("���� : %d\n", total);
				System.out.printf("��� : %.2f\n", avg);
				System.out.println("----------------------");
				
				break;
				
			case 3:
				
				// ---- ���� �κ�
				break ����;	
//				System.exit(0);
				
			default:
				System.out.println("�߸��� �����Դϴ�. �ٽ� ������ �ּ���.");
				
			}
			
		}
		
		System.out.println("Good-bye~~");
		
	// ---- End
	}
}