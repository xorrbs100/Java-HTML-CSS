package Listener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.omg.CORBA.REBIND;

public class Reverse extends JFrame{
	JPanel c= new JPanel();
	JLabel la;
	
	public Reverse() {
		setTitle("reverse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(c);
		c.setLayout(new BorderLayout());
		c.setBackground(Color.YELLOW);
		la = new JLabel("LOVE JAVA",SwingConstants.CENTER);
		la.setFont(new Font("Arial",Font.BOLD,40));
		la.setSize(50,50);
		la.addKeyListener(new KeyAdapter() {
		 
			@Override
			public void keyPressed(KeyEvent e) {
				//좌측으로 돈다
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					JLabel la = (JLabel)e.getSource();
					String s = la.getText();
					String a = s.substring(0,1);	//처음한글자
					String b = s.substring(1);		//한글자부터마지막
					la.setText(b.concat(a));  //짤라서 붙이기메소드
				}//우측으로돈다
				else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
					JLabel la = (JLabel)e.getSource();
					String s = la.getText();
					String a = s.substring(8,9);	//맨끝한글자
					String b = s.substring(0,8);	//처음부터맨끝앞
					la.setText(a.concat(b));  //짤라서 붙이기메소드
				}
			}
		});
		c.add(la);
		setSize(500,200);
		setVisible(true);
		la.setFocusable(true);
		la.requestFocus();
	}


	public static void main(String[] args) {
		new Reverse();
		

	}

}
