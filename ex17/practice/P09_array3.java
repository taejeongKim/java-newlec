package ex17.practice;

public class P09_array3 {

	public static void main(String[] args) {
		// 두개의 배열 합치기
		
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 4, 5, 6 };
		int[] nums = new int[6];

		for (int i = 0; i < 6; i++) {
			if (i < 3)
				nums[i] = nums1[i];
			else
				nums[i] = nums2[i-3];
		}

		for (int i = 0; i < 6; i++)
			System.out.println(nums[i]);

	}

}