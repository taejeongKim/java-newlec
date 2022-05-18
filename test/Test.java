package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		int[] kors = new int[3];
		int[] engs = new int[3];
		
		float[] fs = new float[10];
		
		kors[1] = 1;
		engs[1] = 1;
		
		
		System.out.println(kors);
		System.out.println(engs);
		System.out.println(engs == kors);
		System.out.println(engs[1] == kors[1]);
		
	}
}