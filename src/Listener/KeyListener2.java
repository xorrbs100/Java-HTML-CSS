package Listener;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListener2 extends JFrame {
	JLabel la;
	JPanel c;
	public KeyListener2() {
		setTitle("KeyListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = new JPanel();
		setContentPane(c);
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		//리스너
		c.addKeyListener(new MyKeyListener());
		
		la = new JLabel();
		la.setSize(50,30);
		
		c.add(la);
				
		setSize(500,300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
	}
	class MyKeyListener extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar()=='r') {
				c.setBackground(Color.RED);
			}else if (e.getKeyChar()=='y'){
				c.setBackground(Color.YELLOW);
			}else if (e.getKeyChar()=='p') {
				c.setBackground(new Color(153,0,133));
			}else if (e.getKeyCode()==KeyEvent.VK_F1) { //가상키 활용
				c.setBackground(Color.black);
			}
			
		}
		
	}
	public static void main(String[] args) {
		new KeyListener2();

	}

}
