package test;

import java.util.Scanner;

public class Test {
    //���������� �����ϴ�?
	static int[] kors = new int[3];
	
	public static void main(String[] args) {


		int menu;
		boolean keepLoop = true;

		for (int i=0; i<3; i++) {
			kors[i] = 0;
		}

//		����:
		while (keepLoop) {

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
	
	static int �޴��Է�() {
		
		Scanner scan = new Scanner(System.in);
		
		// -------------- �޴� �κ� -----------------
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
	
	static void �������() {
		
		int total;
		float avg;

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
	}
	
	static void �����Է�(){
		
		Scanner scan = new Scanner(System.in);
		
		// -------------- ���� �Է� �κ� -----------------
		
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
