package exam_management2;

import java.util.Scanner;

public abstract class ExamConsole {
	
//	private ExamList list = new ExamList();
	private ExamList list;
	
	public ExamConsole() {
		list = new ExamList();
	}

	public int inputMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-- MENU --");
		System.out.println("1) 성적입력");
		System.out.println("2) 성적출력");
		System.out.println("3) 종료");
		System.out.print("> ");
		
		int menu = scan.nextInt();
		return menu;
	}
	public void input() {
//		System.out.println("input");
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		
		System.out.println("-- 성적입력 --");
		
		do {
			System.out.print("국어> ");
			kor = scan.nextInt();
			if (kor<0 || 100<kor)
				System.out.println("out of bounds");
		} while (kor<0 || 100<kor);
		
		do {
			System.out.print("영어> ");
			eng = scan.nextInt();
			if (eng<0 || 100<eng)
				System.out.println("out of bounds");
		} while (eng<0 || 100<eng);
		
		do {
			System.out.print("수학> ");
			math = scan.nextInt();
			if (math<0 || 100<math)
				System.out.println("out of bounds");
		} while (math<0 || 100<math);
		
//		Exam exam = new Exam(kor, eng, math);
		// factory method
		Exam exam = makeExam();
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
		onInput(exam);
		
		list.add(exam);
		
		
	}

	public void print() {
//		System.out.println("output");	
		System.out.println("-- 성적출력 --");
		
		for (int i=0; i<list.getCurrent(); i++) {
			
			Exam exam = list.get(i);
			
			System.out.printf("-%d반-\n", i+1);
			
			System.out.printf("국어 : %d\n", exam.getKor());
			System.out.printf("영어 : %d\n", exam.getEng());
			System.out.printf("수학 : %d\n", exam.getMath());
			
			onPrint(exam);
			
			System.out.printf("합계 : %d\n", exam.total());
			System.out.printf("평균 : %.2f\n", exam.avg());
			
		}
	}
	

	public abstract Exam makeExam(); 
	
	protected abstract void onInput(Exam exam);
	protected abstract void onPrint(Exam exam);

}
