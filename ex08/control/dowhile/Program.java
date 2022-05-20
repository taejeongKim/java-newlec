/*
 * 유효성 검사
 * do-while 문 활용
 * 
 * */

package ex08.control.dowhile;

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
			// 조건이 충족되는 한 do문을 반복하라.
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
			avg = total / 3.0f; 
			
			
			System.out.println("┌──────────────────┐");
			System.out.println("│      성적출력       │");
			System.out.println("└──────────────────┘");
			System.out.printf("국어1 : %3d\n", kor1);
			System.out.printf("국어2 : %3d\n", kor2);
			System.out.printf("국어3 : %3d\n", kor3);
			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("────────────────────");
	
		}
	}
}