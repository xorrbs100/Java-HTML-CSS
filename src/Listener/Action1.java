package Listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Action1 extends JFrame {

	public Action1(){
		setTitle("액션리스너학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		//버튼에 리스너부착
		btn.addActionListener(new MyActionListener1());
		c.add(btn);
				
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String [] args) {
	
		new Action1();
	}
}

//리스너생성
class MyActionListener1 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn= (JButton)e.getSource();
		if(btn.getText().equals("Action")) {
			btn.setText("액션");
			btn.setBackground(Color.RED);
		}else {
			btn.setText("Action");
			btn.setBackground(new Color(1,0,255));
		}
	}
	
	
}