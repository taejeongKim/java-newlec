package ex17.practice;

public class P5_omok2 {
	public static void main(String[] args) {

		// ������ �׸���

		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++)
				System.out.printf("%c", '��');
			System.out.println();

		}
		
		System.out.println();
		// x=4 y=3 ������ ���� �� ����

		for (int y = 1; y <= 10; y++) {

			for (int x = 1; x <= 10; x++) {

				if (x == 4 && y == 3)
					System.out.printf("%c", '��');
				else
					System.out.printf("%c", '��');
			}

			System.out.println();

		}
	}
}
