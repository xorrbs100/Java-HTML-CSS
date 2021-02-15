import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;



/*
 	도형채우기
 		. fillLine(x1,y1,x2,y2)			//선그리기
 		. fillArc(x,y,w,h,시작각,회전각)	//원,원호
 		. fillOval(x,y,w,h)				//내접타원
 		. fillRect(x,y,w,h)				//사각형
 		. fillRound(x,y,w,h,arcW,arcH)	//둥근사각형
 		. fillPolygon(int x[] ,int y[],n)//다각형
 		
 */
public class FigurePaint1 extends JFrame{

	MyPanel1 panel = new MyPanel1();
	public FigurePaint1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		
		setSize(600,470);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new FigurePaint1();
	}

	class MyPanel1 extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillRect(10, 10, 50, 50);
			
			g.setColor(Color.blue);
			g.fillOval(10, 70, 50, 50);
			
			g.setColor(Color.ORANGE);
			g.fillRoundRect(10, 130, 50, 50, 20, 20);
			g.setColor(Color.RED);		//외곽선용
			g.drawRoundRect(10, 130, 50, 50, 20, 20);
			
			g.setColor(Color.MAGENTA);
			g.fillArc(10, 190, 50, 50, 180, 270);
			
			g.setColor(Color.orange);
			int[]x= {30,10,30,60};
			int[]y= {250,275,300,275};
			g.fillPolygon(x,y,4);
			
			
			
			
		}
		
	}
}
