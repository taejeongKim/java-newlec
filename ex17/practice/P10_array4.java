package ex17.practice;

public class P10_array4 {

	public static void main(String[] args) {
		// �迭���� �׸� ã��
		// �Ʒ����� 1�� index�� ã�ƶ�

		int[] nums = { 5, 2, 7, 4, 6, 1, 3 };
		// �ʱⰪ���� -1�� �ִ� ����
		// 0�� ������ �׸��� ã�� ������ ��� index0�� ���� �������� �ȴ�.
		// ã�� ������ ��� -1�� �����Ͽ� ��ã�Ҵٴ� ���� �˸��� ���� ����.

		int idx = -1;

		for (int i = 0; i < 7; i++)
			if (nums[i] == 1) {
				idx = i;
				break; // ã���� �� �׸� ...
			}

		System.out.printf("index of 1 = %d", idx);

	}

}
