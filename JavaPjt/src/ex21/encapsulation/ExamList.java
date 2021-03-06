package ex21.encapsulation;

import java.util.Scanner;

public class ExamList {

	Exam[] exams;
	int current;

	public static void printList(ExamList list) {

		printList(list, list.current);
	}
	
	public static void printList(ExamList list, int size) {

		System.out.println("┌──────────────────┐");
		System.out.println("│      성적출력    │");
		System.out.println("└──────────────────┘");

		for (int i = 0; i < size; i++) {

			int total;
			float avg;
			
			Exam exam = list.exams[i];

			total = exam.kor + exam.eng + exam.math;
			avg = total / 3.0f;
			
			System.out.printf("---%d반 성적---\n", i+1);
			
			System.out.printf("국어 : %3d\n", exam.kor);
			System.out.printf("영어 : %3d\n", exam.eng);
			System.out.printf("수학 : %3d\n", exam.math);

			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			
			System.out.println();
		}
	}

	public static void inputList(ExamList list) {
		Scanner scan = new Scanner(System.in);

		System.out.println("┌──────────────────┐");
		System.out.println("│      성적입력    │");
		System.out.println("└──────────────────┘");

			int kor, eng, math;
			
			System.out.printf("<%d반 성적>\n", list.current+1);
			
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
			
			Exam exam = new Exam();
			exam.kor = kor;
			exam.eng = eng;
			exam.math = math;
			
			Exam[] exams = list.exams;
			int size = list.current;
			
			if (exams.length == size) {
				// 1. 새로운 배열 생성
				Exam[] temp = new Exam[exams.length + 5];
				// 2. 값 이주시키기
				for (int i=0; i<size; i++)
					temp[i] = exams[i];
				// 3. 연결 객체 바꾸기
				list.exams = temp;
			}
			
			list.exams[list.current] = exam;
			list.current++;
	}
	// 초기화 함수
	public static void init(ExamList list) {
		list.exams = new Exam[3];
		list.current = 0;
		
	}


}
