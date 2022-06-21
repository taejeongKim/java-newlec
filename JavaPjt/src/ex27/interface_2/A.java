package ex27.interface_2;

public class A {
// 미래에 구현될 자료형 X
	private X x;
	
//	미래에 세팅할 수 있는 기능 setter
// x 객체를 생성하는 것이 아님.	
	public void setX(X x) {
		this.x = x;
	}
	public A() {
		//b = new B();
	}
	public void print() {

		int total = x.total();
		
		System.out.printf("total is %d", total);
		
	}
	
	
}
