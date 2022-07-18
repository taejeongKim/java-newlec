package ex28.inner_class1;

class AAA{
	int i = 100;
	BBB b = new BBB();
}

class BBB{
	void method() {
		// 여기서 클래스 AAA의 멤버를 사용하려면 객체를 생성해야 한다.
		AAA a = new AAA();
		System.out.println(a.i);
		
	}
}

class ccc{
	BBB b = new BBB();
}

public class Program1 {

	public static void main(String[] args) {
		BBB b = new BBB();
		b.method();
		
	}

}
