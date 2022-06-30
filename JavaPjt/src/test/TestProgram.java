package test;

import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {

		int[] kors = new int[3];
		int total = 0;
		float avg = 0;
		boolean running = true;
		int menu;

		for (int i=0; i<3; i++)
			kors[i] = 0;
		
		while (running) {
			Scanner scan = new Scanner(System.in);

			// -------------- 메뉴 입력 부분 -----------------
			System.out.println("┌──────────────────┐");
			System.out.println("│      메뉴입력    │");
			System.out.println("└──────────────────┘");
			System.out.println("1) 성적입력");
			System.out.println("2) 성적출력");
			System.out.println("3) 종료");
			System.out.print("> ");

			menu = scan.nextInt();

			switch (menu) {
			
			case 1:
				// -------------- 성적 입력 부분 -----------------
				System.out.println("┌──────────────────┐");
				System.out.println("│      성적입력    │");
				System.out.println("└──────────────────┘");

				
				for (int i=0; i<3; i++) {
					int kor = kors[i];
					
					do {
						System.out.print("국어1 > ");
						kor = scan.nextInt();
						if (kor < 0 || 100 < kor)
							System.out.println("out of bounds, type again!");
					} while (kor < 0 || 100 < kor);
					
					kors[i] = kor;
				}
				
				total = kors[0] + kors[1] + kors[2];
				avg = total / 3.0f;
				
				break;
				
			case 2:
				// -------------- 성적 출력 부분 -----------------

				System.out.println("┌──────────────────┐");
				System.out.println("│      성적출력    │");
				System.out.println("└──────────────────┘");

				for (int i = 0; i < 3; i++) {
					System.out.printf("국어%d : %3d\n", i + 1, kors[i]);
				}

				System.out.printf("총점 : %3d\n", total);
				System.out.printf("평균 : %6.2f\n", avg);
				
				break;
			
			case 3:
				System.out.println("goog-bye~");
				running = false;
				
				break;
			
			default:
				System.out.println("please try again!");
				
				break;
			}

		}

	}

}