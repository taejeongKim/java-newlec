package temp;

public class TempProgram {

	public static void main(String[] args) {
		
		int result = 0;

		result = Calulator.add(3,3);
		System.out.printf("add result is %d\n", result);
		
		try {
			result = Calulator.sub(3,5);
		} catch (MinusResultException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.printf("sub result is %d\n", result);
		result = Calulator.mul(3,4);
		System.out.printf("mul result is %d\n", result);
		result = Calulator.div(3,4);
		System.out.printf("div result is %d\n", result);
	}
}
