package ex17.practice;

public class P9_array3 {

	public static void main(String[] args) {
		// �迭 ��������

		// 1~7 ������ �ʱ�ȭ�� �迭�� ����ÿ�.

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		// int[] arr = new int[] {1,2,3,4,5,6,7};

		for (int i = 0; i < 7; i++)
			System.out.printf("%d ", arr[i]);
		
		System.out.println();
		// �迭�� ������ �ʹ� ������ 10�� ������ ������ �������� �����Ͻÿ�.
		
		int[] temp = new int[10];
		
		for (int i = 0; i < 7; i++)
			temp[i] = arr[i];
		
		arr = temp;
		
		arr[7] = 8;
		
		for (int i = 0; i < 8; i++)
			System.out.printf("%d ", arr[i]);
		
		
	}

}
