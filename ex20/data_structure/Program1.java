/* 구조체를 이용한 코드 작성하기
 * 
[task]
1. 관리해야할 과목이 국어,영어,수학으로 늘어났다.
2. 기존 국어성적 관리프로그램을 응용한다.
<결과>
┌──────────────────┐
│      성적입력    │
└──────────────────┘
국어 : 1
영어 : 2
수학 : 3
┌──────────────────┐
│      성적출력    │
└──────────────────┘
국어 :   1
영어 :   2
수학 :   3
총점 :   6
평균 :   2.00
────────────────────
 */

package ex20.data_structure;

import java.util.Scanner;

public class Program1 {
	
	
	public static void main(String[] args) {
		
		//참조변수: 객체의 주소를 갖고 있지만 공간은 없다. (C++의 포인터와 다름)
		// 객체의 이름이라 생각하는 것이 편함.
		Exam exam = new Exam(); // 참조형 변수에는 객체를 참조해야 한다. 객체를 만들 때 메모리에 올라감
		input(exam);
		print(exam);
		
	}

	private static void print(Exam exam) {
		
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적출력    │");
		System.out.println("└──────────────────┘");
		
		int total;
		float avg;
		
		// 임시변수를 활용하면 코드가 간결해진다.
		// 연산은 줄이는 것이 좋다.
		
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		
		total = kor + eng + math;
		avg = total / 3.0f; 
		
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
			
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("────────────────────");
	}

	private static void input(Exam exam) {
		
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적입력    │");
		System.out.println("└──────────────────┘");
		
		Scanner scan = new Scanner(System.in);
		int kor,eng, math;
		
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
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
	}
}