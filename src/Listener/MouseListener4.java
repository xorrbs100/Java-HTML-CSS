package Listener;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListener4 extends JFrame{
JPanel c;
	
	public MouseListener4() {
		setTitle("더블클릭학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = new JPanel();
		setContentPane(c);
		c.addMouseListener(new MouseListener2());
		setSize(300,200);
		setVisible(true);
		c.requestFocus();
	}
	class MouseListener2 extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			int r = (int)(Math.random()*255);
			int g = (int)(Math.random()*255);
			int b = (int)(Math.random()*255);
			if(e.getClickCount()==2) {
				c.setBackground(new Color(r,g,b));
			}
		}
	}
	public static void main(String[] args) {
		new MouseListener4();
		

	}

}
