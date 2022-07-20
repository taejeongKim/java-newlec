package ex29.anonymous;

class Person{
	public void greeting() {
		System.out.println("Hello");
	}
}

interface Utility{
	public void showInfo();
}

public class App {

	public static void main(String[] args) {
		/* Anonymous class */
		
		// Person을 상속한 자식클래스
		Person rin = new Person() {
			@Override
			public void greeting() {
				System.out.println("my name is rin, nice to meet you!");
			}
		};
		rin.greeting();
		
		// 인터페이스 구현
		Utility util = new Utility() {
			
			@Override
			public void showInfo() {
				System.out.println("showing info ...");
				
			}
		};
		
		util.showInfo();
	}

}
