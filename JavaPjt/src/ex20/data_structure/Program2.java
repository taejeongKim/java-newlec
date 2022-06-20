/*
<task>
1. 반이 늘어났다. 여러개 반의 성적을 관리해 보자. 
2. 구조체 배열을 사용한다.
<result>
┌──────────────────┐
│      성적입력    │
└──────────────────┘
---1반 성적---
국어 : 2
영어 : 2
수학 : 2
---2반 성적---
국어 : 3
영어 : 3
수학 : 3
┌──────────────────┐
│      성적출력    │
└──────────────────┘
---1반 성적---
국어 :   2
영어 :   2
수학 :   2
총점 :   6
평균 :   2.00

---2반 성적---
국어 :   3
영어 :   3
수학 :   3
총점 :   9
평균 :   3.00
*/
package ex20.data_structure;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		final int C = 2; // number of class
		//구조체 배열 사용
		Exam[] exams = new Exam[C];
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {

			// 메뉴함수는 menu를 리턴해줘야 한다.
			menu = inputMenu();

			switch (menu) {

			case 1:
				// 매개변수로 구조체(객체)의 리스트만 넘긴다. 리스트에는 아직 객체가 없다.
				// inputList에서 객체를 만들어 리스트에 채워야 한다.
				inputList(exams);
				break;

			case 2:
				// inputList에서 객체 리스트에 객체를 담았으니 객체와 연결된 리스트가 전달됨.
				printList(exams);
				break;

			case 3:
				System.out.println("Good-bye~");
				keepLoop = false;
//				break 종료;
				break;

			default:
				System.out.println("입력오류, 1~3번까지만 입력할 수 있습니다.");
				break;

			}
		}
	}

	private static void printList(Exam[] exams) {

		System.out.println("┌──────────────────┐");
		System.out.println("│      성적출력    │");
		System.out.println("└──────────────────┘");

		for (int i = 0; i < exams.length; i++) {
			// for문 안의 변수 선언
			// for 루프를 돌면서 불필요하게 변수 선언이 반복되는 것이 아님.
			// 변수는 함수가 호출될 때 한번만 선언이 됨.
			int total;
			float avg;
			
			// 임시변수 사용.
			Exam exam = exams[i];

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

	private static void inputList(Exam[] exams) {
		Scanner scan = new Scanner(System.in);

		System.out.println("┌──────────────────┐");
		System.out.println("│      성적입력    │");
		System.out.println("└──────────────────┘");

		for (int i = 0; i < exams.length; i++) {
			
			int kor, eng, math;
			
			System.out.printf("---%d반 성적---\n", i+1);
			
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
			
			exams[i] = exam;
			
			
		}
	}

	static int inputMenu() {

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

}