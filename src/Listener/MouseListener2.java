package Listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MouseListener2 extends JFrame{
	JPanel jp = new JPanel();
	JLabel jl;
	public MouseListener2() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(jp); //판넬을 컨테이너로 교체
		jp.setLayout(null);
		
		jl=new JLabel("안녕");
		jl.setSize(50,20);
		jl.setLocation(30,30);
		jp.addMouseListener(new MyMouse2());
		jp.add(jl);
		setSize(1200,980);
		setVisible(true);
	}
	class MyMouse2 implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {}

		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}

		@Override
		public void mousePressed(MouseEvent e) {
			int x=e.getX(); //마우스로 누르는곳의 좌표
			int y=e.getY();
			jl.setLocation(x,y);
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {}
		
	}
	
	public static void main(String[] args) {
		new MouseListener2();

	}

}
