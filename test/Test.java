package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		/* ----- 배열을 이용하여 국어성적 관리하기
		 * 국어 성적 3개
		 * 메뉴 : 성적입력/성적출력/종료
		 * 성적입력 : 국어 1, 2, 3
		 * 성적출력 : total, avg
		*/
		
		//int kor1, kor2, kor3;
		int[] kors = new int[3];
		int total=0;
		float avg=0;
		Scanner scan = new Scanner(System.in);
		int menu;
		
		for (int i=0; i<3; i++) {
			
			kors[i] = 0;
		}
		
		종료:
		while (true) {
			
			// ---- 메뉴 부분
			
			System.out.println("┌──────────────────┐");
			System.out.println("│      메뉴          │");
			System.out.println("└──────────────────┘");
			
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			
			
			menu = scan.nextInt();
			
			// switch로 분기 1, 2, 3, 이외
			
			switch(menu) {
			
			case 1: 
				// ---- 성적입력 부분
				
				System.out.println("┌──────────────────┐");
				System.out.println("│      성적입력       │");
				System.out.println("└──────────────────┘");
				// 입력범위 유효성 검사 필요
				
					
				for (int i = 0; i < 3; i++) {
					
					do {
						System.out.printf("국어%d > ", i + 1);
						kors[i] = scan.nextInt();
						if (kors[i]<1 || 100 < kors[i]) 
							System.out.println("입력범위 (1~100)을 넘어갔습니다.");
					}while(kors[i]<1 || 100 < kors[i]);
				
				}
				
				break;
				
			case 2:
				
				// ---- 성적출력 부분
				
				System.out.println("┌──────────────────┐");
				System.out.println("│      성적출력       │");
				System.out.println("└──────────────────┘");
				
				
				for (int i = 0; i < 3; i++) {
					System.out.printf("국어%d : %d\n", i + 1, kors[i]);
				}
				
				for (int i = 0; i < 3; i++) {
					total += kors[i];
				}
				
				avg = total / 3.0f;
				
				
				System.out.printf("총점 : %d\n", total);
				System.out.printf("평균 : %.2f\n", avg);
				System.out.println("----------------------");
				
				break;
				
			case 3:
				
				// ---- 종료 부분
				break 종료;	
//				System.exit(0);
				
			default:
				System.out.println("잘못된 선택입니다. 다시 선택해 주세요.");
				
			}
			
		}
		
		System.out.println("Good-bye~~");
		
	// ---- End
	}
}