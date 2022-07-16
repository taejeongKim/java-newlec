package exam_management2;

public class ExamList {

	private Exam[] list;
	private int current;
	
	public ExamList() {
		list = new Exam[3];
		current = 0;
	}
	
	public int getCurrent() {
		return current;
	}

	// 리스트에 add
	public void add(Exam exam) {
		
		list[current] = exam;
		current++;
		
	}
	
	// exam 제공
	public Exam get(int i) {
		return list[i];
	}
}
