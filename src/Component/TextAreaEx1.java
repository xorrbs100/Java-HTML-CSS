/*
	TextArea
		- 특징 : 여러줄의 문자열을 입력할 수 있는 입력창 컴포넌트
		
		- 스크롤바
			. 기본적으로 지원하지 않는다.
			. 행과열을 지정했다고 해서 입력이 되지않는 것은 아니지만 스크롤바를 해놓지 않으면 볼수가 없다.
			. 스크롤바를 적용하려면 JScrollPane에 삽입하여야 한다.
				
		
 */


package Component;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class TextAreaEx1 extends JFrame{

	public TextAreaEx1() {
		setTitle("AreaEx1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JTextArea text = new JTextArea("아 재밌다...", 3,10);
		text.setBackground(Color.white);
		text.setFont(new Font("ee",Font.BOLD,10));
	/*	text.setLocation(30,30);
		text.setSize(100,50);*/
		JScrollPane scroll = new JScrollPane(text);
		scroll.setSize(200,100);
		scroll.setLocation(30,30);
		c.add(scroll);
		//c.add(text);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextAreaEx1();

	}

}
