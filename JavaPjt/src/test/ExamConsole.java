package test;

import java.util.Scanner;

public class ExamConsole {
	
	ExamList list;
	
	public ExamConsole() {
		this(3);
	}
	public ExamConsole(int size) {
		list = new ExamList(size);
	}

	public void inputExam() {

		System.out.println("--- 성적 입력 --");

		Scanner scan = new Scanner(System.in);

		int kor, eng, math; // 임시변수

		System.out.printf("(%d반)\n", list.getCurrent() + 1);

		do {
			System.out.print("국어 > ");
			kor = scan.nextInt();
			if (kor < 0 || 100 < kor)
				System.out.println("범위를 넘어갔네요. 다시입력~");
		} while (kor < 0 || 100 < kor);

		do {
			System.out.print("영어 > ");
			eng = scan.nextInt();
			if (eng < 0 || 100 < eng)
				System.out.println("범위를 넘어갔네요. 다시입력~");
		} while (eng < 0 || 100 < eng);

		do {
			System.out.print("수학 > ");
			math = scan.nextInt();
			if (math < 0 || 100 < math)
				System.out.println("범위를 넘어갔네요. 다시입력~");
		} while (math < 0 || 100 < math);

		Exam exam = new Exam(kor, eng, math);

		list.add(exam);

	}

	public void printExam() {
		System.out.println("--- 성적 출력 --");

		for (int i = 0; i < list.getCurrent(); i++) {

			System.out.printf("(%d반)\n", i + 1);

			Exam exam = list.get(i);// exams[i];

			System.out.printf("국어 : %d\n", exam.getKor());
			System.out.printf("영어 : %d\n", exam.getEng());
			System.out.printf("수학 : %d\n", exam.getMath());
			System.out.printf("합계 : %d\n", exam.total());
			System.out.printf("평균 : %.2f\n", exam.avg());
			System.out.println("-------------------");

		}

	}

}
