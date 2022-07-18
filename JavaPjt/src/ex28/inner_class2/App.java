package ex28.inner_class2;

import ex28.inner_class2.Robot.Battery;

public class App {

	public static void main(String[] args) {

		Robot robot = new Robot(7);
		robot.start();
		
		// outer class + static inner class 
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}

}
