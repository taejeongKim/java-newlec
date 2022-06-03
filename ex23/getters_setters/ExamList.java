package ex23.getters_setters;

import java.util.Scanner;
/*
 인스턴스 메소드의 this는 생략이 가능하다.
 * */
public class ExamList {

	private Exam[] exams;
	private int current;

	// instance method
	// parameter가 없으며 static 이 아니다.
	public void printList() {
		// 코드 집중화
		// 오버로드함수가 있을 경우 한 곳만 수정하면 모두 반영하도록 한다.
		//this.printList(this.current);
		printList(current);
	}

	// overload함수
	public void printList(int size) {

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
//			Exam exam = this.exams[i];
			Exam exam = exams[i];

			// data 구조만을 사용한 연산작업을 객체에 맡겨보자
//			total = exam.getKor() + exam.getEng() + exam.getMath();
//			avg = total / 3.0f;
			
			total = exam.total();
			avg = exam.avg();
			
			System.out.printf("---%d반 성적---\n", i+1);
			
			System.out.printf("국어 : %3d\n", exam.getKor());
			System.out.printf("영어 : %3d\n", exam.getEng());
			System.out.printf("수학 : %3d\n", exam.getMath());

			System.out.printf("합계 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			
			System.out.println();
		}
	}

	//instance method
	public void inputList() {
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
			
			// setter가 아닌 생성자를 오버로드해서 활용해서 초기화해 보자.
			Exam exam = new Exam(kor, eng, math);

			
			Exam[] exams = this.exams;
			int size = current;

			
			if (exams.length == size) {
				// 1. 새로운 배열 생성
				Exam[] temp = new Exam[exams.length + 5];
				// 2. 값 이주시키기
				for (int i=0; i<size; i++)
					temp[i] = exams[i];
				// 3. 연결 객체 바꾸기
				exams = temp;
			}
			
			exams[this.current] = exam;
			current++;
	}

	// 생성자
	public ExamList() {
//		exams = new Exam[3];
//		current = 0;
		//오버로드 생성자를 부르며 인자를 전달한다. 코드 중복을 피할 수 있다.
		this(3);
		
	}
	
	public ExamList(int size) {
		exams = new Exam[size];
		current = 0;
		
	}

}