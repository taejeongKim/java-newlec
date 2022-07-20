package ex30.lambda;

interface Say {
	void something();
}

class Person {
	public void greeting(Say line) {
		line.something();
	}
}

public class App {

	public static void main(String[] args) {

/////////////////////////  lambda 이전
		
	// greeting method에 코드 덩어리 넣기
		
		Person rin = new Person();
		rin.greeting(new Say() { // 익명클래스 구현

			@Override
			public void something() {
				System.out.println("my name is Rin");
				System.out.println("Nice to meet you");
			}
			
		});
		System.out.println("==================");
////////////////////////   lambda 이후
		
		rin.greeting( () -> {
			System.out.println("my name is Rin");
			System.out.println("Nice to meet you");
		});
		
	
	}

}
