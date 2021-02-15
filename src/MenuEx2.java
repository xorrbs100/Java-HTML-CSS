import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MenuEx2 extends JFrame{
	
	JLabel la;
	public MenuEx2() {
		setTitle("윈도우창만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel mp = new MyPanel();
		setContentPane(mp);
		la = new JLabel("메뉴를 선택해 주세요");
		la.setFont(new Font("고딕체",Font.ROMAN_BASELINE,50));
		la.setHorizontalAlignment(SwingConstants.CENTER);
		mp.add(la);	
		setSize(500,300);
		setVisible(true);
		
		
	}
	void createMenu() {
		JMenuBar jb = new JMenuBar();
		jb.setBackground(Color.BLACK);
		//메뉴
		JMenu jm[] = new JMenu[5];
		String[] strMenu = {"File","Edit","Refactor","Navigate","Search"};
		for(int i =0; i<strMenu.length;i++) {
			jm[i]=new JMenu(strMenu[i]);
			jb.add(jm[i]);
		}
		//메뉴아이템
		JMenuItem[] jtem = new JMenuItem[5];
		String[] strItem = {"Color","Font","Top","Center","Bottom"};
		for(int i =0; i<strItem.length;i++) {
			jtem[i]= new JMenuItem(strItem[i]);
			jm[0].add(jtem[i]);
			jtem[i].addActionListener(new MyAction());
		}
		
		
		setJMenuBar(jb);
	}
	class MyAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//선택된 아이템의 문자열 반환 : getActionCommand()
			String cmd = e.getActionCommand();
			if(cmd.equals("Color")){
				la.setForeground(Color.RED);
			}
			else if(cmd.equals("Font")) {
				la.setFont(new Font("a",Font.ITALIC,50));
			}
			else if (cmd.equals("Top")) {
				la.setVerticalAlignment(SwingConstants.TOP);
			}
			else if(cmd.equals("Bottom")) {
				la.setVerticalAlignment(SwingConstants.BOTTOM);
				
			}
			else if (cmd.equals("Center")) {
				la.setVerticalAlignment(SwingConstants.CENTER);
				la.setForeground(Color.BLACK);
				new 사격게임();
			}
			
		}
	}
		
	class MyPanel extends JPanel{
		public MyPanel() {
			setLayout(new BorderLayout());
			setBackground(Color.WHITE);
			createMenu();
		}
			
	}
	public static void main(String[] args) {
		new MenuEx2();

	}
	
}
	


