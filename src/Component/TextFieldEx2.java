package Component;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TextFieldEx2 extends JFrame{

	public TextFieldEx2() {
		setTitle("텍스트필드");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JPanel jp = new JPanel();
		jp.setSize(250,150);
		jp.setLayout(null);
		jp.setBackground(Color.WHITE);
		jp.setLocation(15,5);
		
		c.add(jp);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx2();

	}

}
