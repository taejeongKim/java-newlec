package ex26.abstraction_for_service;
/*
 *1. 추상 클래스
 *2. 추상 메소드
 *3. protected 키워드
 * */
public abstract class Exam { //추상화 클래스
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
	
	// 추상메소드로 만들어서 자식에게 구현을 강제한다.
	public abstract int total();
	
	// 약간의 소스를 구현해서 주려면 아래와 같이 별도 메소드를 물려준다.
	// 자식에게만 공개 protected
	protected int onTotal() {
		return kor+eng+math;
	}
	public abstract float avg();
	
}
