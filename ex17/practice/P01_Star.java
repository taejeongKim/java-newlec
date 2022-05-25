/*
 * 별 10개 찍기
 */

package ex17.practice;

public class P01_Star {
	public static void main(String[] args) {
		
		//별 패턴 1
		for (int j=0; j<10; j++) {
			for (int i=0; i<10; i++) {
				System.out.printf("%c", '☆');
			}
			System.out.println();
		}
		
		//별 패턴 2
		for (int j=0; j<10; j++) {
			for (int i=0; i<j+1; i++) {
				System.out.printf("%c", '☆');
			}
			System.out.println();
		}
		
		//별 패턴 3
		for (int j=0; j<10; j++) {
			for (int i=10; i>j; i--) {
				System.out.printf("%c", '☆');
			}
			System.out.println();
		}
		
	}
}