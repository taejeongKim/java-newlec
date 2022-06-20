package ex17.practice;

public class P11_array5 {

	public static void main(String[] args) {
		// 배열에서 항목 교환하기
		// 아래에서 5와 7을 교환하라.

		int[] nums = { 5, 2, 7, 4, 6, 1, 3 };

		int temp = -1;
		temp = nums[0];
		nums[0] = nums[2];
		nums[2] = temp;

		for (int i = 0; i < 7; i++)
			System.out.printf("%d, ", nums[i]);

	}

}