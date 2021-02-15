/*
 		연습1 (10,10)에서(200,200)까지노란색선
 		연습2 중심300,300 높이30,폭40 사각형에 내접하는 타원
 		연습3 (10,10)(5,15)(15,20)으로구성되는삼각형에 빨간색칠하기
 		연습4 : 3가지항목에 대해 빨강 노랑 파랑으로 점유율을 나타내는 점유율 원그래프 그리기
 		
 */


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class 그리기연습 extends JFrame{

	MyP p= new MyP();
	public 그리기연습() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(p);
		setSize(600,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		

		new 그리기연습();
	}

	class MyP extends JPanel{
		
		@Override
		protected void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			g.setColor(Color.YELLOW);
			g.drawLine(10, 10, 100, 100);
			g.setColor(Color.BLACK);
			g.drawOval(300, 300, 50, 20);
			g.setColor(Color.RED);
			int x [] = {100,5,15};
			int y [] = {200,250,200};
			g.fillPolygon(x,y,3);
			g.fillArc(300, 100, 100, 100, 0, 120);
			g.setColor(Color.YELLOW);
			g.fillArc(300, 100, 100, 100, 120, 120);
			g.setColor(Color.BLUE);
			g.fillArc(300, 100, 100, 100, 240, 120);
		}
	}
}
