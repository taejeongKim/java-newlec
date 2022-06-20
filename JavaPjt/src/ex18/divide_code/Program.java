
 /*
 * 코드 나누기 연습용 코드 원본
 * 3개 국어성적을 받아 합과 평균을 보여주는 프로그램
 */

package ex18.divide_code;

import java.util.Scanner;

public class Program {
	
	
	public static void main(String[] args) {
		
		int[] kors = new int[3];
		int total;
		float avg;
		int menu;
		boolean keepLoop = true;

		for (int i=0; i<3; i++) {
			kors[i] = 0;
		}

		종료:
		while (keepLoop) {

			Scanner scan = new Scanner(System.in);

			// -------------- 메뉴 부분 -----------------
			System.out.println("┌──────────────────┐");
			System.out.println("│      메뉴        │");
			System.out.println("└──────────────────┘");
			
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			
			System.out.print("> ");
			menu = scan.nextInt();
			
			switch (menu) {

			case 1: 
				
				// -------------- 성적 입력 부분 -----------------
				
				System.out.println("┌──────────────────┐");
				System.out.println("│      성적입력    │");
				System.out.println("└──────────────────┘");
				
				for (int i=0; i<3; i++)
					do {
						System.out.printf("국어%d : ", i+1);
						kors[i] = scan.nextInt();
						if (kors[i] < 0 || 100 < kors[i])
							System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
					} while (kors[i] < 0 || 100 < kors[i]);
				
				break;
				
			case 2:
				
				// -------------- 성적 출력 부분 -----------------
				
				total = kors[0] + kors[1] + kors[2];
				avg = total / 3.0f; 
				
				System.out.println("┌──────────────────┐");
				System.out.println("│      성적출력    │");
				System.out.println("└──────────────────┘");
				
				for (int i = 0; i < 3; i++) {
					System.out.printf("국어%d : %3d\n", i + 1, kors[i]);
					
				}
				
				System.out.printf("총점 : %3d\n", total);
				System.out.printf("평균 : %6.2f\n", avg);
				System.out.println("────────────────────");
				
				break;
				
			case 3: 
				
				break 종료;

			default:
				
				System.out.println("입력오류, 1~3번까지만 입력할 수 있습니다.");
				break;
			
			}
		}
		System.out.println("Good-bye~");
	}
}