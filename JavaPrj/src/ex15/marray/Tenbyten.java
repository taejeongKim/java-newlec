package ex15.marray;

public class Tenbyten {

	public static void main(String[] args) {
		// 10 x 10 
		// Math.random : return double number ( 0.0 <= n < 1.0 )
		
		int N = 10;
		int[][] arr = new int[N][N];
		
		//input
		for (int j=0; j<N; j++) {
			for (int i=0; i<N; i++) {
				arr[j][i] = (int)(Math.random()*10);
			}
		}
		
		//print
		for (int j=0; j<N; j++) {
			for (int i=0; i<N; i++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
			
		}
		
		

	}

}