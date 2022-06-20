package reuse;

import ex24.ui_code_seperation.Exam;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new Exam(1,1,1);
		NewlecExam newExam = new NewlecExam(1,1,1,1);
		
		Exam exam2 = new NewlecExam(1,1,1,1);

		print(exam);
		print(newExam);
		
		
	}
	
	public static void print(Exam exam) {
		int total = exam.total();
		System.out.println(total);
	}

}
