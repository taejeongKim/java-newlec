 /*
 * 코드 나누기 연습
 * (문제) 함수들이 전역변수들의 변화에 영향을 받고 있다.
 * 함수에서 필요한 변수를 파라미터로 제공 받도록 해 보라.
 * 이름 함수의 고립과라고 한다.
 * 함수의 고립화로 외부 환경에 취약해진 함수를 강하게 만들라
 */

package ex18.divide_code;

import java.util.Scanner;

public class Program3Structured {
	
	
	
	public static void main(String[] args) {
		
		// 누군가 kors를 korList로 바꾸었다... 
		int[] korList = new int[3];
		int menu;
		boolean keepLoop = true;

		for (int i=0; i<3; i++) {
			korList[i] = 0;
		}

//		종료:
		while (keepLoop) {

			// 메뉴함수는 menu를 리턴해줘야 한다.
			menu = inputMenu();
			
			switch (menu) {

			case 1: 
				inputKors(korList);
				break;
				
			case 2:
				printKors(korList);
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
	
	static void inputKors(int[] kors) {
		
		// 성적 입력 함수 
		
		Scanner scan = new Scanner(System.in);
		int kor; // 불필요한 연산을 최소화하기 위해 변수활용
		
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적입력    │");
		System.out.println("└──────────────────┘");
		
		for (int i=0; i<3; i++) {
			
			do {
				System.out.printf("국어%d : ", i+1);
				kor = scan.nextInt();
				if (kor < 0 || 100 < kor)
					System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
			} while (kor < 0 || 100 < kor);
			kors[i] = kor;
		}
	}
	
	static void printKors(int[] kors) {

		// 성적 출력 함수 
		
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
	static int inputMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		// 메뉴 함수
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