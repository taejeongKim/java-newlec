package ex27.abstraction.newlect;

import ex26.abstraction_for_service.Exam;

public class NewlecExam extends Exam{

	private int com;
	
	public NewlecExam() {
		this(0,0,0,0);
	}
	// 오버로드 생성자
	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	
	// 부모클래스의 2개 함수 오버라이드
	
	@Override
	public int total() {
//		int total = getKor() + getEng() +getMath() + com;
		// total()이 호출될 때 불려지는 함수
		int total = onTotal() + com;
		return total;
	}
	
	@Override
	public float avg() {
		return total()/4.0f;
	}
	
	
}
