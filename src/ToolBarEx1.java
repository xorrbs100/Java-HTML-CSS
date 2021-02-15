import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/*
		. 툴바 :	바(bar)모양으로 다양한 스윙 컴포넌트를 담을 수 있는 컨테이너.
				BorderLayout 배치관리자를 가진 컨테이너에만 부착		
*/

public class ToolBarEx1 extends JFrame{

	public ToolBarEx1() {
		setTitle("툴바만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		createToolBar();
		
		setSize(400,300);
		setLocation(450,150);
		setVisible(true);
	}
	
	void createToolBar() {
		//툴바
		JToolBar jt = new JToolBar("연습툴바");
		jt.setBackground(Color.gray);
		//버튼
		JButton btn1 = new JButton("NEW");
		JButton btn2 = new JButton(new ImageIcon(".\\img\\작업.jpg"));			//이미지버튼
		JButton btn3 = new JButton(new ImageIcon(".\\img\\저장.jpg"));	
		//레이블 ,텍스트필드
		JLabel la = new JLabel("찾기");
		JTextField tx = new JTextField("검색할 단어를 입력해주세요");
		tx.setForeground(Color.LIGHT_GRAY);
		//콤보박스
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("꽃");
		comboBox.addItem("사격게임");
		//리스너부착
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox jb = (JComboBox)e.getSource();
				if(jb.getSelectedIndex()==1) {
					new 사격게임();
				}else if (jb.getSelectedIndex()==0) {
					new Ex1();
				}
			}
		});
		
		jt.add(btn1);
		jt.addSeparator();			//간격추가
		jt.add(btn2);
		jt.addSeparator();
		jt.add(btn3);
		jt.add(la);
		jt.add(tx);
		jt.add(comboBox);
		//툴바부착
		add(jt,BorderLayout.NORTH);
		
	}
	
	public static void main(String[] args) {
		new ToolBarEx1();
	}
}
