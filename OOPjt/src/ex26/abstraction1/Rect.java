package ex26.abstraction1;

public class Rect extends Shape{

	private int height;
	private int width;
	
	public Rect() {
		super();
	}
	
	public Rect(int x, int y) {
		super(x, y);
	}
	
	// getter & setter
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void paint() {
		System.out.printf("I am painting a Rect at %d/%d.\n", this.getX(), this.getY());
	}
	
	
}
