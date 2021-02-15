package GuI_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame10 extends JFrame {

	public Frame10() {
		setTitle("BorderLayout2");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane1 = getContentPane();
		contentPane1.setBackground(Color.BLACK);
		contentPane1.setLayout(new BorderLayout());
		JButton btn1 = new JButton("Menu");
		btn1.setBackground(Color.orange);
		btn1.setForeground(Color.WHITE);
		contentPane1.add(btn1,BorderLayout.NORTH);
		contentPane1.add(new JButton("도서목록"),BorderLayout.WEST);
		JPanel p = new JPanel();
		p.setBackground(Color.CYAN);
		contentPane1.add(p,BorderLayout.CENTER);
		p.setLayout(new BorderLayout());
		p.add(new JButton("전공서적"),BorderLayout.NORTH);
		p.add(new JButton("일반서적"),BorderLayout.CENTER);
		p.add(new JButton("교양서적"),BorderLayout.SOUTH);
		setSize(500,600);
		setVisible(true);
	}
	public static void main(String [] args) {
		new Frame10();
	}
	
}
