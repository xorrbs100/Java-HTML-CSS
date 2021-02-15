/*
 		- 생성자
 		- 정렬(hAlignement)
 			. SwingContants.LEFT/Right/Center
 		- JLabel에 담을수 있는 이미지는 .png, gif, jpg 			
 */
package Component;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JLableEx extends JFrame{
	Container c;
	JLabel imageLabel,la;
	
	public JLableEx() {
		setTitle("레이블 학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(new FlowLayout());
		//문자열레이블
		JLabel textLabel = new JLabel("자바기반 안드로이드 개발과정");
		textLabel.setFont(new Font("a",Font.ROMAN_BASELINE,16));
		//이미지레이블
		ImageIcon beauty = new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_01.jpg");
		imageLabel = new JLabel(beauty); //사이즈는 그림사이즈에 맞춘다
		//문자열+이미지
		ImageIcon normalIcon = new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_02.jpg");
		JLabel label = new JLabel("궁금한게 있으면 전화주세요",normalIcon,SwingConstants.CENTER);
		label.addMouseListener(new MyMouse11());
		
		//숨겨진 이미지레이블 생성
		la = new JLabel(new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_03.jpg"));
		la.setVisible(false);
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		c.add(la);
		
		setSize(400,600);
		setVisible(true);
		
		
	}
	class MyMouse11 extends MouseAdapter{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(imageLabel.isVisible()) {
				imageLabel.setVisible(false);
				la.setVisible(true);
			}else {
				imageLabel.setVisible(true);
				la.setVisible(false);
			}
			
		}
		
	}
	public static void main(String[] args) {
		new JLableEx();

	}

}
