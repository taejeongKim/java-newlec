
public class Program2 {
/*
 * [천을_넘는_예외]를 처리해 보자
 * 다중 예외 처리
 * 
 * */
	public static void main(String[] args) {

		int result = 0;
		// 오류를 여기서 처리(catch)한다.
		try {
			result = Calculator.add(3,5);
			System.out.printf("add : %d\n",result);
			result = Calculator.sub(3,2);
			System.out.printf("sub : %d\n",result);
		} 
		// 특화된 예외
		catch (천을_넘는_예외 e) {
			System.out.println(e.getMessage());
		}
		// 특화된 예외 이외의 일반적 예외
		catch (Exception e) {
			System.out.println("일반적 예외");
		}
		// 마지막에 꼭 들리는 곳(공통)
		finally {
			System.out.println("입력값에 오류가 있습니다.");
		}
		
		result = Calculator.multi(3,5);
		System.out.printf("multi : %d\n",result);
		
		// 0으로 나눈는 테스트
		// unchecked 예외
		result = Calculator.div(11,0);
		System.out.printf("div : %d\n",result);

	}

}
