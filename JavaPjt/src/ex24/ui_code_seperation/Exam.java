package ex24.ui_code_seperation;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public Exam() {
		this(0,0,0);
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	// getters & setters
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// 기본 연산값 서비스
	
	public int total() {
		return kor + eng + math;
	}
	public float avg() {

		return this.total() / 3.0f;
	}
	

	
	
}
