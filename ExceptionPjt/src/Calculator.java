
/*
 * 예외 테스트를 위한 라이브러리 (계산기)
 * */

public class Calculator {

	/* static 메소드 사용하기로 결정 */
//	private int x;
//	private int y;
//	
//	public Calculator(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//
//	public int add() {
//		return x+y;
//		
//	}

	// 함수내에 예상되는 예외를 정의해 보자.
	// throw : 아래 예외를 내가 처리하지 않는다. 사용자에게 던진다.
	// 여러개의 예외정의를 던질 수 있다.
	public static int add (int x, int y) throws 음수가되는예외, 천을_넘는_예외 {
		
		//예외 만들기 (정의 및 던지기)
		
		int result = x + y;
		if(result > 1000)
			throw new 천을_넘는_예외();
		
		if(result < 0)
			throw new 음수가되는예외();
		
		return result;
	}

	public static int sub(int x, int y) throws 음수가되는예외 {
		
		int result = x - y;
	
		if(result < 0)
			throw new 음수가되는예외();
		
		return result;
	}

	public static int multi(int x, int y) {
		return x*y;
	}

	// 
	public static int div(int x, int y) {
		
		if(y == 0)
			throw new 영으로나눈예외();
		
		return x / y;
	}

	
}
