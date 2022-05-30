package ex15.marray;

import java.util.Scanner;
/*
 1. 반=가변, 과목=3 (국어/영어/수학 순서)
 2. 성적 계산 프로그램
 3. 성적입력/성적출력/종료 등 메뉴
 4. 출력은 각 반별 성적 합계/평균을 보여줌
 5. 성적은 1~100점 사이여야 함.
 */
public class Program3 {
	public static void main(String[] args) {
		
		final int C = 2; // number of class
		final int S = 3; // number of subject
		int[][] scores = new int[C][S];
		String[] subject = {"국어","영어","수학"};
		boolean running = true;
		final int MENU_INPUT = 1; // 성적입력
		final int MENU_OUTPUT = 2;// 성적출력
		final int MENU_EXIT = 3;// 종료
		
		while(running) {
			
			int menu = selectMenu();
			
			//switch
			
			switch(menu) {
			
			case MENU_INPUT:

				inputScore(scores, subject);
				break;
				
			case MENU_OUTPUT:

				printScore(scores, subject);
				break;
				
			case MENU_EXIT:
				
				System.out.println("Good bye ~");
				running = false;
				break;
				
			default:
				
				System.out.println("입력오류, 1~3번까지만 입력할 수 있습니다.");
				break;
			}
			
		}

	}

	private static int selectMenu() {
		int menu;
		
		Scanner scan = new Scanner(System.in);
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
		
		return menu;
	}

	private static void printScore(int[][] scores, String[] subject) {
		int total;
		float avg;
		
		//banner
		System.out.println("┌──────────────────┐");
		System.out.println("│     성적출력     │");
		System.out.println("└──────────────────┘");	
		
		for (int j=0; j<scores.length; j++) {
			
			total = 0;
			avg = 0.0f;
			
			System.out.printf("< %d반 >\n", j+1);
			
			for (int i=0; i<scores[j].length; i++) {
				System.out.printf("%s > %d\n", subject[i], scores[j][i]);
				total += scores[j][i];
				avg = total / 3.0f;
			}
			
			System.out.printf("%d반 총점 : %3d\n", j+1, total);
			System.out.printf("%d반 평균 : %6.2f\n", j+1, avg);
			System.out.println("────────────────────");
		}
		
	}

	private static void inputScore(int[][] scores, String[] subject) {
		Scanner scan = new Scanner(System.in);
		
		//banner
		System.out.println("┌──────────────────┐");
		System.out.println("│     성적입력     │");
		System.out.println("└──────────────────┘");			
		//input
		for (int j=0; j<scores.length; j++) {
			for (int i=0; i<3; i++) {
				do {
					System.out.printf("%d반 %s > ", j+1, subject[i]);
					scores[j][i] = scan.nextInt();
					int score = scores[j][i];
					
					if (score < 0 || 100 < score)
						System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
				} while (scores[j][i] < 0 || 100 < scores[j][i]);
			}
			System.out.println();
		}
		
	}
}
