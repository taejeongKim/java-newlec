
public class 영으로나눈예외 extends RuntimeException {

	// unchecked 예외임.
	// 즉 runtime 에서만 체크됨.
	// try_catch 할 필요 없음.
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hey, you just divided it by zero";
	}
}
