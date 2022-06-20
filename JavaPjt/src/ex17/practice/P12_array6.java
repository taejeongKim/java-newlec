package ex17.practice;

import java.util.Random;

public class P12_array6 {

	public static void main(String[] args) {
		// 랜덤값 채우기
		// 로또 번호를 만들어 보라. 1~45번호 6개

		Random rand = new Random();

		int[] lotto = new int[6];

		for (int i = 0; i < 6; i++)
			lotto[i] = rand.nextInt(45) + 1;

		for (int i = 0; i < 6; i++)
			System.out.printf("%d, ", lotto[i]);
	}

}