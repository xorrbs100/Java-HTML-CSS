package GuI_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame14 extends JFrame{

	Frame14(){
		setTitle("color grid");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(1,10));
		JButton [] btn = new JButton[10];
		
		Color [] color = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.CYAN,
						  Color.BLUE,Color.MAGENTA,Color.GRAY,Color.BLACK,Color.WHITE};
		for(int i =0; i<10;i++) {
			btn[i]=new JButton(Integer.toString(i));		//배열에 버튼생성
			int index = (int)(Math.random()*9+1);		//인덱스랜덤번호
			btn[i].setBackground(color[index]);		//버튼 백그라운드
			contentPane.add(btn[i]); 				//팬에 버튼 붙이기
		}
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Frame14();
		

	}

}
