package Component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponent3 extends JFrame{
	public JComponent3() {
		setTitle("공통메소드");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta/Yellow");
		JButton b2 = new JButton("Disabled Button");
		JButton b3 = new JButton(" getX(),geyY() ");
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.MAGENTA);
		b1.setFont(new Font("arial",Font.ITALIC,20)); //setFont()
		b2.setEnabled(false);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				JComponent3 frame = (JComponent3)btn.getTopLevelAncestor();
				frame.setTitle(btn.getX()+","+btn.getY());
			}
		});
		c.add(b1);
		c.add(b2);
		c.add(b3);
		setSize(260,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new JComponent3();

	}

}
