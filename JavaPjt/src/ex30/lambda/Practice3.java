package ex30.lambda;

@FunctionalInterface
interface MyFunction2 {
	void run();
}

public class Practice3 {

	static MyFunction2 getMyFunction() {// 반환타입이 함수형 인터페이스
		MyFunction2 f = () -> System.out.println("f3.run()");
		return f;
	}
	
	static void execute(MyFunction2 f) {
		f.run();
	}
	
	public static void main(String[] args) {
		//람다식으로 run()구현
		MyFunction2 f1 = ()-> System.out.println("f1.run()");
		
		MyFunction2 f2 = new MyFunction2() {//익명클래스로 run()구현
			
			@Override
			public void run() {
				System.out.println("f2.run()");
				
			}
		};
		
		MyFunction2 f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(()-> System.out.println("f1.run()"));
	}
}
