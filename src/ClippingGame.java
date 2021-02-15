import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClippingGame extends JFrame{

	public ClippingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyCanvas mc = new MyCanvas();
		setContentPane(mc);
		
		setSize(1500,850);
		setVisible(true);
		mc.setFocusable(true);
		mc.requestFocus();
	}
	public static void main(String[] args) {
		new ClippingGame();

	}
	class MyCanvas extends JPanel{
		Image img;
		int x,y=0;		//바뀔 좌표값
		
		public MyCanvas() {
			setBackground(Color.BLACK);
			ImageIcon imge = new ImageIcon(".\\img\\펭귄.jpg");
			img = imge.getImage();

			//리스너
			addKeyListener(new MykeyListener());
		
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			//클립설정
			g.setClip(x, y, 100, 100);
			//이미지그리기
			g.drawImage(img, 0, 0, getWidth(),getHeight(),this);
			//이미지 위에 글자작성
			g.setColor(Color.RED);
			g.drawString("java", 250, 50);
			g.drawString("월요일", 20,200);
			g.drawString("재밌다", 400, 450);
			g.drawString("10월",300,200);
		}
		class MykeyListener implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				y=y-10;
				if(y<0) {
					y=0;
				}
			}else if(e.getKeyCode()==KeyEvent.VK_DOWN){
				y=y+10;
				if(y>getHeight()-100) {
					y=getHeight()-100;
				}
			}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
				x=x-10;
				if(x<0) {
					x=0;
				}
				
			}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				x=x+10;
				if(x>getWidth()-100) {
					x=getWidth()-100;
					
				}
			}
				repaint();
			
		}

		@Override
		public void keyReleased(KeyEvent e) {}

		@Override
		public void keyTyped(KeyEvent e) {}
		
	}
	}


}
