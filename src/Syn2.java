import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyBar extends JLabel{
	int maxBarSize;
	int barSize =0;
	
	public MyBar(int maxBarSize) {
		this.maxBarSize =maxBarSize;
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		int width = (int)(((double)(this.getWidth())/maxBarSize)*barSize);
		if(width==0) {
			return;		//0이면 그리지않고 빠져나간다
		}
		g.fillRect(0, 0, width, this.getHeight());
			
		}
	//채우는메소드
	synchronized void fill() {
		if(barSize==maxBarSize) {
			try {
				wait();			//최대값까지 갔으면 대기
			}catch(InterruptedException e) {
				return;
			}
		}
		barSize ++;
		repaint();
		notify();		//스레드를 깨워놓는다.	fill()부를때를 대비해서
		
	}
	
	//자동감소메소드
	synchronized void consum(){
		if(barSize ==0 ) {
			try {
				wait();
			}catch(InterruptedException e) {
				return;
			}
		}
		barSize --;
		repaint();
		notify();
	}
}
class ConsumerThread extends Thread{
	MyBar bar;
	public ConsumerThread(MyBar bar) {
		this.bar=bar;
		
	}
	public void run() {
		while(true) {
			try {
				sleep(200);
				bar.consum();
			}catch(InterruptedException e) {
				return;
			}
		}
	}
	
}

public class Syn2 extends JFrame{
	public Syn2(String Title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(0x00FFFFFFF));
		
		MyBar bar = new MyBar(100);
		bar.setBackground(new Color(0x00B5b2ff));
		bar.setOpaque(true);
		bar.setSize(300,20);
		bar.setLocation(20,50);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				bar.fill();
			}
		});
		c.add(bar);
		
		setSize(400,200);
		setVisible(true);
		c.requestFocus();
		ConsumerThread th = new ConsumerThread(bar);		//스레드에MyBar객체전달
		th.start();
		
	}

	public static void main(String[] args) {
		new Syn2("아무키나 빠르게 눌러 막대바를 채우기");
		

	}

}
