package ex26.abstraction1;

public class Program {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[5];
		
		shapes[0] = new Line(1,2);
		shapes[1] = new Circle(6,7);
		shapes[2] = new Rect(3,4);
		shapes[3] = new Circle(1,7);
		shapes[4] = new Rect(1,4);
		
		for (int i=0; i<5; i++) {
			shapes[i].paint();
		}
		
	}



}
