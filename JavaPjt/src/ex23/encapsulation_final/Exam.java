package ex23.encapsulation_final;
// 캡슐의 완성
public class Exam {
	
	private int kor;
	private int eng;
	private int math;
	
	// 생성자 오버로드, 중복 코드 삭제
	
	
	// 생성자 오버로드시 주의. 기본 생성자를 꼭 구현해 놓는다. 왜나하면,
	// 오버로드 생성자가 있을 시 기본 생성자가 자동으로 생성되지 않기 때문이다.
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
