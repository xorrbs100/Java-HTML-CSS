/*
  		GridLayout
  			. 컨테이너 공간을 격자 사각형의 격자(그리드)모양으로 분할한다.
  			. 각 셀에는 오직 하나의 컴포넌트를 배치한다.
  			. 셀보다 많은 컴포넌트가 추가되면 행,수가 지켜지지않고 적당히 변형된다.
  			. FlowLayout과 크게 다르지 않다.
  			. 생성자
  				GridLayout(int row, int cols, int hGap, int vGap)
  				GridLayout(int row,int cols) gap은0;
  				GridLayout(): default= 1,1,0,0
 */

package GuI_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame11 extends JFrame {

	public Frame11() {
		setTitle("GridLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.setLayout(new GridLayout(4,3));
		JButton btn = new JButton("1");
		btn.setBackground(Color.BLACK);
		btn.setForeground(Color.BLUE);
		con.add(btn);
		con.add(new JButton("2"));
		con.add(new JButton("3"));
		con.add(new JButton("4"));
		con.add(new JButton("5"));
		con.add(new JButton("6"));
		con.add(new JButton("7"));
		con.add(new JButton("8"));
		con.add(new JButton("9"));
		con.add(new JButton("+"));
		con.add(new JButton("-"));
		
		setSize(600,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Frame11();

	}

}
