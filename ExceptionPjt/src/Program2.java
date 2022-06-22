
public class Program2 {
/*
 * [천을_넘는_예외]를 처리해 보자
 * 
 * */
	public static void main(String[] args) throws 음수가되는예외 {

		int result = 0;
		// 오류를 여기서 처리(catch)한다.
		try {
			result = Calculator.add(3,3000);
		} catch (천을_넘는_예외 e) {
//			'천을_넘는_예외' 에 구현되어 있는 메세지. 
			System.out.println(e.getMessage());
		}
		
		System.out.printf("add : %d\n",result);
		result = Calculator.sub(3,5);
		System.out.printf("sub : %d\n",result);
		result = Calculator.multi(3,5);
		System.out.printf("multi : %d\n",result);
		result = Calculator.div(3,5);
		System.out.printf("div : %d\n",result);

	}

}
