package GUI;

 

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

 

public class Ex3 extends JFrame {

	Container c = getContentPane();

	JPanel jp1 = new JPanel();

	JPanel jp2 = new JPanel();

	String [] s = {"오만원","만원","천원","500원","100원","50원","10원","1원"};

	JLabel [] la= new JLabel[8];

	

	JTextField[] jt = new JTextField[8];

	JCheckBox []cb = new JCheckBox[8];

	int a;

	public Ex3() {

		setTitle("Money Canger");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jp1.setBackground(Color.CYAN);

		jp2.setBackground(Color.PINK);

		JLabel la1 = new JLabel("금액");

		JTextField tx1 = new JTextField(10);

		JButton btn = new JButton("계산");

		btn.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				JButton btn = (JButton)e.getSource();

				String str = tx1.getText();

				a = Integer.parseInt(str);

			}

		});

		btn.addMouseListener(new change());

		jp1.add(la1);

		jp1.add(tx1);

		jp1.add(btn);

		for(int i=0;i<s.length;i++) {

			la[i]=new JLabel(s[i]);

			jt[i]=new JTextField(5);

			cb[i]=new JCheckBox();

			cb[i].setSelected(true);

			jp2.add(la[i]);

			jp2.add(jt[i]);

			jp2.add(cb[i]);

		}

 

		

		c.add(jp1,BorderLayout.NORTH);

		c.add(jp2,BorderLayout.CENTER);

		

		setSize(600,400);

		setVisible(true);

	}

	class change extends MouseAdapter{

		 @Override

	      public void mouseClicked(MouseEvent e) {

			

			

			int [] q = {50000,10000,1000,500,100,50,10,1};	

			int temp = a;

			int Q=0;

			for(int i =0; i<q.length; i++){

				if(cb[i].isSelected()==true) {

					Q=temp/q[i];

				if(Q>0) {

					temp=temp-Q*q[i];

					jt[i].setText(Integer.toString(Q));

				}

				}else {

					jt[i].setText("");

				}

			}

		 }

	}

	public static void main(String[] args) {

		new Ex3();

 

	}

 

}