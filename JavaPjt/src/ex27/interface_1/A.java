package ex27.interface_1;
// A는 B를 composition Has A 관계로 소유하고 있다.

public class A {

	private B b;
	public A() {
		b = new B();
	}
	public void print() {

		int total = b.total();
		
		System.out.printf("total is %d", total);
		
	}
	
}
