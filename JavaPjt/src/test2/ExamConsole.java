package test2;

import java.util.Scanner;

public abstract class ExamConsole {

	ExamList list = new ExamList();
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--- 성적입력 ---");
		
		int kor, eng, math;
		
		System.out.printf("(%d반)\n", list.getCurrent()+1);
		
		do {
			System.out.print("국어 > ");
			kor = scan.nextInt();
			if (kor < 0 || 100 < kor)
				System.out.println("다시 입력해 주세요!");
		} while(kor < 0 || 100 < kor);
		
		do {
			System.out.print("영어 > ");
			eng = scan.nextInt();
			if (eng < 0 || 100 < eng)
				System.out.println("다시 입력해 주세요!");
		} while(eng < 0 || 100 < eng);
		
		do {
			System.out.print("수학 > ");
			math = scan.nextInt();
			if (math < 0 || 100 < math)
				System.out.println("다시 입력해 주세요!");
		} while(math < 0 || 100 < math);
		
//		Exam exam = new Exam(kor, eng, math);
		Exam exam = makeExam();
		list.add(exam);
	}

	protected abstract Exam makeExam();

	public void print() {
		
		System.out.println("--- 성적출력 ---");
		
		for (int i=0; i<list.getCurrent(); i++) {
			
			Exam exam = list.get(i);
			System.out.printf("(%d반)\n", i+1);
			System.out.printf("국어 : %d\n", exam.getKor());
			System.out.printf("영어 : %d\n", exam.getEng());
			System.out.printf("수학 : %d\n", exam.getMath());
			System.out.printf("합계 : %d\n", exam.total());
			System.out.printf("평균 : %f\n", exam.avg());
			System.out.println();
			
		}
	}

}
