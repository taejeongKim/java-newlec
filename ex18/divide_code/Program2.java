 /*
 * 코드 나누기 연습
 * 메뉴, 출력부분도 분리해보자.
 * 구조화된 코드와 그렇지 않은 코드를 비교하며 장점을 찾아보자.
 */

package ex18.divide_code;

import java.util.Scanner;

public class Program2 {
	
	// 변수를 전역화(모든 함수가 공유)하려면 static (does not move or change) 을 붙여준다.
	// 변수의 static과 함수의 static은 의미가 다르다.
	
	static int[] kors = new int[3];
	
	public static void main(String[] args) {
		
		int menu;
		boolean keepLoop = true;

		for (int i=0; i<3; i++) {
			kors[i] = 0;
		}

//		종료:
		while (keepLoop) {

			// 메뉴함수는 menu를 리턴해줘야 한다.
			menu = 메뉴입력();
			
			switch (menu) {

			case 1: 
				성적입력();
				break;
				
			case 2:
				성적출력();
				break;
				
			case 3: 
				System.out.println("Good-bye~");
				keepLoop = false;
//				break 종료;
				break;

			default:
				System.out.println("입력오류, 1~3번까지만 입력할 수 있습니다.");
				break;
			
			}
		}
	}
	
	static void 성적입력() {
		
		// -------------- 성적 입력 함수 -----------------
		
		Scanner scan = new Scanner(System.in);
		
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
		
	}
	
	static void 성적출력() {

		// -------------- 성적 출력 함수 -----------------
		
		// 아래 변수들은 성적 출력에만 사용되고 있으므로 전역화할 필요 없다.
		int total;
		float avg;
		
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
		
	}

	// 메뉴입력함수는 리턴값이 있는 함수이므로 리턴값의 형식을 써줘야 한다. 
	static int 메뉴입력() {
		
		Scanner scan = new Scanner(System.in);
		
		// -------------- 메뉴 함수 -----------------
		System.out.println("┌──────────────────┐");
		System.out.println("│      메뉴        │");
		System.out.println("└──────────────────┘");
		
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		
		System.out.print("> ");
		int menu = scan.nextInt();
		
		return menu;
	}
}