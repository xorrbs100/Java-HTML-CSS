/*
 		JButton
 		- 생성자
 		- ImageButton
 			. setIcon()				: 디폴트이미지
 			. setrolloverIcon()		: 버튼위로 마우스가 올라갈때 출력되는 이미지
 			. setpressedIcon()		: 버튼이 눌러져 있는 동안 출력되는 이미지
 		- 버튼/레이블 정렬
 			. 수평정렬	 : setHorizontalAignment(SwingConstants.LEFT/RIGHT/CENTER)
 			. 수직정렬  : setVerticalAignment(SwingConstants.TOP/BOTTOM/CENTER)
 */

package Component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JButtonEx extends JFrame{
	Container contentPane;
	public JButtonEx() {
		setTitle("버튼");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.setBackground(new Color(0x00D5D5D5));
		ImageIcon normal = new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_04.jpg");
		ImageIcon rollover = new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_05.jpg");
		ImageIcon pressed = new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_07.jpg");
		JButton btn = new JButton("call");
		btn.setBackground(Color.YELLOW);
		btn.setOpaque(true);
		btn.setSize(500,500);
		btn.setIcon(normal);
		btn.setRolloverIcon(rollover);
		btn.setPressedIcon(pressed);
		//정렬
		btn.setHorizontalAlignment(SwingConstants.LEFT);
		btn.setVerticalAlignment(SwingConstants.TOP);
		
		JLabel la = new JLabel("요기가어디게");
		la.setHorizontalAlignment(SwingConstants.RIGHT);
		la.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(la);
		contentPane.add(btn);
		setSize(1500,800);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JButtonEx();

	}

}
