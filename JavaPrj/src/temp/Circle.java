package temp;

public class Circle {

	Operation op;
	double pi=3.14;
	
	double area(int radius) {
		op = new Operation();
		int rsquare=op.square(radius);
		return pi*rsquare;
	}
}
