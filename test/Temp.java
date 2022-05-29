package test;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {

//		Exam[] exams = new Exam[3];
		
		Exam[] exams = {new Exam(), new Exam(), new Exam()};
		
		exams[0].kor = 30;
		System.out.println(exams[0].kor);
		System.out.println(exams[1].kor);

		
	}
}