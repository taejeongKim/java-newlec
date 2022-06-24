package reuse;

import ex24.ui_code_seperation.Exam;

// IS A 상속
public class NewlecExam extends Exam {

	private int com;
	
	// 기본 생성자
	public NewlecExam() {
		//갓 생성된 객체 this여야 함.
//		this.com = 3; 
		this(0,0,0,0); // 위에서 이미 쓰여졌으면 안 됨.
	}
	// 생성자 오버로드
	public NewlecExam(int kor, int eng, int math, int com) {
		
		//this.setKor(kor);
		// 국어, 영어, 수학은 부모 생성자에게 초기화 시킴.
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
		return super.total() + com;
	}
	
	@Override
	public float avg() {
		return total()/4.0f;
	}
	
}