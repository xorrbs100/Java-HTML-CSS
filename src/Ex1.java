import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ex1 extends JFrame{

	JButton btn;
	MyPanel mp = new MyPanel();
	public Ex1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(mp);
		setSize(600,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex1();
	}

	class MyPanel extends JPanel{
		ImageIcon Imge;
		Image img;
		public MyPanel() {
			
			setBackground(Color.ORANGE);
			btn = new JButton("배경1");
			btn.addActionListener(new MyListener());
			add(btn);
		}

	class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			if(btn.getText()=="배경1") {
				btn.setText("배경2");
				Imge = new ImageIcon(".\\img\\꽃.jpg");
				img = Imge.getImage();
			}else {
				btn.setText("배경1");
				Imge = new ImageIcon(".\\img\\펭귄.jpg");
				img = Imge.getImage();
			}
		}	
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		repaint();
	}
		
	}
}
