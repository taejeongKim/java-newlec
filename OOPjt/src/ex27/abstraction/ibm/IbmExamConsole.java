package ex27.abstraction.ibm;

import java.util.Scanner;

import exam_management.Exam;
import exam_management.ExamConsole;

public class IbmExamConsole extends ExamConsole{

	@Override
	protected void onInput(Exam exam) {

		IbmExam ibmExam = (IbmExam) exam;
		Scanner scan = new Scanner(System.in);
		int com;
		
		do {
			System.out.printf("컴퓨터 : ");
			com = scan.nextInt();
			if (com < 0 || 100 < com)
				System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
		} while (com < 0 || 100 < com);
		
		ibmExam.setCom(com);
	}

	@Override
	protected void onPrint(Exam exam) {
		IbmExam ibmExam = (IbmExam) exam;
		int com = ibmExam.getCom();
		System.out.printf("컴퓨터 : %3d\n", com);
		
	}

	@Override
	protected Exam makeExam() {
		return new IbmExam();
	}

}
