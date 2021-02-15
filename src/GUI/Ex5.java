package GUI;
 
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class Ex5 extends JFrame{
 
	int a=0;
	JPanel jp = new JPanel();
	JLabel [] la = new JLabel[10];
	String [] b = {"0","1","2","3","4","5","6","7","8","9"};
	Ex5(){
		setTitle("숫자클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(jp);
		jp.setLayout(null);
		for(int i=0;i<la.length;i++) {
			la[i]= new JLabel(b[i]);
			la[i].setSize(20,20);
			int x=(int)(Math.random()*500);
			int y=(int)(Math.random()*400);
			la[i].setLocation(x, y);
			la[i].addMouseListener(new Mylistener());
			jp.add(la[i]);
		}
		
		setSize(600,500);
		setVisible(true);
	}
	class Mylistener extends MouseAdapter{
		 @Override
		 public void mouseClicked(MouseEvent e) {
			 JLabel l = (JLabel)e.getSource();
			
				  if(la[a]==l) {
				 l.setVisible(false);
				 a++;
			 }
			
		 }
	}
	public static void main (String [] args) {
		new Ex5();
		
	}
}
 
 
 