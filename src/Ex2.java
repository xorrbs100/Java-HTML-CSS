import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex2 extends JFrame {
	public Ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		MyPanelex mp = new MyPanelex();
		c.add(mp);
				
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex2();
	}
	class MyPanelex	extends JPanel{
		int x ,y = 0;
		ImageIcon img = new ImageIcon(".\\img\\펭귄.jpg");
		Image im = img.getImage();
		public MyPanelex() {
		
		//리스너
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				x= e.getX();
				y=e.getY();
				repaint();
				
			}
		});
		
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(im, 0, 0, this.getWidth(),this.getHeight(),this);
			g.setColor(Color.RED);
			g.fillArc(x, y, 30, 30, 0, 360);
		}
		
			
		
	}

}
