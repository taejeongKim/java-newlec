package ex17.practice;

public class P9_array3 {

	public static void main(String[] args) {
		// 배열 연습문제

		// 1~7 정수로 초기화된 배열을 만드시오.

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		// int[] arr = new int[] {1,2,3,4,5,6,7};

		for (int i = 0; i < 7; i++)
			System.out.printf("%d ", arr[i]);
		
		System.out.println();
		// 배열의 공간이 너무 작으니 10개 정수가 가능한 공간으로 이주하시오.
		
		int[] temp = new int[10];
		
		for (int i = 0; i < 7; i++)
			temp[i] = arr[i];
		
		arr = temp;
		
		arr[7] = 8;
		
		for (int i = 0; i < 8; i++)
			System.out.printf("%d ", arr[i]);
		
		
	}

}
