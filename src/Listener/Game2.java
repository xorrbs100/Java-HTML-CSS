//공눌러서 도망가게 창안벗어나게


package Listener;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game2 extends JFrame {

	JPanel c = new JPanel();
	JLabel la;
	public Game2() {
		setTitle("터치");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(c);
		c.setBackground(Color.GREEN);
		la=new JLabel(new ImageIcon(".\\image\\축구공.png"));
		la.setBackground(Color.GREEN);
		c.add(la);
		la.setOpaque(true);
		la.setSize(150,150);
		la.setLocation(50,50);
		la.addMouseListener(new My1());
		setSize(600,400);
		setVisible(true);
		la.setFocusable(true);
		la.requestFocus();
	
	}
	class My1 extends MouseAdapter{


		@Override
		public void mousePressed(MouseEvent e) {
			int a = c.getWidth();
			int b = c.getHeight();
			int w=la.getWidth();	//라벨 가로
			int h=la.getHeight();	//라벨 세로
			int x,y;
			x=(int)(Math.random()*a);
			y=(int)(Math.random()*b);
			la.setLocation((int)Math.abs(x-w), (int)Math.abs(y-h));
			
		}


	}
	public static void main(String[] args) {
		new Game2();
	}

}
