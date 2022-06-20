package test;

import ex24.ui_code_seperation.Exam;

public class TjExam extends Exam {

	private int com;
	
	public TjExam() {
		this(0,0,0,0);
	}
	public TjExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	
	public int total() {
		return super.total() + com;
	}
	
	public float avg() {
		return total()/4.0f;
	}
}
