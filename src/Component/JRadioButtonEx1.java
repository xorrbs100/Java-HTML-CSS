/*
 		JRadioButton
 			. 기본적으로 JCheckBox와 생성자 메소드 이벤트처리가 같다
 			. 차이점 
 				- 체크박스는 독립적으로 선택/해제가능
 				- 라디오버튼은 여러개가 버튼그룹으로 묶여 생성되어 하나만 선택가능
 			. 생성방법
 				1) ButtonGroup객체생성
 				2) JRadioButton들을 생성
 				3) ButtonGroup속에 JRaioButton을 등록
 				4) contentPane에 부착
 			. 재선택되는경우 Item이벤트가 발생되지 않는다.
 */

package Component;

import javax.swing.*;

public class JRadioButtonEx1 extends JFrame{

	public JRadioButtonEx1() {
		setTitle("라디오버튼");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		ImageIcon img = new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_01.jpg");
		ImageIcon selectedImg = new ImageIcon(".\\\\IMGE\\\\KaKaoTalk_20201007_093259835_02.jpg");
		//버튼그룹생성
		ButtonGroup bg = new ButtonGroup();
		//라디오버튼생성
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배");
		JRadioButton cherry = new JRadioButton("체리",img);
		cherry.setSelectedIcon(selectedImg);
		cherry.setBorderPainted(true);
		//버튼등록
		bg.add(cherry);
		bg.add(pear);
		bg.add(apple);
		contentPane.add(apple);
		contentPane.add(cherry);
		contentPane.add(pear);
		setSize(300,200);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new JRadioButtonEx1();

	}

}
