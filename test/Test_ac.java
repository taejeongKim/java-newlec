package test;

import java.util.Scanner;

public class Test_ac{
	public static void main (String[] args) {
		
		//1,2,3�г� �� 3�� �������� ��, ��� ���ϱ�
		
//		int[] kors = new int[3];
//		int[] kors = new int[3*3];
		
		final int N1 = 3;
		final int N2 = 3;
		int[][] kors = new int[N1][N2];
		int total = 0;
		float avg = 0;
		int menu;
		Scanner scan = new Scanner(System.in);
		final int MENU_INPUT = 1;
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3;
	
		����:
		while (true) {
			
			// --------------  ���� �Է� �κ� -----------------
			System.out.println("����������������������������������������");
			System.out.println("��      �޴�          ��");
			System.out.println("����������������������������������������");	
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			
			menu = scan.nextInt();
			
			switch (menu) {
			
			case MENU_INPUT:
				
				// --------------  ���� �Է� �κ� -----------------
				System.out.println("����������������������������������������");
				System.out.println("��      �����Է�       ��");
				System.out.println("����������������������������������������");	
				
				
				//--��ȿ��
				/*
				do {
					System.out.print("����1 > ");
					kors[0] = scan.nextInt();
					if (kors[0]<0 || 100<kors[0])
						System.out.println("��ȿ�� ����(0~100)�� �Ѿ���ϴ�. �ٽ� �Է��� �ּ���.");
				} while (kors[0]<0 || 100<kors[0]);
				
				do {
					System.out.print("����2 > ");
					kors[1] = scan.nextInt();
					if (kors[1]<0 || 100<kors[1])
						System.out.println("��ȿ�� ����(0~100)�� �Ѿ���ϴ�. �ٽ� �Է��� �ּ���.");
					
				}while (kors[1]<0 || 100<kors[1]);
				
				do {
					System.out.print("����3 > ");
					kors[2] = scan.nextInt();
					if (kors[2]<0 || 100<kors[2])
						System.out.println("��ȿ�� ����(0~100)�� �Ѿ���ϴ�. �ٽ� �Է��� �ּ���.");
				}while (kors[2]<0 || 100<kors[2]);
				*/
				
				for (int j=0; j<N1; j++) {
					for (int i=0; i<N2; i++) {
						do {
							System.out.printf("%d�г� ����%d > ",j+1 ,i+1);
							kors[j][i] = scan.nextInt();
							if (kors[j][i]<0 || 100<kors[j][i])
								System.out.println("��ȿ�� ����(0~100)�� �Ѿ���ϴ�. �ٽ� �Է��� �ּ���.");
						} while (kors[j][i]<0 || 100<kors[j][i]);
					}
				}
				
				break;
				
			case MENU_PRINT:
		
				// --------------  ���� ��� �κ� -----------------
				System.out.println("����������������������������������������");
				System.out.println("��      �������       ��");
				System.out.println("����������������������������������������");
				
//				for (int i=0; i<9; i++) {
//					total += kors[i];
//				}
//				avg = total / 3.0f;
				
				for (int j=0; j<N1; j++) {
					
					total = kors[j][0]+kors[j][1]+kors[j][2];
					avg = total / 3.0f;
					
					System.out.printf("<%d�г�>\n", j+1);
					
					for (int i=0; i<N2; i++) {
						System.out.printf("����%d : %3d\n ",i+1, kors[j][i] );
					}
					System.out.printf("total : %3d\n", total);
					System.out.printf("avg : %.2f\n", avg);
					System.out.println("����������������������������������������");
				}
				
				break;

			case MENU_EXIT:

				break ����;

			
			default:
				System.out.println("�Է¿���, 1~3�������� �Է��� �� �ֽ��ϴ�.");
				break;
			
			}//end of switch
			
		}//end of while
		
		System.out.println("Goodbye");
		
	}//end of main
}