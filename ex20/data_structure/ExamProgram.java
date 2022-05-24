 /*
 * ���� �������� ���α׷� Ȱ��
 * ����� �ƴ϶� ����, ���б��� �����ϴ� ���α׷����� ������Ű�� ...
 */

package ex20.data_structure;

import java.util.Scanner;

public class ExamProgram {
	
	
	public static void main(String[] args) {
		
		Exam exam = new Exam();
		input(exam);
		print(exam);
		
	}

	private static void print(Exam exam) {
		
		int total;
		float avg;
		
		total = exam.kor + exam.eng + exam.math;
		avg = total / 3.0f; 
		
		System.out.println("����������������������������������������");
		System.out.println("��      �������    ��");
		System.out.println("����������������������������������������");
		
		System.out.printf("���� : %3d\n", exam.kor);
		System.out.printf("���� : %3d\n", exam.eng);
		System.out.printf("���� : %3d\n", exam.math);
			
		
		System.out.printf("���� : %3d\n", total);
		System.out.printf("��� : %6.2f\n", avg);
		System.out.println("����������������������������������������");
	}

	private static void input(Exam exam) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����������������������������������������");
		System.out.println("��      �����Է�    ��");
		System.out.println("����������������������������������������");
		
		int kor,eng, math;
		
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
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
	}
}