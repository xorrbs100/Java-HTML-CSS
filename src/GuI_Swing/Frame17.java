package GuI_Swing;

import java.awt.*;
import javax.swing.*;
class North extends JPanel{		//판넬은 부품/컨테이너가 될수있다, FlowLayout이 기본
	public North(){
		setLayout(new GridLayout(1,1));
		JLabel lb = new JLabel("내가 만든 별자리",JLabel.CENTER);//글자위치 설정가능
		add(lb);
		add(new JTextField(30)); //JTextFiled : 문장을 입력, 최대30글자		
	}
	
}
class Center extends JPanel{
	public Center() {
		setBackground(new Color(0x00F9A567));
		setLayout(null); //배치관리자가 없는 레이아웃
		int r = (int)(Math.random()*20+1);
		for(int i=0;i<r;i++) {
			int x  = (int)(Math.random()*500+1);			
			int y  = (int)(Math.random()*500+1);
			
			JLabel la = new JLabel("*");
			la.setSize(10,10);
			la.setLocation(x,y);
			la.setOpaque(true);
			la.setForeground(Color.YELLOW);//글자색
			la.setBackground(Color.BLACK);
			add(la);
			
		}	
	}	
}


public class Frame17 extends JFrame{
	public Frame17(){
		setTitle("반짝반짝작은별");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(2,5));
		c.setBackground(new Color(0x00D5D5D5));
		//**************0
		North n = new North();
		n.setBackground(new Color(0x005CD1E5));
		c.add(n,BorderLayout.NORTH);
		Center ce = new Center();
		ce.setBackground(Color.BLACK);
//		c.add(ce,BorderLayout.CENTER);
		c.add(ce);
		//**********************
		setSize(600,600);
		setLocation(50,50);
		setVisible(true);
	}

	public static void main(String [] args) {
		new Frame17();
	}
}
