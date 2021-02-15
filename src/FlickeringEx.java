import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 		레이블을 1초에 한번씩 깜빡이는 FlickeringLabel 컴포넌트를 작성하시오.
 		노랑색과 초록색으로 깜빡거림.
 */
class Flick extends Thread{
	JLabel la1=new JLabel();
	public Flick(JLabel la) {
		this.la1=la;
		start();
	}
	@Override
	public void run() {
		
		while(true) {
		la1.setBackground(Color.YELLOW);
		try {
			Thread.sleep(300);
		}catch(InterruptedException e) {
			return;
		}
		la1.setBackground(Color.GREEN);
		try {
			Thread.sleep(300);
		}catch(InterruptedException e) {
			return;
		}
		la1.setBackground(Color.BLUE);
		try {
			Thread.sleep(300);
		}catch(InterruptedException e) {
			return;
		}
		}
	}
}

public class FlickeringEx extends JFrame{
	JLabel la;
	FlickeringEx(){
		setTitle("FlickeringLabel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		la= new JLabel();
		la.setOpaque(true);
		Flick fl = new Flick(la);
		c.add(la);
		setSize(300,300);
		setVisible(true);
	//	fl.start();
	}
	

	
	public static void main(String[] args) {

		new FlickeringEx();		
		
	}

}
