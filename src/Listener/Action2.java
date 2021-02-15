package Listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Action2 extends JFrame{
	public Action2(){
			setTitle("액션리스너학습");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			JButton btn = new JButton("Start");
			
			//버튼에 리스너부착
			btn.addActionListener(new MyActionListener2());
			c.add(btn);
					
			setSize(300,200);
			setVisible(true);
		}

	public static void main(String[] args) {
		new Action2();
	}

}
class MyActionListener2 implements ActionListener{
	//버튼글자를 읽어서 같으면 다른글자로 변경
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		if(btn.getText().equals("Start")) {
			btn.setText("End");
		}else {
			btn.setText("Start");
		}
		
	}
	
}