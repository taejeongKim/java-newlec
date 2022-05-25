/*
 * 사용자로 부터 입력을 받은 값을 사용하여 총점과 평균을 계산하고 출력하는 프로그램
 * 
 * */

package ex05.io.scanner;

import java.util.Scanner;

// import 하는 3가지 방법 1. 직접 입력, 2. 코드 작성시 빨간 줄의 도움 3. ctrl + shift + o 로 자동입력

public class Program {
	public static void main(String[] args) {

		int kor1, kor2, kor3;
		int total;
		float avg;

		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;


		// --------------  성적 입력 부분 -----------------
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적입력       │");
		System.out.println("└──────────────────┘");		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("국어1 : ");
		kor1 = scan.nextInt();
		
		System.out.print("국어2 : ");
		kor2 = scan.nextInt();
		
		System.out.print("국어3 : ");
		kor3 = scan.nextInt();

		// --------------  성적 출력 부분 -----------------

		total = kor1 + kor2 + kor3;
		avg = total / 3.0f; // 처음부터 float으로 나눠줌.	
		
		
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적출력       │");
		System.out.println("└──────────────────┘");
		System.out.printf("국어1 : %3d\n", kor1);
		System.out.printf("국어2 : %3d\n", kor2);
		System.out.printf("국어3 : %3d\n", kor3);
		System.out.printf("총점 : %3d\n", total);
		// 평균이 63.33이 아닌 63.00이 나온 이유
		// 정수를 정수로 나누면 정수가된다. 이를 float로 변환하면 소수자리는 모두 0처리된다.
		System.out.printf("평균 : %6.2f\n", avg);
		System.out.println("────────────────────");
	
		
	}
}