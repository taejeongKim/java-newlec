package ex17.practice;

public class P06_array1 {

	public static void main(String[] args) {
		// array ���� �� �ʱ�ȭ
		
		// ����
		int[] arr = new int[7];
		
		int arr2[] = new int[7]; // old style, ���� �ʴ� ���� ����.
		
		// �ʱ�ȭ
		for (int i=0; i<7; i++) {
			arr[i] = i + 1;
			arr2[i] = i + 1;
		}
		
		int[] arr3 = new int[] {1,2,3,4,5,6,7}; // �� ������ �̷��� �� ������..
		int[] arr4 = {1,2,3,4,5,6,7}; // ���� ��κ� �̷��� �ʱ�ȭ �Ѵ�.
		
		System.out.print("arr1\t arr2\t arr3\n");
		for (int i=0; i<7; i++) {
			System.out.printf("%d\t %d\t %d\n", arr[i], arr2[i], arr4[i]);
		}

	}

}
