package ex17.practice;

public class P10_array4 {

	public static void main(String[] args) {
		// 배열에서 항목 찾기
		// 아래에서 1의 index를 찾아라

		int[] nums = { 5, 2, 7, 4, 6, 1, 3 };
		// 초기값으로 -1을 넣는 이유
		// 0을 넣으면 항목을 찾지 못했을 경우 index0의 값을 가져오게 된다.
		// 찾지 못했을 경우 -1을 리턴하여 못찾았다는 것을 알리는 것이 좋다.

		int idx = -1;

		for (int i = 0; i < 7; i++)
			if (nums[i] == 1) {
				idx = i;
				break; // 찾았을 때 그만 ...
			}

		System.out.printf("index of 1 = %d", idx);

	}

}
