package ex17.practice;

public class P06_array1 {

	public static void main(String[] args) {
		// array 정의 및 초기화
		
		// 정의
		int[] arr = new int[7];
		
		int arr2[] = new int[7]; // old style, 쓰지 않는 편이 좋다.
		
		// 초기화
		for (int i=0; i<7; i++) {
			arr[i] = i + 1;
			arr2[i] = i + 1;
		}
		
		int[] arr3 = new int[] {1,2,3,4,5,6,7}; // 좀 전까지 이렇게 다 했지만..
		int[] arr4 = {1,2,3,4,5,6,7}; // 지금 대부분 이렇게 초기화 한다.
		
		System.out.print("arr1\t arr2\t arr3\n");
		for (int i=0; i<7; i++) {
			System.out.printf("%d\t %d\t %d\n", arr[i], arr2[i], arr4[i]);
		}

	}

}