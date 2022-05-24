package ex20.data_structure;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		//����ü �迭 ���
		Exam[] exams = new Exam[3];
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {

			// �޴��Լ��� menu�� ��������� �Ѵ�.
			menu = inputMenu();

			switch (menu) {

			case 1:
				// �Ű������� ����ü(��ü)�� ����Ʈ�� �ѱ��. ����Ʈ���� ���� ��ü�� ����.
				// inputList���� ��ü�� ����� ����Ʈ�� ä���� �Ѵ�.
				inputList(exams);
				break;

			case 2:
				// inputList���� ��ü ����Ʈ�� ��ü�� ������� ��ü�� ����� ����Ʈ�� ���޵�.
				printList(exams);
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

	private static void printList(Exam[] exams) {

		System.out.println("����������������������������������������");
		System.out.println("��      �������    ��");
		System.out.println("����������������������������������������");

		for (int i = 0; i < 3; i++) {
			// for�� ���� ���� ����
			// for ������ ���鼭 ���ʿ��ϰ� ���� ������ �ݺ��Ǵ� ���� �ƴ�.
			// ������ �Լ��� ȣ��� �� �ѹ��� ������ ��.
			int total;
			float avg;
			Exam exam = exams[i];

			total = exam.kor + exam.eng + exam.math;
			avg = total / 3.0f;

			System.out.printf("���� : %3d\n", exam.kor);
			System.out.printf("���� : %3d\n", exam.eng);
			System.out.printf("���� : %3d\n", exam.math);

			System.out.printf("���� : %3d\n", total);
			System.out.printf("��� : %6.2f\n", avg);
			System.out.println("����������������������������������������");
		}
	}

	private static void inputList(Exam[] exams) {
		Scanner scan = new Scanner(System.in);

		System.out.println("����������������������������������������");
		System.out.println("��      �����Է�    ��");
		System.out.println("����������������������������������������");

		for (int i = 0; i < 3; i++) {
			
			int kor, eng, math;

			do {
				System.out.printf("���� : ");
				kor = scan.nextInt();
				if (kor < 0 || 100 < kor)
					System.out.println("��ȿ�� ����(0~100)�� �Ѿ���ϴ�. �ٽ� �Է��� �ּ���.");
			} while (kor < 0 || 100 < kor);

			do {
				System.out.printf("���� : ");
				eng = scan.nextInt();
				if (eng < 0 || 100 < eng)
					System.out.println("��ȿ�� ����(0~100)�� �Ѿ���ϴ�. �ٽ� �Է��� �ּ���.");
			} while (eng < 0 || 100 < eng);

			do {
				System.out.printf("���� : ");
				math = scan.nextInt();
				if (math < 0 || 100 < math)
					System.out.println("��ȿ�� ����(0~100)�� �Ѿ���ϴ�. �ٽ� �Է��� �ּ���.");
			} while (math < 0 || 100 < math);
			
			// �ӽ� ���� Ȱ��
			// ��ü ���� �� ����Ʈ ����
			Exam exam = new Exam();
			exam.kor = kor;
			exam.eng = eng;
			exam.math = math;
			
			exams[i] = exam;
		}
	}

	static int inputMenu() {

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
