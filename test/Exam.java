package test;

import java.util.Scanner;

public class Exam {
	int kor, eng, math;
	
	void inputExam() {
		System.out.println("----- 성적 입력 -----");
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("국어 > ");
			kor = scan.nextInt();
			if (kor< 0 || 100<kor)
				System.out.println("Out of bounds, please input again!!");
		} while (kor< 0 || 100<kor);
		
		do {
			System.out.print("영어 > ");
			eng = scan.nextInt();
			if (eng< 0 || 100<eng)
				System.out.println("Out of bounds, please input again!!");
		} while (eng< 0 || 100<eng);
		
		do {
			System.out.print("수학 > ");
			math = scan.nextInt();
			if (math< 0 || 100<math)
				System.out.println("Out of bounds, please input again!!");
		} while (math< 0 || 100<math);
	
	}
	
	void printExam() {
		System.out.println("----- 성적 출력 -----");
		
		int total;
		float avg;
		
		total = kor + eng + math;
		avg = total / 3.0f;
		
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		System.out.printf("합계 : %d\n", total);
		System.out.printf("평균 : %.2f\n", avg);
	}
}

