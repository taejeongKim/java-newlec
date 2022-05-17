package ex3.io.escape;
public class Program {
	public static void main(String[] args) {

		int kor1, kor2, kor3;
		int total;
		float avg;

		kor1 = 50;
		kor2 = 60;
		kor3 = 80;

		total = kor1 + kor2 + kor3;
		avg = total / 3;

		// -------------- 성적 출력 부분 ----------------------
		// 줄바꿈이 안 되는 문제
		// escape 문자 활용 해결
		System.out.print("┌──────────────────┐\n");
		System.out.print("│      성적출력       │\n");
		System.out.print("└──────────────────┘\n");
		System.out.print("국어1 : 0\n");
		System.out.print("국어2 : 0\n");
		System.out.print("국어3 : 0\n");
		System.out.print("총점 : 0\n");
		System.out.print("평균 : 0\n");
		System.out.print("────────────────────\n");
		
		// println() 함수로 해결
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적출력       │");
		System.out.println("└──────────────────┘");
		System.out.println("국어1 : 0");
		System.out.println("국어2 : 0");
		System.out.println("국어3 : 0");
		System.out.println("총점 : 0");
		System.out.println("평균 : 0");
		System.out.println("────────────────────");
	}
}