/*
 * 상수형 변수
 * 
문제)
case문의 1, 2 등 숫가 의미하는 것이 뭔지 불명확하다. 

task 9)
1. case문의 라벨(label)을 상수형 변수로 변경하라.
2. 학년수, 과목수를 상수형 변수로 변경하라.
 */

package ex16.finalvar;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		//상수형 변수를 사용하면 array 사이즈가 변할 때마다 아래 내용을 모두 수정할 필요가 없다.
		final int N = 5;
		int[] kors = new int[N];
		int total;
		float avg;
		int menu; // 1.input 2.print 3.exit
		final int MENU_INPUT = 1;
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3;
		

//		kor1 = 0;
//		kor2 = 0;
//		kor3 = 0;
		
		// 배열의 data는 기본적으로 0으로 초기화된다. 따라서, 아래와 같이 하지 않아도 된다.
		for (int i=0; i<N; i++) {
			kors[i] = 0;
		}

		// break 시 빠져나오는 지점.
		종료:
		while (true) {

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
				
				for (int i=0; i<N; i++)
					do {
						System.out.printf("국어%d : ", i+1);
						kors[i] = scan.nextInt();
						if (kors[i] < 0 || 100 < kors[i])
							System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
					} while (kors[i] < 0 || 100 < kors[i]);
									
				break;
				
			// label
			case MENU_PRINT:
				
				// -------------- 성적 출력 부분 -----------------
				
				//total = kor1 + kor2 + kor3;
				total = 0;
				for (int i=0; i<N; i++)
					total += kors[i];
				avg = total / (float)N; // 처음부터 float으로 나눠줌.
				
				System.out.println("┌──────────────────┐");
				System.out.println("│      성적출력       │");
				System.out.println("└──────────────────┘");
				
				// ---- For 문을 활용해 보자, array 활용
				
				for (int i = 0; i < N; i++) {
					System.out.printf("국어%d : %3d\n", i + 1, kors[i]);
					
				}
				
				System.out.printf("총점 : %3d\n", total);
				System.out.printf("평균 : %6.2f\n", avg);
				System.out.println("────────────────────");
				
				break;
				
			// label	
			case MENU_EXIT: 
				//아래 break는 switch문을 빠져나올 뿐 while문을 빠져나오지 못한다.
				break 종료;
			// label	
			default:
				
				System.out.println("입력오류, 1~3번까지만 입력할 수 있습니다.");
				break;
			
			}
			
			
		}
		System.out.println("Good-bye~");
	}
}