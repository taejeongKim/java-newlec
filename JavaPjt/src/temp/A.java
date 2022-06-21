package temp;

public class A {

	B b;
	
	public A() {
		b = new B();
	}

	public void print() {
		int total = b.total();
		System.out.printf("total is %d", total);
	}
	
	
}
