package ex17.practice;

public class P05_omok2 {
	public static void main(String[] args) {

		// 오목판 그리기

		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++)
				System.out.printf("%c", '┼');
			System.out.println();

		}
		
		System.out.println();
		// x=4 y=3 지점에 검은 돌 놓기

		for (int y = 1; y <= 10; y++) {

			for (int x = 1; x <= 10; x++) {

				if (x == 4 && y == 3)
					System.out.printf("%c", '●');
				else
					System.out.printf("%c", '┼');
			}

			System.out.println();

		}
	}
}