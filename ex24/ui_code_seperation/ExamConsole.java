package ex24.ui_code_seperation;

import java.util.Scanner;

public class ExamConsole {

	// 연산자는 함수/메서드 안에서만 사용되는 것이 정상이다.
	// 이 클래스가 만들어질 때 ExamList 객체가 자동으로 만들어 지므로
	// 이 두 클래스의 관계는 composition Has A 관계이다.
	private ExamList list = new ExamList();
	
	/*  예전에는 모두 아래와 같이 하였다.
	 * 즉, 연산은 생성자에서 이루어진다. 그러나,
	 * 자바 버전이 올라가면서 아래 생성자는 컴파일러가 자동으로 만들어준다.
	 * 개발자는 위와 같이 할 수 있게 되었다.
	private ExamList list;
	
	public ExamConsole() {
		list = new ExamList();
	}
	*/
	
	public void printList() {
		// 코드 집중화
		// 오버로드함수가 있을 경우 한 곳만 수정하면 모두 반영하도록 한다.
		//this.printList(this.current);
		printList(list.size());
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
			// data 가져오는 부분 분리
			Exam exam = list.get(i); //this.exams[i];

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

			/*--------- add ---------------*/
			//data 추가하는 부분 분리
			list.add(exam);
	}
}
