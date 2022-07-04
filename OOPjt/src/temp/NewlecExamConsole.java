package temp;

import java.util.Scanner;

import test2.Exam;
import test2.ExamConsole;

public class NewlecExamConsole extends ExamConsole{

	@Override
	protected Exam makeExam() {
		Exam exam = new NewlecExam();
		return exam;
	}

	
}
