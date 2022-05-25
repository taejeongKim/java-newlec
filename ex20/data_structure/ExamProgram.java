/*
 * 기존 성적관리 프로그램 활용
 * 국어뿐 아니라 영어, 수학까지 관리하는 프로그램으로 발전시키라 ...
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
		
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적출력    │");
		System.out.println("└──────────────────┘");
		
		System.out.printf("국어 : %3d\n", exam.kor);
		System.out.printf("영어 : %3d\n", exam.eng);
		System.out.printf("수학 : %3d\n", exam.math);
			
		
		System.out.printf("총점 : %3d\n", total);
		System.out.printf("평균 : %6.2f\n", avg);
		System.out.println("────────────────────");
	}

	private static void input(Exam exam) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적입력    │");
		System.out.println("└──────────────────┘");
		
		int kor,eng, math;
		
		do {
			System.out.printf("국어 : ");
			kor = scan.nextInt();
			if (kor < 0 || 100 < kor)
				System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("영어 : ");
			eng = scan.nextInt();
			if (eng < 0 || 100 < eng)
				System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
		} while (eng < 0 || 100 < eng);		
		
		do {
			System.out.printf("수학 : ");
			math = scan.nextInt();
			if (math < 0 || 100 < math)
				System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
		} while (math < 0 || 100 < math);
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
	}
}