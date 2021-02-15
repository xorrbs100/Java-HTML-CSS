package Listener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MultiListener extends JFrame{

	public MultiListener() {
		setTitle("멀티리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new Mylistener1());
		btn.addMouseListener(new Mylistener1());
		btn.addFocusListener(new Mylistener1());
		btn.addKeyListener(new Mylistener1());
		btn.addActionListener(new MyListener2());
		/*JButton btn2 = new JButton("");
		btn2.addActionListener(new MyListener2());*/
		c.add(btn);
		//c.add(btn2);
		
		setSize(300,200);
		setVisible(true);
		
	}
	//내부클래스 리스너
	class MyListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton btn = (JButton)e.getSource();
			btn.setText("또 다른 리스너");
		}
		
	}
	public static void main(String[] args) {
		new MultiListener();

	}
}
//독립클래스 리스너
class Mylistener1 implements ActionListener,KeyListener,FocusListener,MouseListener{

	//액션리스너
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	//마우스리스너
	@Override
	public void mouseClicked(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.RED);	
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.GREEN);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setText("MouseEventTest");
		btn.setBackground(Color.yellow);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		if(btn.getText().equals("Action")) {
			btn.setText("액션");
		}else {
			btn.setText("Action");
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.CYAN);
		
	}
	//포커스리스너
	@Override
	public void focusGained(FocusEvent e) {
		
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		
		
	}
	//키리스너
	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
}