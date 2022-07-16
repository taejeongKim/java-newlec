package ex27.interface_2;

public class A {
	// 인터페이스 X
	// 이를 구현한 객체를 장착할 곳이다.
	private X x;
	
	//	객체 장착을 위한 setter	
	public void setX(X x) {
		this.x = x;
	}

	public void print() {

		int total = x.total();
		System.out.printf("total is %d", total);
		
	}
	
	
}
