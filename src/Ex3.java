//이미지 4등분

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex3 extends JFrame{

	public Ex3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		MyPanelex3 mp = new MyPanelex3();
		c.add(mp);
		setSize(600,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex3();
	}
	class MyPanelex3 extends JPanel{
		
		ImageIcon img = new ImageIcon(".\\img\\펭귄.jpg");
		Image im = img.getImage();
		//이미지크기
		int imWidth = im.getWidth(this);
		int imgHeight=im.getHeight(this);
		public MyPanelex3() {}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			//판넬크기
			int pWidth=this.getWidth();
			int pHeight=this.getHeight();
			//사진 일부분을 잘라서 판넬에 붙여보자
			g.drawImage(im, 0, 0, pWidth/2-5, pHeight/2-5, 0, 0, imWidth/2, imgHeight/2, this);
			g.drawImage(im, pWidth/2+5, 0, pWidth,pHeight/2-5, imWidth/2, 0, imWidth, imgHeight/2, this);
			g.drawImage(im, 0, pHeight/2+5, pWidth/2-5, pHeight, 0, imgHeight/2, imWidth/2, imgHeight, this);
			g.drawImage(im, pWidth/2+5, pHeight/2+5, pWidth, pHeight, imWidth/2, imgHeight/2, imWidth, imgHeight, this);
			
		}
		
	}

}
