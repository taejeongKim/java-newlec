package ex17.practice;

public class P08_array4 {

	public static void main(String[] args) {
		// 배열 연습문제
		// 현재 배열의 끝에 8을 넣고 싶다. 어떻게 해야 하나???

		// 1~7 정수로 초기화된 배열을 만드시오.

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		// int[] arr = new int[] {1,2,3,4,5,6,7};

		for (int i = 0; i < 7; i++)
			System.out.printf("%d ", arr[i]);
		
		System.out.println();
		// 배열의 공간이 너무 작으니 10개 정수가 가능한 공간으로 이주하시오.
		
		int[] temp = new int[10]; // 임시배열
		
		for (int i = 0; i < 7; i++) // 이주
			temp[i] = arr[i];
		
		arr = temp; // 배열 교체
		
		arr[7] = 8;
		
		for (int i = 0; i < 8; i++)
			System.out.printf("%d ", arr[i]);
		
		
	}

}
