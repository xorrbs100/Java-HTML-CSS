import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 		Dialog 대화상자
 			- 입력을 받고 출력을 해주는 창
 			- JFrame과 동일한 형식으로 생성한다.
 			- 모달과 모달리스 두가지 형태
 				. 모달 : 다이얼로그가 오픈되면 다이얼로그를 닫기전까지 다른작업을 할 수 없다.
 				. 모달리스 : 다이얼로그창과 다른창이 각각 개별적으로 작동한다.
 			- getInput() : 텍스트필드 컴포넌트에 사용자가 입력한 문자열을 리턴한다.
 */

public class DialogEx extends JFrame{
	
	MyDialog jd =new MyDialog(this, getTitle(), false);
	public DialogEx() {
		setTitle("DialogEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JButton btn = new JButton("Dialog Open");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jd.setVisible(true);
				
			}
		});
		c.add(btn);
		setSize(500,500);
		setLocation(500,150);
		setVisible(true);
		
	}
	class MyDialog extends JDialog{
		public MyDialog(JFrame frame, String title, boolean modal) {
			super(frame,title,false);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			c.setBackground(new Color(0x009536FF));
			JTextField tf = new JTextField(10);
			JButton btn = new JButton("OK");
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			c.add(tf);
			c.add(btn);
			setSize(200, 100);
			setLocation(600,150);
			
		}
	}
	public static void main(String[] args) {
		new DialogEx();

	}

}
