package ex35.interface_game2;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class GameFrame extends Frame implements WindowListener{
	
	public GameFrame() {
		//WindowListener listener = new GameWindowListener();
		addWindowListener(this);
		setVisible(true);
	}
	
@Override
public void paint(Graphics g) {
	// TODO Auto-generated method stub
	super.paint(g);
	
	g.drawRect(100, 100, 200, 200);
	g.drawLine(200, 200, 300, 300);
}

@Override
public void windowOpened(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowClosing(WindowEvent e) {
	JOptionPane.showMessageDialog(this, "Good bye");
	System.exit(0);
	
}

@Override
public void windowClosed(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowIconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowDeiconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowActivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowDeactivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

}
