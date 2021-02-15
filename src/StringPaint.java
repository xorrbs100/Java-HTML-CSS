import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 	drawString(String str, int x, inty)
 		.str 문자열을 (x,y)영역에 그린다
 		.setColor()
 		.setFont()
 */


public class StringPaint extends JFrame {

	MyPanel panel = new MyPanel();
	
	public StringPaint(){
		setTitle("문자열 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		
		setSize(350,470);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new StringPaint();

	}
	//판넬 - 캔버스로 이용
	class MyPanel extends JPanel{
		public MyPanel() {
			setBackground(new Color(0x00ffffcc));
			JLabel la = new JLabel("즐거운 자바시간");
			la.setOpaque(true);
			la.setBackground(Color.WHITE);
			add(la);
			
		}
		@Override
			protected void paintComponent(Graphics g) {
				
				super.paintComponent(g);
				
				g.setColor(Color.blue);
				g.drawString("I LOVE U", 30, 30);
				g.setColor(new Color(255,0,0));
				
				g.setFont(new Font("Arial",Font.ITALIC,30));
				g.drawString("How much ?", 30, 60);
				
				g.setColor(new Color(0x00ff00ff));
				for(int i =0; i<=5;i++) {
					g.setFont(new Font("Jokerman",Font.ITALIC,i*10));
					g.drawString("This much", 30, 60+i*60);
				}
			}
	}
}
