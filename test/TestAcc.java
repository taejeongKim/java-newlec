package test;

import java.util.Scanner;

public class TestAcc {
	public static void main(String[] args) {
		
		final int M = 6; // 학년수
		final int N = 3; // 과목수
		int[][] kors = new int[M][N];
		int total;
		float avg;
		boolean running = true;
		Scanner scan = new Scanner(System.in);
		int menu;
		final int NEMU_INPUT = 1; // 성적입력
		final int NEMU_OUTPUT = 2;// 성적출력
		final int NEMU_EXIT = 3;// 종료
		
		
		
		// 초기화
		for (int j=0; j<M; j++) {
			for (int i=0; i<N; i++) 
				kors[j][i] = 0;
		}
		
		종료:
		while (running) {
			
			// --------------  메뉴 부분 -----------------
			System.out.println("┌──────────────────┐");
			System.out.println("│       메뉴       │");
			System.out.println("└──────────────────┘");	
		
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			
			//prompt
			System.out.println("> ");
			menu = scan.nextInt();
			
			switch (menu) {
			
			case NEMU_INPUT:
				
				// --------------  성적 입력 부분 -----------------
				System.out.println("┌──────────────────┐");
				System.out.println("│      성적입력    │");
				System.out.println("└──────────────────┘");	
				
				// 사용자 입력
				// 유효성 검사
				
				for (int j=0; j<M; j++) {
					for (int i=0; i<N; i++) 
						do {
							//prompt
							System.out.printf("%d학년 국어%d > ", j+1, i+1);
							kors[j][i] = scan.nextInt();
							if (kors[j][i]<0 || 100<kors[j][i])
								System.out.println("1에서 100까지의 숫자를 넣어 주세요!");
						}while (kors[j][i]<0 || 100<kors[j][i]);
					
				}
				
				break;
				
			case NEMU_OUTPUT:
				
				// --------------  성적 출력 부분 -----------------
				System.out.println("┌──────────────────┐");
				System.out.println("│      성적출력    │");
				System.out.println("└──────────────────┘");
				
				// 국어점수 자동 3번 출력
				for (int j=0; j<M; j++) {
					
					total = kors[j][0] + kors[j][1] + kors[j][2];
					avg = total/3.0f;
					System.out.printf("<%d학년 국어점수>\n", j+1);
					
					for (int i=0; i<N; i++) 
						System.out.printf("국어%d : %3d\n", i+1, kors[j][i]);
				
					System.out.printf("total : %d\n", total);
					System.out.printf("avg : %.2f\n", avg);
					System.out.println("------------------");
				}
				
				break;
				
			case NEMU_EXIT:
				break 종료;
			
			default:
				System.out.println("입력오류, 1~3번까지만 입력할 수 있습니다.");
				break;
			
			}
		}
		
		System.out.print("Good-bye ~");
	}
}
