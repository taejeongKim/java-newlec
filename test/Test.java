package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		// 2차 배열
		
		int[] kor1 = new int[3];
		int[] kor2 = new int[3];
		int[] kor3 = new int[3];
		
		int[][] kors = new int[2][3];
		
		for (int j=0; j<2; j++)
			for (int i=0; i<3; i++) {
				if (j==1)
					kors[j][i] = i+3;
				else
					kors[j][i] = i;
				System.out.println(kors[j][i]);
			}
		
		
		
		

		

	
	}
}
