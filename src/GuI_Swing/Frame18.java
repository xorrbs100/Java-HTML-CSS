package GuI_Swing;

import java.awt.*;
import javax.swing.*;

/*class NPanel extends JPanel{
	public NPanel() {
		setLayout(new FlowLayout(FlowLayout.CENTER));	//배치를 중앙부터
		setBackground(Color.GRAY);
		add(new JButton("OPEN"));
		add(new JButton("READ"));
		add(new JButton("CLOSE"));
	}
	
}*/
class CPanel extends JPanel{
	public CPanel() {
		setLayout(null);
		setBackground(new Color(0x00FFEEBFE));
		JLabel la1 = new JLabel("Hello");
		setOpaque(true);
		la1.setSize(60,50);
		la1.setLocation(100,30);
		add(la1);
		JLabel la2 = new JLabel("추석명절 잘 쉬셨나요");
		setOpaque(true);
		la2.setSize(150,50);
		la2.setLocation(50,100);
		add(la2);
		JLabel la3 = new JLabel("다시 열공");
		setOpaque(true);
		la3.setSize(150,50);
		la3.setLocation(150,250);
		add(la3);
	}
}
public class Frame18 extends JFrame{
	//멤버변수
	CPanel cp;
	NPanel np;

	public Frame18() {
		setTitle("배치관리 혼합응용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		np = new NPanel();
		cp = new CPanel();
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,5));
		c.add(np,BorderLayout.NORTH);
		c.add(cp,BorderLayout.CENTER);
		setSize(600,600);
		setVisible(true);
	}
	class NPanel extends JPanel{		//내부클래스로 작성 멤버변수 사용가능
		public NPanel() {
			setLayout(new FlowLayout(FlowLayout.CENTER));	//배치를 중앙부터
			setBackground(Color.GRAY);
			add(new JButton("OPEN"));
			add(new JButton("READ"));
			add(new JButton("CLOSE"));
		}
		
	}
	public static void main(String[] args) {
		new Frame18();

	}

}
