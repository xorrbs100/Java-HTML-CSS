/*
 		BorderLayout
 							North
 				West		Center			East
 							South
 			. add() 활용시 반드시 위치를 명시해줘야 한다.
 			. 생성자 : BorderLayout(int Hgap, int VGap) // default 는0

 */

package GuI_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.naming.ContextNotEmptyException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class Frame9 extends JFrame{

	Frame9(){
		setTitle("BorderLayout");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout(10,10));
		contentPane.setBackground(Color.BLACK);
		contentPane.add(new JButton("add"),BorderLayout.WEST);
		contentPane.add(new JButton("sub"),BorderLayout.NORTH);
		contentPane.add(new JButton("mul"),BorderLayout.SOUTH);
		contentPane.add(new JButton("div"),BorderLayout.EAST);
		contentPane.add(new JButton("Cal"),BorderLayout.CENTER);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Frame9();

	}

}
