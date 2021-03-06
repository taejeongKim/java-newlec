package exam_management;

import java.util.Scanner;

public abstract class ExamConsole {
	// 클래스 부분에 연산은 원래 사용하면 안되었다. 
	// 아래는 특별히 연산이 사용되었고 초기화를 하고 있다.
	// ExamConsole과 ExamList 관계는 compositon Has A 관계이다.
	private ExamList list = new ExamList();
	
	public void printList() {
		printList(list.size());
	}

	// overload함수
	public void printList(int size) {

		System.out.println("┌──────────────────┐");
		System.out.println("│      성적출력    │");
		System.out.println("└──────────────────┘");

//		int size = list.current;
		for (int i = 0; i < size; i++) {

			int total;
			float avg;
			// data 가져오는 부분 분리
			Exam exam = list.get(i); //this.exams[i];

			total = exam.total();
			avg = exam.avg();
			
			System.out.printf("---%d반 성적---\n", i+1);
			
			System.out.printf("국어 : %3d\n", exam.getKor());
			System.out.printf("영어 : %3d\n", exam.getEng());
			System.out.printf("수학 : %3d\n", exam.getMath());
			
			onPrint(exam);

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
			
			// setter가 아닌 생성자를 오버로드해서 활용해서 초기화해 보자.
			
//			Exam exam = new Exam(kor, eng, math);
			Exam exam = makeExam();
			exam.setKor(kor);
			exam.setEng(eng);
			exam.setMath(math);
			
			onInput(exam);

			/*--------- add ---------------*/
			//data 추가하는 부분 분리
			list.add(exam);
	}

	public int inputMenu() {
		
		Scanner scan = new Scanner(System.in);

		// 메뉴 함수
		System.out.println("┌──────────────────┐");
		System.out.println("│      메뉴        │");
		System.out.println("└──────────────────┘");

		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");

		System.out.print("> ");
		int menu = scan.nextInt();
		
		return menu;
	}
	// event method, 추상메소드 패턴
	protected abstract void onInput(Exam exam);
	protected abstract void onPrint(Exam exam);
	
	// factory method, 추상메소드 패턴
	protected abstract Exam makeExam() ;

	
}
