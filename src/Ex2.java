import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyCanvas extends JPanel{
	public MyCanvas() {
		setLayout(null);
		setBackground(Color.ORANGE);
		Pistal pt1 = new Pistal();
		add(pt1);
/*		Pistal pt2 = new Pistal();
		add(pt2);*/
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int cnt=0;
				if(e.getKeyChar()=='\n') { //엔터키라면
					cnt++;
					for(int i=1;i<=cnt;i++) {
						//스레드호출
						PistalTh th1 = new PistalTh(pt1);
						th1.start();
					}
				}
			}
		});
	}	
}
//총알모양
class Pistal extends JLabel{
	public Pistal() {
		setSize(10,10);
		setOpaque(true);
		setLocation(240,450);
		setBackground(Color.red);
	}
}
//총알스레드
class PistalTh extends Thread{
	JLabel pt;
	public PistalTh(JLabel pt) {
		this.pt=pt;
	}
	public void run() {
		while(pt.getY()>=0) {	
			if(pt.getY()<=0) {			//화면상단을 벗어나면 안보이게처리
				pt.setVisible(false);
			}
			pt.setLocation(pt.getX(),pt.getY()-10);
			pt.repaint();
			try {
				sleep(100);
			}catch(InterruptedException e) {
				return;
			}
		}
		//화면 상단으로 벗어나면 처음위치인 곳에서 나타나게처리
		pt.setLocation(240,450);
		pt.setVisible(true);
	}
	
	
}

public class Ex2 extends JFrame {

	public Ex2() {
		setTitle("총알연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		MyCanvas mp = new MyCanvas();
		c.add(mp);
		
		setSize(500,500);
		setVisible(true);
		mp.requestFocus();
	}
	public static void main(String[] args) {
		new Ex2();

	}

}
