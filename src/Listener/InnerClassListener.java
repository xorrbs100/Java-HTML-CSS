package Listener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InnerClassListener extends JFrame{
	JPanel jp = new JPanel();
	public InnerClassListener() {
		setTitle("내부클래스리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(10,5));
		JButton btn = new JButton("Action");
		
		jp.setBackground(new Color(0x00D4F4FA));
		btn.addActionListener(new MyActionListener2());
		c.add(btn,BorderLayout.NORTH);
		c.add(jp,BorderLayout.CENTER);
		
		setSize(300,200);
		setVisible(true);
	}
	class MyActionListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("Action")) {
				btn.setText("End");
				jp.setBackground(Color.BLACK);
			}else {
				btn.setText("Action");
				jp.setBackground(Color.RED);
			}
			
		}
		
	}
	public static void main(String [] args) {
		new InnerClassListener();
	}
}
