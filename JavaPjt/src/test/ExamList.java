package test;

import java.util.Scanner;

public class ExamList {

	private Exam[] exams;
	private int current;
	
	public ExamList() {
		//코드 집중화
		this(3);
	}
	
	public ExamList(int size) {
		current = 0;
		exams = new Exam[size];
	}
	
	public void inputList() {
		
		// 성적 입력 함수 
		
		Scanner scan = new Scanner(System.in);
		int kor, eng, math; // 불필요한 연산을 최소화하기 위해 변수활용
		
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적입력    │");
		System.out.println("└──────────────────┘");
			
			System.out.printf("-- %d반 --\n", current+1);
			
			do {
				System.out.print("국어 > ");
				kor = scan.nextInt();
				if (kor < 0 || 100 < kor)
					System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
			} while (kor < 0 || 100 < kor);
			
			do {
				System.out.print("영어 > ");
				eng = scan.nextInt();
				if (eng < 0 || 100 < eng)
					System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
			} while (eng < 0 || 100 < eng);
			
			do {
				System.out.print("수학 > ");
				math = scan.nextInt();
				if (math < 0 || 100 < math)
					System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
			} while (math < 0 || 100 < math);
			
			Exam exam = new Exam(kor, eng, math);
			
		
			if (exams.length == current) {
				Exam[] temp = new Exam[current + 5];
				for (int i=0; i<current; i++)
					temp[i] = exams[i];
				exams = temp;
			}
			
			exams[current] = exam;
			current++;
		}
	public void printList() {

		// 코드 집중화 
		printList(current);

	}
	public void printList(int size) {

		// 성적 출력 함수 
		
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적출력    │");
		System.out.println("└──────────────────┘");
		
		if (size <= current) {
			for (int i = 0; i < size; i++) {
				
				System.out.printf("-- %d반 --\n", i+1);
				
				Exam exam = exams[i];
				int kor = exam.getKor();
				int eng = exam.getEng();
				int math = exam.getMath();
				
				System.out.printf("국어 : %d\n", kor);
				System.out.printf("영어 : %d\n", eng);
				System.out.printf("수학 : %d\n", math);
				
				int total = exam.total();
				float avg = exam.avg();
				
				System.out.printf("총점 : %d\n", total);
				System.out.printf("평균 : %.2f\n", avg);
				System.out.println("────────────────────");
			}
			
		}
		else
			System.out.printf("%d개 더 입력하세요!\n", size - current);
	}
}
