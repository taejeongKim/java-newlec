package test;

import java.util.Scanner;

public class Test {
    //전역변수가 위험하다?
	static int[] kors = new int[3];
	
	public static void main(String[] args) {


		int menu;
		boolean keepLoop = true;

		for (int i=0; i<3; i++) {
			kors[i] = 0;
		}

//		종료:
		while (keepLoop) {

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
	
	static int 메뉴입력() {
		
		Scanner scan = new Scanner(System.in);
		
		// -------------- 메뉴 부분 -----------------
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
	
	static void 성적출력() {
		
		int total;
		float avg;

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
	}
	
	static void 성적입력(){
		
		Scanner scan = new Scanner(System.in);
		
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
	}
}
