package ex24.ui_code_seperation;

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
//		exams = new Exam[3];
//		current = 0;
		//오버로드 생성자를 부르며 인자를 전달한다. 코드 중복을 피할 수 있다.
		this(3);
		
	}
	// 이 클래스가 만들어 질 때 Exam 객체가 만들어지는 것은 아니다.
	// 단지 담을 그릇만 만들어진다.
	// 둘은 생명주기가 다르다.
	// 따라서, Has A 관계이지만 aggregation 관계이다.
	public ExamList(int size) {
		exams = new Exam[size];
		current = 0;
		
	}

	public int size() {
		return current;
	}

}
