/*
 	MouseListener
 			- 리스너 종류
 				. MouseListener : 5가지
 				. MouseMotionListener : 2가지
 				. MouseWheelListener: 1가지
 			- 메소드
 				. getX(),getY()
 				. getClickCount() : 마우스 클릭횟수 리턴
 				. getButton()	  : 마우스의 왼쪽버튼이냐 중앙이냐 오른쪽이냐
 									-MouseEvent.BUTTON1- 왼쪽버튼 2 중앙 3오른쪽
 */


package Listener;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListener3 extends JFrame{
	
	JPanel c = new JPanel();
	JLabel la;
	public MouseListener3() {
	
		setTitle("mouse Event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(c);
		//c.setLayout(new GridLayout());
		la=new JLabel("마우스이벤트");
		la.setFont(new Font("Arial",Font.ITALIC,25));
		c.add(la);
		c.addMouseListener(new MyMouseListener());
		c.addMouseMotionListener(new MyMouseListener());
		setSize(300,200);
		setVisible(true);
	}
	//리스너
	class MyMouseListener implements MouseListener,MouseMotionListener,MouseWheelListener{

		//MouseListener
		@Override
		public void mouseClicked(MouseEvent e) {}

		@Override
		public void mouseEntered(MouseEvent e) {
			c.setBackground(Color.yellow);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			c.setBackground(Color.CYAN);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("MousePressed("+e.getX()+","+e.getY()+")");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {}
		//MouseMotionListener
		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged("+e.getX()+","+e.getY()+")");
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved("+e.getX()+","+e.getY()+")");
			
		}
		//MouseWheelListener
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {}
		
	}
	public static void main(String[] args) {
	
		new MouseListener3();
		

	}

}
