package test;

import ex25.inheritance.Exam;

public class TestProgram2 {
	//
	static int cv;
	static Exam exam;
	boolean x;
	
	public static void main(String[] args) {
		int iv = 30;
		// auto initiation
		printV(iv);
		
	}
	
	static void printV(int i) {
		TestProgram2 tst = new TestProgram2();
		
		System.out.println(i);
		System.out.println(cv);
		System.out.println(exam);
		System.out.println(tst.x);
	}
}
