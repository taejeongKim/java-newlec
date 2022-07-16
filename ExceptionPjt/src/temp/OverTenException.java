package temp;

public class OverTenException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "the result has to be over 10";
	}
	
}
