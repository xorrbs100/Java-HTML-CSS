package Component;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JRadioButtonEx2 extends JFrame{
	//멤버변수(필드,전역변수)
	Container contentPane= getContentPane();
	JRadioButton [] fruits = new JRadioButton[3];
	String [] name = {"apple","pear","cherry"};
	ImageIcon [] img={new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_01.jpg"),
					   new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_02.jpg"),
					   new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_03.jpg")};
	JLabel imgla;
	//생성자
	public JRadioButtonEx2() {
		setTitle("라디오버튼리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.setBackground(Color.GRAY);		
		//버튼그룹생성
		ButtonGroup bg = new ButtonGroup();
		for(int i =0; i<fruits.length;i++) {
			fruits[i]=new JRadioButton(name[i]);
			fruits[i].addItemListener(new MyRadio());
			bg.add(fruits[i]);
			p.add(fruits[i]);
		}
	//	fruits[0].setSelected(true);		//선택설정은 반드시 버튼이 만들어진 다음에 한다.
		//이미지를 붙일 라벨설정
		imgla=new JLabel();
		imgla.setBackground(Color.MAGENTA);
		imgla.setHorizontalAlignment(SwingConstants.CENTER);
		imgla.setVerticalAlignment(SwingConstants.CENTER);
		//화면구성
		contentPane.add(p,BorderLayout.NORTH);
		contentPane.add(imgla,BorderLayout.CENTER);
		setSize(300,200);
		setVisible(true);
	}
	class MyRadio implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getItem()==fruits[0]) {
				imgla.setIcon(img[0]);
			}else if (fruits[1].isSelected()) {
				imgla.setIcon(img[1]);
			}else {
				imgla.setIcon(img[2]);
			}
			
		}
		
	}
	public static void main(String[] args) {
		new JRadioButtonEx2();

	}

}
