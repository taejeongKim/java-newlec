/*
task 3)
1. 입력된 국어점수의 유효성을 검사한다. (1점~100점)
2. 유효범위가 아닐 경우 해당 점수를 재 입력하도록 한다.
3. 전체 프로세스가 무한반복되도록 하라.
*/

package ex07.control.while_;

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
			
			System.out.print("국어1 : ");
			kor1 = scan.nextInt();
			
			// if (!(0 <= kor1 && kor1 <= 100)) {
			// if (0 > kor1 || kor1 > 100) {
			while (kor1 < 0 || 100 < kor1) {
				System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
				System.out.print("국어1 : ");
				kor1 = scan.nextInt();
			}
			
			System.out.print("국어2 : ");
			kor2 = scan.nextInt();
			
			System.out.print("국어3 : ");
			kor3 = scan.nextInt();
	
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