package test;

import java.util.Scanner;
/*
 1. 학년=2, 과목=3 (국어/영어/수학 순서)
 2. 성적 계산 프로그램
 3. 성적입력/성적출력/종료 등 메뉴
 4. 출력은 각 학년별 성적 합계/평균을 보여줌
 5. 성적은 1~100점 사이여야 함.
 */
public class Test {
	public static void main(String[] args) {
		
		final int Y = 2; // school year
		final int S = 3; // subject
		int[][] scores = new int[2][3];
		int total;
		float avg;
		boolean running = true;
		int menu;
		Scanner scan = new Scanner(System.in);
		
		// 초기화
		
		
		while(running) {
			
			// --------------  메뉴 부분 -----------------
			System.out.println("┌──────────────────┐");
			System.out.println("│       메뉴       │");
			System.out.println("└──────────────────┘");	
		
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");			
			
			//prompt

			System.out.print("> ");
			menu = scan.nextInt();
			
			//switch
			
			switch(menu) {
			case 1:
				//banner
				System.out.println("┌──────────────────┐");
				System.out.println("│     성적입력     │");
				System.out.println("└──────────────────┘");			
				//input
				System.out.print("국어 > ");
				menu = scan.nextInt();
				break;
			case 2:
				break;
			case 3:
				break;
			default:
					
			}
			
		}

	}
}
