package ex17.practice;

import java.util.Random;

public class P12_array6 {

	public static void main(String[] args) {
		// ������ ä���
		// �ζ� ��ȣ�� ����� ����. 1~45��ȣ 6��

		Random rand = new Random();

		int[] lotto = new int[6];

		for (int i = 0; i < 6; i++)
			lotto[i] = rand.nextInt(45) + 1;

		for (int i = 0; i < 6; i++)
			System.out.printf("%d, ", lotto[i]);
	}

}
