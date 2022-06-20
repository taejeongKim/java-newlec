package ex17.practice;

public class P00 {

	public static void main(String[] args) {
		// 등차수열 일반항 x 구하기
		// x = a1 + (n - 1) * d
		// a1 : the first term
		// d : the common difference 
		
		System.out.printf("%d,", 1);
		System.out.printf("%d,", 6);
		System.out.printf("%d,", 11);
		System.out.printf("%d,", 16);
		System.out.printf("%d,", 21);
		
		System.out.println();
		
		for (int n=1; n<=5; n++) {
			System.out.printf("%d,", 1 + (n-1) * 5);
		}

	}

}
