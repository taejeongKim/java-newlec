package test;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
		
		final int C = 3; // number of class
		Exam[]exam = new Exam[C];
		boolean running = true;
		final int NEMU_INPUT = 1; // 성적입력
		final int NEMU_OUTPUT = 2;// 성적출력
		final int NEMU_EXIT = 3;// 종료
		
		while(running) {
			
			int menu = selectMenu();
			
			//switch
			
			switch(menu) {
			
			case NEMU_INPUT:

				inputScore(exam);
				break;
				
			case NEMU_OUTPUT:

				printScore(exam);
				break;
				
			case NEMU_EXIT:
				
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

	private static void printScore(Exam[] exam) {
		int total;
		float avg;
		
		//banner
		System.out.println("┌──────────────────┐");
		System.out.println("│     성적출력     │");
		System.out.println("└──────────────────┘");	
		
//		for (int j=0; j<scores.length; j++) {
			
//			total = 0;
//			avg = 0.0f;
//			
//			System.out.printf("< %d반 >\n", j+1);
//			
//			for (int i=0; i<scores[j].length; i++) {
//				System.out.printf("%s > %d\n", subject[i], scores[j][i]);
//				total += scores[j][i];
//				avg = total / 3.0f;
//			}
//			
//			System.out.printf("%d반 총점 : %3d\n", j+1, total);
//			System.out.printf("%d반 평균 : %6.2f\n", j+1, avg);
//			System.out.println("────────────────────");
		}
		
//	}

	private static void inputScore(Exam[] exam) {
		Scanner scan = new Scanner(System.in);
		
		//banner
		System.out.println("┌──────────────────┐");
		System.out.println("│     성적입력     │");
		System.out.println("└──────────────────┘");			
		//input
		
		
//		for (int j=0; j<scores.length; j++) {
//			for (int i=0; i<3; i++) {
//				do {
//					System.out.printf("%d반 %s > ", j+1, subject[i]);
//					scores[j][i] = scan.nextInt();
//					int score = scores[j][i];
//					
//					if (score < 0 || 100 < score)
//						System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
//				} while (scores[j][i] < 0 || 100 < scores[j][i]);
//			}
//			System.out.println();
//		}
		
		for (int i=0; i<exam.length; i++) {

			exam[i] = new Exam();
			
			System.out.printf("%d반 과목%d > ", i + 1, i + 1);
			exam[i].kor = scan.nextInt();			
			
		}
		
	}

	}
