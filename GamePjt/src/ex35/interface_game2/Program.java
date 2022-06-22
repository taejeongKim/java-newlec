package ex35.interface_game2;
/*
 * [task]
1. 인터페이스를 별도 클래스에서 구현하지 말고 쓰이는 곳에서 구현해 보자.
 * */

import java.awt.Frame;
import java.awt.event.WindowListener;

public class Program {

	public static void main(String[] args) {

		GameFrame frame = new GameFrame();
		/* 아래 코드를 생성자로 옮김 */
		//frame.addWindowListener(frame);
		//frame.setVisible(true);
	}

}
