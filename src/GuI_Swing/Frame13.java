/*
 	배치관리자가 없는 컨테이너
 	 	필요시?
 	 		- 개발자가 임의의 크기나 위치에 설정하고 싶을때
 	 		- 위치와 크기가 수시로 변할때 변하게 하고 싶을때
 	 		- 겹치는 효과를 연출하고 싶을때.
 	 		
 	 	. setSize(width x, height y)
 	 	. setLocation(int x, int y)

 */

package GuI_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame13 extends JFrame{

	Frame13(){
		setSize(600,600);
		setTitle("배치관리자가 없는 컨테이너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.PINK);
		c.setLayout(null);
		JLabel la = new JLabel("즐거운 추석 보내세요");
		la.setLocation(130,50);
		la.setSize(300,20);
		c.add(la);
		for(int i =1;i<=9;i++) {
			JButton b= new JButton(Integer.toString(i));
			b.setLocation(i*15,i*15);
			b.setSize(50,20);
			c.add(b);
		}
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Frame13();

	}

}
