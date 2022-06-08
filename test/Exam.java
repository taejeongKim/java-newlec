package test;

public class Exam {
	private int kor, eng, math;

	public Exam() {
		this(0,0,0);
	}
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// instance methods
	
	public void printExam() {
		int kor = this.getKor();
		int eng = this.getEng();
		int math = this.getMath();
		
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
	}

	public void inputExam() {
		setKor(20);
		setEng(30);
		setMath(40);
		
	}
	
	// getters, setters

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

	
}

