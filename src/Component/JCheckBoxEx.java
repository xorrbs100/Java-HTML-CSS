/*
 		JCheckBox
 			. 선택,해제 두상태만 존재한다
 			. 복수체크 가능하다
 			. ItemEvent가 주로 발생된다.
 			
 		- 생성자
 		- 메소드
 			. setSelectedIcon()	: 선택되었을때 변경될 이미지 등록
 			. setBorderPainted(): 체크박스의 외곽선이 보이게
 			. setSelected()		: 체크박스에 체크처리
 			. isSelected()		: 체크상태관리
 			. setIcon()
 */

package Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBoxEx extends JFrame{

	public JCheckBoxEx() {
		setTitle("체크박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c;
		c=getContentPane();
		c.setLayout(new FlowLayout());
		JCheckBox apple = new JCheckBox("사과",true);
		JCheckBox pear = new JCheckBox("배");
		ImageIcon img = new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_03.jpg");
		ImageIcon selectedImg = new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_01.jpg");
		JCheckBox cherry = new JCheckBox("체리",img);
		cherry.setSelectedIcon(selectedImg);
		cherry.setBorderPainted(true);
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(600,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JCheckBoxEx();
		

	}

}
