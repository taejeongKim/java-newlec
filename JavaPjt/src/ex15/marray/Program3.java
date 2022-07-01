/*
[task]
1. 상수형 변수 사용 (menu)
2. flag 사용 (running), 종료 시 사용
 */

package ex15.marray;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {

		int [][] kors = new int[3][3];
		int total;
		float avg;
		int menu;
		final int MENU_INPUT = 1; // 상수형 변수
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3;
		boolean running = true;

	
		// 초기화. 중첩된 for문 사용, 안밖으로 3번씩 돈다. 결과는 9번
		for (int j=0; j<3; j++) {
			for (int i=0; i<3; i++) {
				//kors[3*j + i] = 0;
				kors[j][i] = 0;
				
			}
		}


		while (running) {

			Scanner scan = new Scanner(System.in);

			// -------------- 메뉴 부분 -----------------
			System.out.println("┌──────────────────┐");
			System.out.println("│      메뉴         │");
			System.out.println("└──────────────────┘");
			
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			
			System.out.print("> ");
			menu = scan.nextInt();
			
			switch (menu) {
			// label
			case MENU_INPUT: 
				
				// -------------- 성적 입력 부분 -----------------
				System.out.println("┌──────────────────┐");
				System.out.println("│      성적입력       │");
				System.out.println("└──────────────────┘");
				
							
				for (int j=0; j<3; j++) {
					
					for (int i=0; i<3; i++)
						do {
							System.out.printf("%d학년 국어%d : ", j+1, i+1);
							kors[j][i] = scan.nextInt();
							if (kors[j][i] < 0 || 100 < kors[j][i])
								System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
						} while (kors[j][i] < 0 || 100 < kors[j][i]);
				}
									
				
				break;
				
			// label
			case MENU_PRINT:
				
				// -------------- 성적 출력 부분 -----------------
				System.out.println("┌──────────────────┐");
				System.out.println("│      성적출력       │");
				System.out.println("└──────────────────┘");
				
				for (int j=0; j<3; j++) {
					
					//total = kor1 + kor2 + kor3;
					total = kors[j][0] + kors[j][1] + kors[j][2];
					avg = total / 3.0f; // 처음부터 float으로 나눠줌.
					
					
					// ---- For 문을 활용해 보자, array 활용
					
					System.out.printf("<%d학년 국어성적>\n", j+1);
					for (int i = 0; i < 3; i++) {
						System.out.printf("국어%d : %3d\n", i + 1, kors[j][i]);
						
					}
					
					System.out.printf("총점 : %3d\n", total);
					System.out.printf("평균 : %6.2f\n", avg);
					System.out.println("────────────────────");
				}
				
				break;
				
			// label	
			case MENU_EXIT: 
				System.out.println("Good-bye~");
				running = false;
				break;
				
			// label	
			default:
				
				System.out.println("입력오류, 1~3번까지만 입력할 수 있습니다.");
				break;
			
			}
			
			
		}
		
	}
}