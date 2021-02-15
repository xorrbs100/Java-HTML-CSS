import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;



/*
 	도형그리기
 		. drawLine(x1,y1,x2,y2)			//선그리기
 		. drawArc(x,y,w,h,시작각,회전각)	//원,원호
 		. drawOval(x,y,w,h)				//내접타원
 		. drawRect(x,y,w,h)				//사각형
 		. drawRound(x,y,w,h,arcW,arcH)	//둥근사각형
 		. drawPolygon(int x[] ,int y[],n)//다각형
 		
 */
public class FigurePaint extends JFrame{

	MyPanel1 panel = new MyPanel1();
	public FigurePaint() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		
		setSize(600,470);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new FigurePaint();
	}

	class MyPanel1 extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			//선그리기
			g.setColor(Color.red);
			g.drawLine(20, 20, 100, 100);
			g.drawLine(100, 20, 20, 100);
			//사각형
			g.drawRect(20, 20, 80, 80);
			
			for(int i=0;i<10;i++) {
				int red = (int)(Math.random()*255);
				int green = (int)(Math.random()*255);
				int blue = (int)(Math.random()*255);
				g.setColor(new Color(red,green,blue));
				g.drawRect(20+(i*2), 120+(i*2), 100, 100);
			}
			//둥근사각형
			g.setColor(Color.RED);
			g.drawRoundRect(20, 300, 100, 100, 30, 50);
			
			
			//원그리기
			g.setColor(Color.red);
			g.drawArc(200, 20, 100, 100, 90, 270);
			
			//다각형그리기
			int [] x = {480,540,480,420,360};
			int [] y = {40,120,200,120,100};
			g.drawPolygon(x,y,5);
			
		}
		
	}
}
