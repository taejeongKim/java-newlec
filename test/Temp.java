package test;

import java.util.Arrays;

public class Temp {

	public static void main(String[] args) {
	
		int[][] scores = new int[][] {{2,3,4},{2,3,4},{2,3,4}};
//		int[][] scores = {{2,3,4},{2,3,4},{2,3,4}};
		
		for (int i=0; i<scores.length; i++) {
			for (int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
