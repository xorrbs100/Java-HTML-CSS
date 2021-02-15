package Component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx1 extends JFrame{

	public TextFieldEx1() {
		setTitle("텍스트필드");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel name = new JLabel("이름 : ");
		name.setOpaque(true);
		name.setBackground(Color.CYAN);
		JTextField nameText=new JTextField("이름을 입력해주세요" ,10);
		///nameText.setEditable(false);
		JLabel hg = new JLabel("학과 : ");
		hg.setOpaque(true);
		hg.setBackground(Color.ORANGE);
		JTextField hgText=new JTextField("학과를 입력해주세요" ,10);
		JLabel age = new JLabel("나이 : ");
		age.setOpaque(true);
		age.setBackground(Color.pink);
		JTextField ageText=new JTextField("나이를 입력해주세요" ,6);
		c.add(name);
		c.add(nameText);
		c.add(hg);
		c.add(hgText);
		c.add(age);
		c.add(ageText);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx1();

	}

}
