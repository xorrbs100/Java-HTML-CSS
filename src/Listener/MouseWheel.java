package Listener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MouseWheel extends JFrame{

	public MouseWheel() {
		setTitle("Wheel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel c = new JPanel();
		setContentPane(c);
		c.setLayout(new FlowLayout());
		c.setBackground(Color.CYAN);
		JLabel la = new JLabel("LOVE JAVA",SwingConstants.CENTER);
		
		la.setSize(50,50);
		la.setFont(new Font("d", Font.ITALIC, 20));
		la.addMouseWheelListener(new Mywheel());
		c.add(la);
		setSize(500,200);
		setVisible(true);
		la.requestFocus();
		
	
	}
	class Mywheel implements MouseWheelListener{

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			int n = e.getWheelRotation(); //휠이동값
			if(n<0) {
				JLabel la = (JLabel)e.getSource();
				Font f = la.getFont();
				int size = f.getSize();
				la.setFont(new Font("d",Font.ITALIC,size+5));
			}else {
				JLabel la = (JLabel)e.getSource();
				Font f = la.getFont();
				int size = f.getSize();
				la.setFont(new Font("d",Font.ITALIC,size-5));
			}
			
		}
		
	}
	public static void main(String[] args) {
		new MouseWheel();

	}

}
