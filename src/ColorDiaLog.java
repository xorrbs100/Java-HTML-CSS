import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class ColorDiaLog extends JFrame{
	JLabel la;
	public ColorDiaLog() {
		setTitle("컬러판넬생성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		la = new JLabel("자바가 제일 재밌어요");
		la.setHorizontalAlignment(SwingConstants.CENTER);
		la.setFont(new Font("이탤릭",Font.ITALIC,30));
		c.add(la,BorderLayout.CENTER);
		creatMenu();
		
		setSize(600,300);
		setLocation(450,150);
		setVisible(true);
	}
	void creatMenu() {
		JMenuBar jb = new JMenuBar();
		JMenu jm = new JMenu("Text");
		JMenuItem jt = new JMenuItem("Color");
		
		jt.addActionListener(new MenuListener());
		jm.add(jt);
		jb.add(jm);
		setJMenuBar(jb);
	}
	class MenuListener implements ActionListener{
		//1.컬러 다이얼로그 생성
		JColorChooser jc = new JColorChooser();
		@Override
		public void actionPerformed(ActionEvent e) {
			//2. 메뉴아이템 이름 가져오기
			String cmd = e.getActionCommand();
			//3. 메뉴아이템 선택해서 해야할 일들
			if(cmd.equals("Color")) {
				//4.컬러지정
				Color selectedColor = jc.showDialog(null, "컬러다이얼로그", Color.blue);
				//5. 취소버튼을 선택 또는 그냥 창을 닫을 경우 : null일때
				if(selectedColor != null) {
					la.setForeground(selectedColor);
				}
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		new ColorDiaLog();

	}

}
