
public class Program1 {

	public static void main(String[] args) throws 천을_넘는_예외, 음수가되는예외 {
		/* 인스턴스 함수 사용 */
//		Calculator calc = new Calculator(3, 5);
//		calc.add();
		
		// static 함수 사용
		int result = 0;
		result = Calculator.add(3,3000);
		// 위 코드에서 예외가 발생하고 있다.
		// 예외를 여기서 처리하지 않고 throw 하게 되면,
		// 자바 런타임환경에게 던져져서 프로그램이 멈춘다.
		
		System.out.printf("add : %d\n",result);
		result = Calculator.sub(3,5);
		System.out.printf("sub : %d\n",result);
		result = Calculator.multi(3,5);
		System.out.printf("multi : %d\n",result);
		result = Calculator.div(3,5);
		System.out.printf("div : %d\n",result);

	}

}
