package temp;

public class Calulator {

	public static int add(int i, int j) {
		return i+j;
	}

	public static int sub(int i, int j)  {
		int result = i-j;
		if (result < 0)
			throw new MinusResultException();
		return i-j;
	}

	public static int mul(int i, int j) {
		return i*j;
	}

	public static int div(int i, int j) {
		return i/j;
	}

}
