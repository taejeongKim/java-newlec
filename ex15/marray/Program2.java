 /*
 * 학년별 국어점수를 알아보자. 즉 아래와 같이 출력되면 된다.
 * data가 다층적이 되었다. 다차원 배열을 사용해야 한다.
 * <1학년 국어성적>
 * 국어1 : 23
 * 국어2 : 33
 * 국어3 : 45
 * 총점 : 343
 * 평균 : 23.32
 * <2학년 국어성적>
 * ...
 * 다차원 배열은 일열로 늘어놓은 1차원으로 변경이 가능하다. 
 * 우선 1차원 배열로 개념상으로만 다차원처럼 해결해 보자.
 */

package ex15.marray;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {

		//int kor1, kor2, kor3;
		//int[] kors = new int[3];
		//9개 원소가 들어갈 수 있는 1차원 배열을 만든다.
		//int [] kors = new int[3*3];
		int [][] kors = new int[3][3];
		int total;
		float avg;
		int menu;

	
		// 초기화. 중첩된 for문 사용, 안밖으로 3번씩 돈다. 결과는 9번
		for (int j=0; j<3; j++) {
			for (int i=0; i<3; i++) {
				//kors[3*j + i] = 0;
				kors[j][i] = 0;
				
			}
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
			case 1: 
				
				// -------------- 성적 입력 부분 -----------------
				System.out.println("┌──────────────────┐");
				System.out.println("│      성적입력       │");
				System.out.println("└──────────────────┘");
				
				
				// do while 문 반복을 for문으로 ... array 사용
				/*
				do {
					System.out.print("국어1 : ");
					kor1 = scan.nextInt();
					if (kor1 < 0 || 100 < kor1)
						System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
				} while (kor1 < 0 || 100 < kor1);
				
				do {
					System.out.print("국어2 : ");
					kor2 = scan.nextInt();
					if (kor2 < 0 || 100 < kor2)
						System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
				} while (kor2 < 0 || 100 < kor2);
				
				do {
					System.out.print("국어3 : ");
					kor3 = scan.nextInt();
					if (kor3 < 0 || 100 < kor3)
						System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
				} while (kor3 < 0 || 100 < kor3);
				*/
				
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
			case 2:
				
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
			case 3: 
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