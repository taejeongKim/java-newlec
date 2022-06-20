package ex25.inheritance;
/*
 * [task]
 * 1. 상속을 통하여 NewlecExam을 만들라
 * 2. computer 과목이 추가된다. 총점과 평균을 구해보라
 * 메소드를 오버라이드하지 않으면 아래 결과가 예상과 다르게 나온다.
 * */
public class Program {

	public static void main(String[] args) {
		
		NewlecExam exam = new NewlecExam();
		exam.setKor(10);
		exam.setEng(10);
		exam.setMath(10);
		exam.setCom(10);
		
		System.out.println(exam.total());
		System.out.println(exam.avg());
	}

}
