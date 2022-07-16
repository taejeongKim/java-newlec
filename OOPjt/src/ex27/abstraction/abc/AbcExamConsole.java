package ex27.abstraction.abc;

import java.util.Scanner;

import exam_management.Exam;
import exam_management.ExamConsole;

public class AbcExamConsole extends ExamConsole {

	@Override
	public Exam makeExam() {
		return new AbcExam();
	}

	@Override
	protected void onInput(Exam exam) {
		Scanner scan = new Scanner(System.in);
		int music, com;
		
		do {
			System.out.print("음악> ");
			music = scan.nextInt();
			if (music<0 || 100<music)
				System.out.println("out of bounds");
		} while (music<0 || 100<music);
		
		do {
			System.out.print("컴퓨터> ");
			com = scan.nextInt();
			if (com<0 || 100<com)
				System.out.println("out of bounds");
		} while (com<0 || 100<com);
		
		AbcExam abcExam = (AbcExam) exam;
		abcExam.setMusic(music);
		abcExam.setCom(com);
		
	}

	@Override
	protected void onPrint(Exam exam) {
		AbcExam abcExam = (AbcExam) exam;
		System.out.printf("음악 : %d\n", abcExam.getMusic());
		System.out.printf("컴퓨터 : %d\n", abcExam.getCom());
		
	}

}
