package ex25.inheritance;

import ex24.ui_code_seperation.Exam;

public class NewlecExam extends Exam {

	private int com;

	 public NewlecExam() {
		this(0,0,0,0);
	}
	 
	 public NewlecExam(int kor, int eng, int math, int com) {
		 // 부모객체의 오버로드 초기화함수를 활용한다.
		 // 물론 오버로드 초기화함수가 없다면.. 
		 // this.setKor(kor); 를 사용한다.
		 
		 super(kor, eng, math);
		 this.com = com;
	}
	
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	@Override
	public int total() {
		// super : 부모의 객체
		return super.total() + com;
	}
	
	@Override
	public float avg() {
		// 아래는 this.total()이다.
		return total()/4.0f;
	}
}
