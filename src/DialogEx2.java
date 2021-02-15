import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class InputDialog extends JDialog{
	JTextField jf ;
	public InputDialog(JFrame frame, String title , boolean modal) {
		super(frame,title,modal);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.LIGHT_GRAY);
		jf = new JTextField(20);
		JButton btn  = new JButton("OK");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
		c.add(jf);
		c.add(btn);
		setSize(400,100);
		setLocation(100, 100);
		
	}
	String getInput() {
		if(jf.getText().length()==0) {
			return null;
		}
		else {
			return jf.getText();
		}
	}
	
}

public class DialogEx2 extends JFrame{

	public DialogEx2() {
		setTitle("Input Dialog");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		InputDialog jd = new InputDialog(this, getTitle(), true);
		JButton btn = new JButton("모달다이얼로그보기");
		btn.setFont(new Font("고딕체",Font.BOLD,20));
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jd.setVisible(true);
				String str= jd.getInput();
				if(str==null) {
					return;
				}
				JButton btn=(JButton)e.getSource();
				btn.setText(str);
				btn.setForeground(Color.red);
			}
		});
		c.add(btn);
		setSize(600,500);
		setLocation(400,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new DialogEx2();

	}

}
