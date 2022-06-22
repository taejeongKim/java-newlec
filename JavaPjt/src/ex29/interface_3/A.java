package ex29.interface_3;

public class A {

	private X x;
	
	public void setX(X x) {
		this.x = x;
	}

	public A() {
		//b = new B();
		// x를 set할 수는 있어도 new할 수는 없다.
	}

	public void print() {
		int total = x.total();
		
		System.out.printf("total is %d\n", total);
		
	}
	
	
}
