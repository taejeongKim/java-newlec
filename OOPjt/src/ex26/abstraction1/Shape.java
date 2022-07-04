package ex26.abstraction1;

/*
 * shape클래스를 추상화하여 서비스 집중화를 해보라.
 * 추상화를 하게되면 객체로서는 사용할 수 없다.
 * */
public abstract class Shape {

	private int x;
	private int y;
	
	// constructor
	public Shape() {
		this(0,0);
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// setter & getter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("I am drawing a Shape");
	}
	public void move() {
		System.out.println("I am moving a Shape");
	}
	
	// 추상메소드
	protected abstract void paint();

	
}
