/*
(문제)
1. 과목이 너무 제한적이다. 과목에 자유를 ~~~
(task 7)
1. 3개 국어점수를 array에 담아 활용하라.
2. 성적입력부분에서 입력받을 때 do~while문이 반복되고 있다. 
for문을 활용하여 반복을 제거하라.
*/

package ex14.array;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		//int kor1, kor2, kor3;
		int[] kors = new int[3];
		int total;
		float avg;
		int menu;

//		kor1 = 0;
//		kor2 = 0;
//		kor3 = 0;
		
		// 배열의 data는 기본적으로 0으로 초기화된다. 따라서, 아래와 같이 하지 않아도 된다.
		for (int i=0; i<3; i++) {
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
				
				for (int i=0; i<3; i++)
					do {
						System.out.printf("국어%d : ", i+1);
						kors[i] = scan.nextInt();
						if (kors[i] < 0 || 100 < kors[i])
							System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
					} while (kors[i] < 0 || 100 < kors[i]);
									
				
				break;
				
			// label
			case 2:
				
				// -------------- 성적 출력 부분 -----------------
				
				//total = kor1 + kor2 + kor3;
				total = kors[0] + kors[1] + kors[2];
				avg = total / 3.0f; // 처음부터 float으로 나눠줌.
				
				System.out.println("┌──────────────────┐");
				System.out.println("│      성적출력       │");
				System.out.println("└──────────────────┘");
				
				// ---- For 문을 활용해 보자, array 활용
				
				for (int i = 0; i < 3; i++) {
					System.out.printf("국어%d : %3d\n", i + 1, kors[i]);
					
				}
				
				System.out.printf("총점 : %3d\n", total);
				System.out.printf("평균 : %6.2f\n", avg);
				System.out.println("────────────────────");
				
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