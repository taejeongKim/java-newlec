package temp;

// 라이브러리
// 예외
// 1. 음수예외
// 2. 10 이상 예외

public class Calculator2 {


	public static int add (int x, int y) throws MinusException, OverTenException  {
	
		int result = x + y;
		
		if (result < 0)
			throw new MinusException();
		
		if (result > 10)
			throw new OverTenException();
		
		return result;
	}

	public static int sub(int x, int y) throws MinusException, OverTenException {
		
		int result = x - y;
	
		if (result < 0)
			throw new MinusException();
		
		if (result > 10)
			throw new OverTenException();
		
		return result;
	}

	public static int multi(int x, int y) throws MinusException, OverTenException{
		int result = x * y;
		
		if (result < 0)
			throw new MinusException();
		
		if (result > 10)
			throw new OverTenException();
		
		return result;
	}

	// 
	public static int div(int x, int y) throws MinusException, OverTenException {
		
		int result = x / y;
		
		if (result < 0)
			throw new MinusException();
		
		if (result > 10)
			throw new OverTenException();
		
		return result;
	}

	
}
