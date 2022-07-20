package ex30.lambda;

// annotation을 해주면 compiler가 체크해 준다.
// 함수형 인터페이스는 메소드가 하나여야 함.
@FunctionalInterface
interface MyFunction {
	public abstract int max(int a, int b);
}

public class Practice2 {

	public static void main(String[] args) {
		
		// 익명클래스 활용 인터페이스 구현
		MyFunction f = new MyFunction() {
			
			@Override
			public int max(int a, int b) {
				
				return a > b ? a : b;
			}
		};	
		
		int value = f.max(3, 5);
		System.out.println("익명클래스: "+value);
		
/////////////////////////////// 람다식
		
/*
 함수형 인터페이스를 참조형식으로 사용하면 
 람다식을 사용할 수 있다.
 * */		
		
		f = (a, b) -> a > b ? a : b;
		value = f.max(3, 5);
		System.out.println("람다: "+value);

	}
}
