package GuI_Swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame4 {

	public static void main(String[] args) {
		JFrame f1 = new JFrame();
		f1.setTitle("임택균");
		f1.setLocation(100, 100);
		f1.setSize(500,300);
		f1.setVisible(true);
		Container contentPane = f1.getContentPane();
		JButton jb1 = new JButton("start");
		JButton jb2 = new JButton("end");
		contentPane.add(jb1);
		contentPane.add(jb2);
		
		

	}

}
