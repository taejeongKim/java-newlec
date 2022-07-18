package ex28.inner_class2;

//only one public top level class whose name 
//matches with file name.
public class Robot {

	private int id;
	
	// non-static inner class
	// nested class (inner class)
	// outer class = inner class + another inner class ....
	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking");
		}
	}
	
	
	// outer class와 grouping이 필요할 때
	// 외부에서 배터리 교체 등 등
	// instance variable 접근 불가
	public static class Battery{
		public void charge() {
			System.out.println("Battery charging ...");
		}
	}
	
	public Robot() {
		this(0);
	}
	
	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot " + id);
		
		Brain brain = new Brain();
		brain.think();
		
		final String name = "Robot";
		
		// local inner class
		// 메서드 안에서만 사용할 클래스가 필요할 때
		class Temp {
			public void doSomething() {
				System.out.println("id is " + id);
				System.out.println("My name is " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}
}
