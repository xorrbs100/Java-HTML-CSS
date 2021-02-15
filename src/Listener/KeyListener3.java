package Listener;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListener3 extends JFrame{

	JPanel c = new JPanel();
	JLabel la, la1, la2;
	final int FLYING_UNIT=10;

	
	public KeyListener3() {
		setTitle("이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(c);
		c.setLayout(null);
		c.setBackground(new Color(0x00FFFFFF));
		la= new JLabel(new ImageIcon(".\\IMGE\\1.png"));//배경이미지용라벨
		la.setSize(1400,700);
		la.setLocation(-5,-18);
		la1=new JLabel(new ImageIcon(".\\imge\\5.png")); //이동할이미지
		la1.setSize(150,150);
		la1.setLocation(50,50);
		la2=new JLabel(new ImageIcon(".\\imge\\123.png")); //이동시키는이미지
		la2.setSize(150,150);
		la2.setLocation(800,500);
		//리스너부착
		c.addKeyListener(new MyKeyListener1());
		
		c.add(la2);
		c.add(la);
		c.add(la1);
		setSize(1550,850);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
	}
	class MyKeyListener1 extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode =e.getKeyCode();
			switch(keyCode) {
			case KeyEvent.VK_UP:
				la2.setLocation(la2.getX(),la2.getY()-FLYING_UNIT);
				if((la1.getY()>la.getY()) && (la1.getY()<la2.getHeight())){
					la1.setLocation((int)(Math.random()*500+100),(int)(Math.random()*500-100));
				}break;
			case KeyEvent.VK_DOWN:
				la2.setLocation(la2.getX(),la2.getY()+FLYING_UNIT);break;
			case KeyEvent.VK_LEFT:
				la2.setLocation(la2.getX()-FLYING_UNIT,la2.getY());break;
			case KeyEvent.VK_RIGHT:
				la2.setLocation(la2.getX()+FLYING_UNIT,la2.getY());break;
			
			}
		}
		
	}
	public static void main(String[] args) {
		new KeyListener3();

	}

}
