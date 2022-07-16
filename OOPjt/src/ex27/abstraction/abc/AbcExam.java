package ex27.abstraction.abc;

import exam_management.Exam;

public class AbcExam extends Exam {
	
	private int music;
	private int com;

	public AbcExam() {
		this(0,0,0,0,0);
	}
	
	public AbcExam(int kor, int eng, int math, int music, int com) {
		super(kor, eng, math);
		this.music = music;
		this.com = com;
	}
	
	// get & set
	
	public int getMusic() {
		return music;
	}

	public void setMusic(int music) {
		this.music = music;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	
	@Override
	public int total() {
		int total = super.onTotal() + music + com;
		return total;
	}



	@Override
	public float avg() {
		
		return total() / 5.0f;
	}

}
