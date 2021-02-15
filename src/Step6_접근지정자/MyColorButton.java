package Step6_접근지정자;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyColorButton extends JFrame {

	//생성자
	public MyColorButton() {
		//기본설정
		setTitle("내가 처음 만들어 보는 화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면생성
		Container c = getContentPane();
		//레이아웃설정
		c.setLayout(new GridLayout(1,10));
		//컴포넌트 생성
		JButton[] btn = new JButton[10];
		Color[] color = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,
						 Color.CYAN,Color.BLUE,Color.MAGENTA,Color.GRAY,Color.PINK,Color.LIGHT_GRAY};
		
		for(int i =0; i<btn.length;i++) {
			
			btn[i]=new JButton();
			btn[i].setOpaque(true);
			btn[i].setBackground(color[i]);
			//화면에 컴포넌트 부착
			c.add(btn[i]);
			
		}
		//리스너 생성
		
		
		
		//화면생성
		setSize(500,400);
		setVisible(true);
		
	}
	//실행메소드
	public static void main (String args[]) {
		new MyColorButton();
	
		
		
	}
	
	
}
