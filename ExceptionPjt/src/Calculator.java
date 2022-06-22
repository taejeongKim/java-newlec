
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

	// 예외를 정의해 보자.
	// throw : 아래 예외를 내가 처리하지 않는다. 그냥 던진다.
	public static int add (int x, int y) throws 천을_넘는_예외, 음수가되는예외 {
		
		//예외 만들기 (정의 및 던지기)
		int result = x + y;
		if(result > 1000)
			throw new 천을_넘는_예외();
		
		if(result < 0)
			throw new 음수가되는예외();
		
		return x+y;
	}

	public static int sub(int x, int y) {
		
		return x-y;
	}

	public static int multi(int x, int y) {
		return x*y;
	}

	public static int div(int x, int y) {
		return x/y;
	}

	
}
