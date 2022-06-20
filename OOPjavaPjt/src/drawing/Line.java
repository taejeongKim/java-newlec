package drawing;

public class Line extends Shape{

	private int length;
	
	public Line() {
		super();
	}
	
	public Line(int x, int y) {
		super(x, y);
	}
	
	// getter & setter
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public void paint() {
		System.out.printf("I am painting a Line at %d/%d.\n", this.getX(), this.getY());
	}
	
}
