package ex04.io.printf;
public class Program {
	public static void main(String[] args) {

		int kor1, kor2, kor3;
		int total;
		float avg;

		kor1 = 50;
		kor2 = 60;
		kor3 = 80;

		total = kor1 + kor2 + kor3;
		// 정수를 정수로 나누면 정수가된다. 이를 float로 변환하면 소수자리는 모두 0처리된다.
		// 2가지 옵션. 
		// avg = (float)(total / 3.0);  // double 을 float로 형변환
		avg = total / 3.0f; // 처음부터 float으로 나눠줌.
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적출력       │");
		System.out.println("└──────────────────┘");
		System.out.printf("국어1 : %3d\n", kor1);
		System.out.printf("국어2 : %3d\n", kor2);
		System.out.printf("국어3 : %3d\n", kor3);
		System.out.printf("총점 : %3d\n", total);
		// 평균이 63.33이 아닌 63.00이 나온 이유
		// 정수를 정수로 나누면 정수가된다. 이를 float로 변환하면 소수자리는 모두 0처리된다.
		System.out.printf("평균 : %6.2f\n", avg);
		System.out.println("────────────────────");
	
		
	}
}