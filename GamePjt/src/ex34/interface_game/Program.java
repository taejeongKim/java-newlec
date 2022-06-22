package ex34.interface_game;

/*
 * [task]
 * 1. 윈도우 창의 일부기능 (창닫기)을 인터페이스로 구현하는 것을 연습
 * 2. 여기서는 클래스단위(갭슐) 부품을 만들어 끼워본다.
 * */



import java.awt.Frame;
import java.awt.event.WindowListener;

public class Program {

	public static void main(String[] args) {

		GameFrame frame = new GameFrame();
		// 리스너 장착 (frame.addWindowListener())
		WindowListener listener = new GameWindowListener();
		frame.addWindowListener(listener);
		
		frame.setVisible(true);
	}

}
