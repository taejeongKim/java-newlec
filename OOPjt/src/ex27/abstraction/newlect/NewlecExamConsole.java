package ex27.abstraction.newlect;

import java.util.Scanner;

import ex26.abstraction_for_service.Exam;
import ex26.abstraction_for_service.ExamConsole;

public class NewlecExamConsole extends ExamConsole{

	// 팩토리 메소드, makeExam()를 구현한다.
	@Override
	protected Exam makeExam() {
		return new NewlecExam();
	}

	@Override
	protected void onPrint(Exam exam) {
		//newlectExam 을 쓰기위해 형식 변환을 한다.
		// Exam형식으로는 com 을 얻을 수 없기 때문
		NewlecExam newlecExam = (NewlecExam)exam;
		int com = newlecExam.getCom();
		System.out.printf("컴퓨터 : %3d\n", com);
		
	}

	@Override
	protected void onInput(Exam exam) {
		NewlecExam newlecExam = (NewlecExam)exam;
		
		Scanner scan = new Scanner(System.in);
		int com;
		do {
			System.out.printf("컴퓨터 : ");
			com = scan.nextInt();
			if (com < 0 || 100 < com)
				System.out.println("유효한 범위(0~100)를 넘어갔습니다. 다시 입력해 주세요.");
		} while (com < 0 || 100 < com);
		
		// exam.setCom(com); exam 변수로는 com에 접근이 안됨.
		// NewlecExam으로 형변환이 필요함.
		
		newlecExam.setCom(com);
		
	}

}
