package GuI_Swing;

import java.awt.Container;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame3 {
	public static void main(String [] args) {
		JFrame frame= new JFrame();
		frame.setTitle("세번째 만드는 프레임");
		Container contentPane = frame.getContentPane();
		JButton btn = new JButton("click");
		contentPane.add(btn);
		frame.setSize(500, 300);
		frame.setVisible(true);
		
	}

}
