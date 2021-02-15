/*
 	Adapter는 클래스이다
 		. 리스너의 인터페이스의 불편함을 개선하기 위해 제공되는 클래스이다.
 		. 메소드가 하나뿐인 리스너인터페이스는 제공되지 않는다.
 			-ActionListener, ItemListener, TextListener, AdjustListener는 없다.
 		. XXXListener대신에 XXXAdapter로 작성하면 된다.
 */

package Listener;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Adapter extends JFrame{

	JLabel jl;
	public Adapter(){
		setTitle("Adapter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp = new JPanel();
		setContentPane(jp);		//JFrame의 ContentPane을 JPanel에 변경세팅
		jp.setLayout(null);
		jp.setBackground(Color.ORANGE);
		jl = new JLabel("요기요");
		jp.addMouseListener(new MymouseListener1());
		jl.setSize(100,20);
		jl.setLocation(30,30);
		jp.add(jl);		
		setSize(300,200);
		setVisible(true);
	}
	class MymouseListener1 extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y= e.getY();
			jl.setLocation(x,y);	
		}
	}
	public static void main(String[] args) {
		new Adapter();

	}

}
