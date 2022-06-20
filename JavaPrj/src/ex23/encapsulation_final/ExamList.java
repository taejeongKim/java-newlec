package ex23.encapsulation_final;

import java.util.Scanner;
/*
private 키워드를 이해하자.
캡슐을 보호하는 보호막
 * */
public class ExamList {

	private Exam[] exams;
	private int current;

	public void printList() {
		printList(current);
	}

	public void printList(int size) {

		System.out.println("┌──────────────────┐");
		System.out.println("│      성적출력    │");
		System.out.println("└──────────────────┘");

		for (int i = 0; i < size; i++) {
			int total;
			float avg;
			
			Exam exam = exams[i];

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

	public void inputList() {
		Scanner scan = new Scanner(System.in);

		System.out.println("┌──────────────────┐");
		System.out.println("│      성적입력    │");
		System.out.println("└──────────────────┘");

			int kor, eng, math;
			
			System.out.printf("---%d반 성적---\n", current+1);
			
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
			
			/*
			 * Exam exam = new Exam();
			 * exam.setKor(kor); 
			 * exam.setEng(eng); 
			 * exam.setMath(math);
			 */
			//setter가 아닌 생성자를 오버로드해서 활용해서 초기화해 보자. 
			Exam exam = new Exam(kor, eng, math);

			
//			Exam[] exams = this.exams;
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
			
			exams[current] = exam;
			current++;
	}

	// 생성자
	public ExamList() {
//		exams = new Exam[3];
//		current = 0;
		//오버로드 생성자를 부르며 인자를 전달한다. 코드 중복을 피할 수 있다.
		//생성자는 this로 호출된다.
		this(3);
		
	}
	
	public ExamList(int size) {
		exams = new Exam[size];
		current = 0;
		
	}

}
