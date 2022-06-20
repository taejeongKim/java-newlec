package ex15.marray;

import java.util.Scanner;

/*
 1. 상수형 변수를 활용하라. (반, 메뉴)
 2. 과목=3 (국어/영어/수학 순서)
 3. 2d array 사용
 4. 메뉴/입력/출력 부분의 코드를 나누어 메소드화 하라.
 5. while 문에 flag를 사용하라.
 */
public class Program3 {
	public static void main(String[] args) {

		final int yn = 6; // number of year
		int[][] kors = new int[yn][3];

		int menu;

		boolean running = true;
		final int MENU_INPUT = 1;
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3;
		String[] subjects = { "국어", "영어", "수학" };

		while (running) {

			menu = selectMenu();

			switch (menu) {

			case MENU_INPUT:

				inputScore(kors, subjects);
				break;

			case MENU_PRINT:

				printScore(kors, subjects);
				break;

			case MENU_EXIT:
				System.out.println("Good bye~~");
				running = false;
				break;

			default:
				System.out.println("입력오류, 1~3번까지만 입력할 수 있습니다.");
				break;

			}
		}
	}

	private static void printScore(int[][] kors, String[] subjects) {
		int total;
		float avg;

		// -------------- 성적 출력 부분 -----------------
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적출력       │");
		System.out.println("└──────────────────┘");

		for (int j = 0; j < kors.length; j++) {
			System.out.printf("--- %d학년 성적 ---\n", j + 1);

			total = kors[j][0] + kors[j][1] + kors[j][2];
			avg = total / 3.0f; // 처음부터 float으로 나눠줌.

			// 국어점수 자동 출력
			for (int i = 0; i < kors[j].length; i++)
				System.out.printf("%s : %3d\n", subjects[i], kors[j][i]);

			System.out.printf("총점 : %3d\n", total);
			// 평균이 63.33이 아닌 63.00이 나온 이유
			// 정수를 정수로 나누면 정수가된다. 이를 float로 변환하면 소수자리는 모두 0처리된다.
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("────────────────────");
		}

	}

	private static void inputScore(int[][] kors, String[] subjects) {

		Scanner scan = new Scanner(System.in);

		// -------------- 성적 입력 부분 -----------------
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적입력    │");
		System.out.println("└──────────────────┘");

		for (int j = 0; j < kors.length; j++) {
			System.out.printf("--- %d학년 성적 ---\n", j + 1);

			for (int i = 0; i < kors[j].length; i++) {

				do {
					System.out.printf("%s : ", subjects[i]);
					kors[j][i] = scan.nextInt();

					if (kors[j][i] < 0 || 100 < kors[j][i])
						System.out.println("0점 ~ 100점 사이의 점수를 입력해주세요!");
				} while (kors[j][i] < 0 || 100 < kors[j][i]);

			}
		}

	}

	private static int selectMenu() {
		int menu;
		Scanner scan = new Scanner(System.in);

		// -------------- 메뉴 부분 -----------------
		System.out.println("┌──────────────────┐");
		System.out.println("│      메뉴        │");
		System.out.println("└──────────────────┘");

		System.out.println("1) 성적입력");
		System.out.println("2) 성적출력");
		System.out.println("3) 종료");

		menu = scan.nextInt();
		return menu;
	}
}