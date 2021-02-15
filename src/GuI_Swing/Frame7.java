/*
 		배치관리자
 			1. FlowLayout					배치관리자없는 null==>위치지정
 			2. BorderLayout
 			3. GridLayout
 			4. CardLayout
 */

package GuI_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame7 extends JFrame{

	public Frame7() {
		setTitle("일곱번째창");
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.BLACK);
		JButton btn = new JButton("ok");
		contentPane.add(btn,BorderLayout.NORTH);
		contentPane.add(new JButton("cancel"),BorderLayout.SOUTH);
		contentPane.add(new JButton("Ignore"),BorderLayout.EAST);
		contentPane.add(new JButton("east"),BorderLayout.WEST);
		contentPane.add(new JButton("center"),BorderLayout.CENTER);
		
		setSize(600,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		

		new Frame7();
	}

}
