package GuI_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Frame12 extends JFrame {

	public Frame12() {
		setTitle("학생부 입력폼");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setBackground(new Color(123,80,90));
		contentPane.setLayout(new GridLayout(5,3,2,4));//행 열 높이간격 너비간격
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학번"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학과"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("비번"));
		contentPane.add(new JPasswordField());
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Frame12();

	}

}
