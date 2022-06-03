package ex22.methods;

import java.util.Scanner;

public class ExamList {

	Exam[] exams;
	int current;

	static void printList(ExamList list) {
		// 코드 집중화
		// 오버로드함수가 있을 경우 한 곳만 수정하면 모두 반영하도록 한다.
		printList(list, list.current);
	}
	
	// overload함수
	static void printList(ExamList list, int size) {

		System.out.println("┌──────────────────┐");
		System.out.println("│      성적출력    │");
		System.out.println("└──────────────────┘");

//		int size = list.current;
		for (int i = 0; i < size; i++) {
			// for문 안의 변수 선언
			// for 루프를 돌면서 불필요하게 변수 선언이 반복되는 것이 아님.
			// 변수는 함수가 호출될 때 한번만 선언이 됨.
			int total;
			float avg;
			
			// 임시변수 사용.
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

	static void inputList(ExamList list) {
		Scanner scan = new Scanner(System.in);

		System.out.println("┌──────────────────┐");
		System.out.println("│      성적입력    │");
		System.out.println("└──────────────────┘");

			int kor, eng, math;
			
			System.out.print("---%d반 성적---\n");
			
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
			
			// 임시 변수 활용
			// 객체 생성 및 리스트 삽입
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

	public static void init(ExamList list) {
		list.exams = new Exam[3];
		list.current = 0;
		
	}

}
