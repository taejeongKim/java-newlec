package ex27.interface_2;
/*
 * A에게 total을 print() 시켜보자. 
 * total 을 갖고 있는 B가 필요하다. 
 * 그런데 지금 B가 없다. 인터페이스만 구현하고 나중에 장착하자.
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
