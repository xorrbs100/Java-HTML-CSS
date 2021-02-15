/*
 		시작합니다 레이블을 붙이고세개의 숫자가 같으면 축하합니다 다르면 아쉽군요
 		레이블 3개를 붙여서 컨텐츠팬을 엔터키를 입력하면 1~9까지숫자중임의의숫자가 각각의레이블에 설정된다.

 */

package Listener;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game extends JFrame{

	JPanel c = new JPanel();
	JLabel la1,la2,la3,la4;
			
	public Game() {
		setTitle("겜블링");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(c);
		
		la1=new JLabel("시작합니다");
		la2=new JLabel("1번레이블");
		la3=new JLabel("2번레이블");
		la4=new JLabel("3번레이블");
		//la1.setLayout(new FlowLayout(FlowLayout.CENTER));
		c.setBackground(Color.CYAN);
		c.add(la1);
		c.add(la2);
		c.add(la3);
		c.add(la4);
		c.addKeyListener(new MyListener());
		setSize(600,300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	class MyListener extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if(keyCode==KeyEvent.VK_ENTER) {
				int a,b,c;
				a=(int)(Math.random()*9+1);
				la2.setText(Integer.toString(a));
				b=(int)(Math.random()*9+1);
				la3.setText(Integer.toString(b));
				c=(int)(Math.random()*9+1);
				la4.setText(Integer.toString(c));
				if(a==b&&b==c) {
					la1.setText("축하합니다");
				}else la1.setText("아쉽군요");
			}
			
		}

		
		
	}
	public static void main(String[] args) {
		new Game();

	}

}
