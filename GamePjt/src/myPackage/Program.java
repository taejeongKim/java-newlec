package myPackage;

/*
 * [task]
 * 1. 상속을 배웠으니 실전에서 어떻게 사용되는지 알아보자.
 * 2. 윈도우 창 클래스인 Frame을 상속받아 사용해본다.
 * */



import java.awt.Frame;

public class Program {

	public static void main(String[] args) {

		// frame을 좀 바꿔보자
//		Frame frame = new Frame();
		GameFrame frame = new GameFrame();
		frame.setVisible(true);
	}

}
