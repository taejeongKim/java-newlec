package ex17.practice;

public class P04_omok {
	public static void main(String[] args) {
		//외곽부분 다듬기
		
		System.out.println();
		// x=4 y=3 지점에 검은 돌 놓기

		for (int y = 1; y <= 10; y++) {

			for (int x = 1; x <= 10; x++) {

				if (x == 4 && y == 3)
					System.out.printf("%c", '●');
				
				else if (x ==1 && y == 1)
					System.out.printf("%c", '┌');
				else if (x ==10 && y == 1)
					System.out.printf("%c", '┐');
				else if (x ==1 && y == 10)
					System.out.printf("%c", '└');
				else if (x ==10 && y == 10)
					System.out.printf("%c", '┘');
				else if (y == 1)
					System.out.printf("%c", '┬');
				else if (y == 10)
					System.out.printf("%c", '┴');
				else if (x == 1)
					System.out.printf("%c", '├');
				else if (x == 10)
					System.out.printf("%c", '┤');
				else
					System.out.printf("%c", '┼');
			}

			System.out.println();

		}
	}
}