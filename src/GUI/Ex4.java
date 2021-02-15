 

package GUI;

 

 

import java.awt.*;

import javax.swing.*;

import javax.swing.event.*;

 

public class Ex4 extends JFrame{

 

	JPanel jp = new JPanel();

	JSlider fontsize= new JSlider();

	JLabel java;

	public Ex4() {

		setContentPane(jp);

		setTitle("Jslider Pratice Frame");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jp.setLayout(new BorderLayout());

		java = new JLabel("I LOVE JAVA",SwingConstants.CENTER);

		java.setOpaque(true);

		fontsize.setOpaque(true);

		fontsize = new JSlider(1,100,50);

		fontsize.setPaintTrack(true);

		fontsize.setMinorTickSpacing(7);

		fontsize.setMajorTickSpacing(20);

		fontsize.setPaintTicks(true);

		fontsize.setPaintLabels(true);

		fontsize.addChangeListener(new ChangeListener() {

			@Override

			public void stateChanged(ChangeEvent e) {

				int a = fontsize.getValue();

				java.setFont(new Font("ff",Font.ITALIC,a));

			}

		});

		jp.add(fontsize,BorderLayout.NORTH);

		jp.add(java);

		setSize(600,600);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ex4();

 

	}

 

}