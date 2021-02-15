package GuI_Swing;

import javax.swing.JFrame;

public class Frame5 extends JFrame{
	public Frame5(String title, int sizei,int sizej) {
		setTitle(title);
		setSize(sizei,sizej);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Frame5("임택균",700,400);
		

	}

}
