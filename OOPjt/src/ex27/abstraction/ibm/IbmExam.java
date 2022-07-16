package ex27.abstraction.ibm;

import exam_management.Exam;

public class IbmExam extends Exam {

	private int com;
	
	public IbmExam() {
		this(0,0,0,0);
	}
	public IbmExam(int kor, int eng, int math, int com) {
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
		int total = onTotal() + com;
		return total;
	}

	@Override
	public float avg() {
		return total() / 4.0f;
	}

}
