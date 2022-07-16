package exam_management;

public class ExamList {

	private Exam[] exams;
	private int current;

	public Exam get(int i) {
		return this.exams[i];
	}

	// 프로그램에 정보를 추가하는 부분만 떼어냄.
	public void add(Exam exam) {
		
		Exam[] exams = this.exams;
		int size = current;

		
		if (exams.length == size) {
			// 1. 새로운 배열 생성
			Exam[] temp = new Exam[exams.length + 5];
			// 2. 값 이주시키기
			for (int i=0; i<size; i++)
				temp[i] = exams[i];
			// 3. 연결 객체 바꾸기
			exams = temp;
		}
		
		exams[this.current] = exam;
		current++;
		
	}

	// 생성자
	public ExamList() {
		this(3);
		
	}
	// ExamList와 Exam과의 관계는 aggregation Has A관계라 한다.
	public ExamList(int size) {
		exams = new Exam[size];
		current = 0;
		
	}

	public int size() {
		return current;
	}

}
