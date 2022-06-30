package ex28.interface_2;
/*
 * A와 B는 강하게 결합되어 있다. (Composition 관계)
 * */
public class Program {

	public static void main(String[] args) {
		A a = new A();
//		b가 개발된 상태 ... 사용가능
// A와 B가 교체형으로 결합하고 있다.
		B b = new B();
		a.setX(b);
		
		a.print();

	}

}
