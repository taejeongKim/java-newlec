package ex26.abstraction_for_service;

import java.util.Scanner;
/*
 * 1. 팩토리 메소드 패턴
 * 2. 이벤트 메소드 패턴
 * */
public abstract class ExamConsole {

	private ExamList list = new ExamList();
	
	public void print() {
		print(list.size());
	}

	public void print(int size) {

		System.out.println("┌──────────────────┐");
		System.out.println("│      성적출력    │");
		System.out.println("└──────────────────┘");

		for (int i = 0; i < size; i++) {

			int total;
			float avg;
			Exam exam = list.get(i); //this.exams[i];

			total = exam.total();
			avg = exam.avg();
			
			System.out.printf("---%d반 성적---\n", i+1);
			
			System.out.printf("국어 : %3d\n", exam.getKor());
			System.out.printf("영어 : %3d\n", exam.getEng());
			System.out.printf("수학 : %3d\n", exam.getMath());
			
			// 이벤트 메소드라는 이름의 추상메소드
			// 추가되는 과목을 자식이 처리하도록 한다.
			onPrint(exam);
			
			System.out.printf("합계 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			
			System.out.println();
		}
	}
	
	


	public void input() {
		Scanner scan = new Scanner(System.in);

		System.out.println("┌──────────────────┐");
		System.out.println("│      성적입력    │");
		System.out.println("└──────────────────┘");

			int kor, eng, math;
			
			System.out.printf("---%d반 성적---\n", list.size()+1);
			
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
			
			
			
			// 추상클래스의 객체화 오류나는 부분을 팩토리 메소드로 해결
			// Exam은 추상클래스라 객체화할 수 없지만, 이들의 자식들...
			// NewlecExam ... 들은 객체화가 가능하다. 
			// 객체화, 즉 객체를 만드는 메소드라해서 팩트리라는 이름이 붙었다.
			
			// Exam exam = new Exam(kor, eng, math);
			Exam exam = makeExam(); // 팩토리 메소드 호출
			
			exam.setKor(kor);
			exam.setEng(eng);
			exam.setMath(math);
			
			// "입력 받을 때"라는 의미 onInput
			// 사건에 기반해서 실행하는 함수, 이벤트 메소드
			// 추가적인 과목을 입력하는 곳
			onInput(exam);	
			
			list.add(exam);

	}
	// 추상 메소드(이벤트 메소드)
	// 입출력시 추가되는 항목을 자식이 책임지도록 함.
	protected abstract void onPrint(Exam exam);
	protected abstract void onInput(Exam exam);

	// 팩토리 메소드
	// 자식에게 구현을 강제함
	protected abstract Exam makeExam();
}
