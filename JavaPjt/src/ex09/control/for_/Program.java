/*
task 4)
1. 성적출력에서 국어점수 리스트가 자동으로 출력되도록 하라.(for문 활용)
2. 점수는 동일하다고 가정한다.
 * */

package ex09.control.for_;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		int kor1, kor2, kor3;
		int total;
		float avg;

		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;

		
		while(true) {
		
			// --------------  성적 입력 부분 -----------------
			System.out.println("┌──────────────────┐");
			System.out.println("│      성적입력       │");
			System.out.println("└──────────────────┘");		
			
			Scanner scan = new Scanner (System.in);
			
			// do while 문
			do {
				System.out.print("국어1 : ");
				kor1 = scan.nextInt();	
				if (kor1 < 0 || 100 < kor1)
					System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
			} while (kor1 < 0 || 100 < kor1);
			
			do {
				System.out.print("국어2 : ");
				kor2 = scan.nextInt();	
				if (kor2 < 0 || 100 < kor2)
					System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
			} while (kor2 < 0 || 100 < kor2);
			
			do {
				System.out.print("국어3 : ");
				kor3 = scan.nextInt();	
				if (kor3 < 0 || 100 < kor3)
					System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
			} while (kor3 < 0 || 100 < kor3);
			
	
			// --------------  성적 출력 부분 -----------------
	
			total = kor1 + kor2 + kor3;
			avg = total / 3.0f; // 처음부터 float으로 나눠줌.	
			
			
			System.out.println("┌──────────────────┐");
			System.out.println("│      성적출력       │");
			System.out.println("└──────────────────┘");
			
			// ---- For 문을 활용해 보자
			// 우선 점수1만 반복하도록 ...
			
			for (int i=0; i<3; i++) {
				System.out.printf("국어%d : %3d\n", i+1, kor1);
		
			}

			
			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("────────────────────");
	
		}
	}
}