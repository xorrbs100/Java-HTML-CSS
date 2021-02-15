package GuI_Swing;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame6 extends JFrame{
	public Frame6(String name , int i, int j) {
		setTitle(name);
		setSize(i, j);
		setVisible(true);
		Container contentPane = getContentPane();
		JButton btn = new JButton("시작");
		contentPane.add(btn);
		
	}

	

	public static void main(String[] args) {
		
		 new Frame6("임택균",600,700);	

	}

}
