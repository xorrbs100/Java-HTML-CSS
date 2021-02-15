/*
 	Swing이 GUI화면을 만드는 두가지 방법
 		. 컴포넌트기반 GUI프로그래밍
 			-JAVA에서 제공된 GUI컴포넌트를 이용해서 쉽게 GUI프로그래밍 작성
 		. Graphic기반 GUI프로그래밍
 			- 선,원,도형등 직접 화면에 그린다.
 			- 게임제작등에 주로 사용된다.
 			- 단, 개발자의 부담이 크다.
 	상속관계
 				JComponent
 					|
 			-------------------
 			|  |  |  |  |  |  |
 		JLabel,JScroll,JmenuBar,JList,JPanel,JComboBox,JSlider
 		JButton, JMenuItem(JMenu), JToggleButton(JCheckBox, JRadioButton)
 		JTextFiled, JPasswordFiled, JTextArea
 	공통메소드
 		1) 모양관련
 			. setForeground(Color): 글자색, 전경색
 			. setBackground(Color): 배경색
 			. setOpaque() : 불투명
 			. setFont()   : 폰트설정
 			. getFont()
 		2) 위치와	크기
 			. getWhidth() : 폭
 			. getHeight() : 너비
 			. getX(),getY(): X축Y축
 			. setLocation(x,y) : 위치
 			. setSize(width,height)
 		3) 상태관련
 			. setEnable() : 컴포넌트 활성화여부
 			. setVisible()
 			. inVisible() : 보이는 상태라면true
 		4) 컨테이너를 위한 메소드
 			. add() : 자식컴포넌트 추가
 			. remove() : 자식컴포넌트 제거
 			. removeeAll(): 
 			. getComponents(): 자식컴포넌트배열리턴
 			. getParent(): 부모컨테이너 리턴
 			. getTopLevelAncestor(): 최상위 부모컨테이너 리턴
 */

package Component;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JComponent extends JFrame{

	public JComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel c = new JPanel();
		setContentPane(c);
		c.setLayout(null);
		JLabel la = new JLabel("모양메소드",JLabel.CENTER);
		la.setSize(150,50);
		la.setLocation(60,100);
		la.setOpaque(true);
		la.setBackground(Color.BLACK);
		la.setForeground(Color.white);
		la.setFont(new Font("x", Font.ITALIC, 20));
		c.add(la);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JComponent();

	}

}
