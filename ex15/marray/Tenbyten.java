package ex15.marray;

public class Tenbyten {

	public static void main(String[] args) {
		// 10 x 10 ���� ���� table �����
		
		int N = 10;
		int[][] arr = new int[N][N];
		
		for (int j=0; j<N; j++) {
			for (int i=0; i<N; i++) {
				arr[j][i] = (int)(Math.random()*10);
			}
		}
		for (int j=0; j<N; j++) {
			for (int i=0; i<N; i++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
			
		}
		
		

	}

}
