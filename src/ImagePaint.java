/*
 		이미지 그리기
 			. JLabel에 이미지를 붙여서 출력하는 방법
 			. Graphic으로 그리는 방법
 			
 			. ImageIcon 클래스 --> Image클래스 : 이미지의 객체정보를 축출
 		메소드
 			. 원본크기로 그리기		: drawImage(img,x,y,bgColor,this);
 			. 크기 조절해서 그리기	: drawImage(img,x,y,w,h,bgColor,this)
 			. 일부분을 잘라서 그리기	: drawImage(img,dx1,dy1,dx2,dy2,sx1,sy1,sx2,sy2,this)
 			
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImagePaint extends JFrame{

	Container c;
	public ImagePaint() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c=getContentPane();
		c.add(new MyPanel2(),BorderLayout.CENTER);
		setSize(1600,850);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ImagePaint();	
	}
	class MyPanel2 extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			ImageIcon img = new ImageIcon(".\\img\\미식축구.jpg");
			Image im = img.getImage();//객체정보축출
			int width = im.getWidth(this);
			int height=im.getHeight(this);
			
			//원본 그대로
			g.drawImage(im, 0, 0,Color.blue, this);
			//원본크기조절
			g.drawImage(im, 300, 20, 100, 200, this);
			g.drawImage(im, 500, 20, 400, 200, this);
			//일부영역을 잘라서 지정된 영역에 그리기
			g.drawImage(im, 1000, 20, 1224, 340, 0, 0, 224, 120, this);		//붙일 사각형먼저 지정 떼어낼 사각형영역지정
			g.drawImage(im, 20, 500, 120, 650, 0, 0, 100, 150, this);
			g.drawImage(im, 250, 500, 200, 650, 20, 20, 80, 170, this);
		}
	}
}
