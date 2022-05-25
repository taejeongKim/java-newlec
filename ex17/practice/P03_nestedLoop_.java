package ex17.practice;

public class P03_nestedLoop_ {
	public static void main(String[] args) {
		/*
		 * 1 2 3 
		 * 4 5 6 
		 * 7 8 9
		 * 
		 * 위와 같은 결과물을 나타내 보자.
		 * 
		 */

		// case 1
		System.out.printf("%d ", 1);
		System.out.printf("%d ", 2);
		System.out.printf("%d ", 3);
		System.out.println();
		System.out.printf("%d ", 4);
		System.out.printf("%d ", 5);
		System.out.printf("%d ", 6);
		System.out.println();
		System.out.printf("%d ", 7);
		System.out.printf("%d ", 8);
		System.out.printf("%d ", 9);

		System.out.println();
		// case 2

		for (int j = 0; j < 3; j++) {

			for (int i = 0; i < 3; i++)
				
				System.out.printf("%d ", (i+1 + j*3));
			
			System.out.println();

		}

		System.out.println();
		// case 3

		for (int i = 0; i < 9; i++) {

			System.out.printf("%d ", i + 1);

			if (i % 3 == 2)
				System.out.println();
		}

	}
}