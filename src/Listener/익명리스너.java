//https://pixabay.com/ko/images/search/
//remove.bg
package Listener;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class 익명리스너 extends JFrame {

	JPanel jp = new JPanel();
	JLabel jl;
	public 익명리스너(){
		setTitle("익명");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(jp);
		jp.setBackground(Color.GRAY);
		jp.setLayout(null);
		jp.addMouseListener(new MouseListener() {	//	jp.addMouseListener(new Mymouse3());
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				jl.setLocation(x,y);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {}
		});
		jl=new JLabel(new ImageIcon(".\\IMGE\\123.png"));
		jl.setSize(50,50);
		jl.setLocation(30,50);
		jp.add(jl);
		setSize(1000,500);
		setVisible(true);
	}
	
	/*class Mymouse3 implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {}

		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = getX();
			int y = getY();
			jl.setLocation(x,y);
		}

		@Override
		public void mouseReleased(MouseEvent e) {}
		
	}*/
	
	public static void main(String[] args) {
		new 익명리스너();

	}

}
