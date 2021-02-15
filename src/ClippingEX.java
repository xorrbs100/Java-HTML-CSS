import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 		클리핑
 			. 지정된 부분만 보이도록 하는 기능
 			. 사각형만 된다.
 			
 			. setClip(x,y,w,h) 또는 clipRect(x,y,w,h)
 			
 */
public class ClippingEX extends JFrame{

	MyPanel myp = new MyPanel();
	public ClippingEX() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(myp,BorderLayout.CENTER);
		setSize(1300,850);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ClippingEX();
	}
	class MyPanel extends JPanel{
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			ImageIcon img = new ImageIcon(".\\img\\꽃.jpg");
			Image im = img.getImage();
			int w = im.getWidth(this);
			int h = im.getHeight(this);
			
			System.out.println(w+","+h);
			
			//클리핑설정
			g.setClip(10, 10,500, 600);
			//이미지그리기
			g.drawImage(im, 0, 0, this.getWidth(),this.getHeight(),this);
			//이미지위에 글자쓰기
			g.setColor(new Color(255,255,0));
			g.setFont(new Font("돋움체",Font.BOLD,30));
			g.drawString("Java~!", 100, 280);
			
		}
	}

}
