/*
 	1.배치관리자란
 		. 컨테이너속의 컴포넌트들의 크기와 위치를 결정해 주는 역할을 한다.
 		. 컨테이너 크기가 변경되면 컨테이너 내부의 모든 컴포넌트들의 위치와 크기를 재조정한다.
 		. 컨테이너당 1개의 배치관리자를 꼭 갖는다.
 	2. 종류와 특성
 		. FlowLayout - 왼쪽에서 오른쪽으로 배치시킨다.
 					 - 컴포넌트의 위치와 크기를 설정할 수 있다.
 		. BorderLayout - 동,서,남,북,중앙 으로 구분하여 배치한다.
 				   	   - 컴포넌트는 지정된 위치에 해당 영역크기에 맞춰서 설정된다. (컴포넌트 크기 설정불가)
 		. GridLayout - 2차원의 평면구조로 왼쪽에서 오른쪽으로 배치하다가 아래쪽으로 순서대로 배치시킨다.
 					 - 컴포넌트는 해당 셀의 크기와 일치시킨다.				(컴포넌트 크기 설정불가)
 		. CardLayout - 카드를 쌓아놓듯이 앞에서 뒤로 겹쳐서 놓는다.
 					 - 컴포넌트의 크기는 컨테이너의 크기와 일치시킨다.			(컴포넌트 크기 설정불가)
 	3. 레아웃의 디폴트 배치관리자
 		JFrame  -  BorderLayout 
 		JPanel  -  FlowLayout
 	4. FlowLayout
 		- FlowLayout [정렬방식 (중앙기본) 옆간격 (픽셀단위,기본5) 위아래간격]
 		- FlowLayout.LEFT/RIGHT/CENTER(Default) 
 */

package GuI_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Frame8 extends JFrame{

	public Frame8() {
		setSize(600,600);
		setLocation(100,100);
		setTitle("FlowLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		//FlowLayout f = new FlowLayout();
		FlowLayout f = new FlowLayout(FlowLayout.RIGHT,10,50);
		contentPane.setLayout(f);
		contentPane.setBackground(Color.black);
		JButton btn1 = new JButton("add");
		contentPane.add(btn1);
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("Calculator"));
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Frame8();

	}

}
