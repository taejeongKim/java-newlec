package ex4.io.printf;
public class Program {
	public static void main(String[] args) {

		int kor1, kor2, kor3;
		int total;
		float avg;

		kor1 = 50;
		kor2 = 60;
		kor3 = 80;

		total = kor1 + kor2 + kor3;
		// ������ ������ ������ �������ȴ�. �̸� float�� ��ȯ�ϸ� �Ҽ��ڸ��� ��� 0ó���ȴ�.
		// 2���� �ɼ�. 
		// avg = (float)(total / 3.0);  // double �� float�� ����ȯ
		avg = total / 3.0f; // ó������ float���� ������.

		// println() �Լ��� �ذ�
		System.out.println("����������������������������������������");
		System.out.println("��      �������       ��");
		System.out.println("����������������������������������������");
		System.out.printf("����1 : %3d\n", kor1);
		System.out.printf("����2 : %3d\n", kor2);
		System.out.printf("����3 : %3d\n", kor3);
		System.out.printf("���� : %3d\n", total);
		// ����� 63.33�� �ƴ� 63.00�� ���� ����
		// ������ ������ ������ �������ȴ�. �̸� float�� ��ȯ�ϸ� �Ҽ��ڸ��� ��� 0ó���ȴ�.
		System.out.printf("��� : %6.2f\n", avg);
		System.out.println("����������������������������������������");
	
		
	}
}