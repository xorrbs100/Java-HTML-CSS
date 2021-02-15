package GuI_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame15 extends JFrame{

	Frame15(){
		setTitle("color grid");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(4,4));
		JLabel [] btn = new JLabel[16];
		Color [] color = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.CYAN,
						  Color.BLUE,Color.MAGENTA,Color.GRAY,Color.BLACK,Color.WHITE,
						  Color.PINK,Color.LIGHT_GRAY};
		for(int i =0; i<btn.length;i++) {
			btn[i]=new JLabel(Integer.toString(i));		
			int index = (int)(Math.random()*11+1);	
			btn[i].setOpaque(true);  //라벨 투명불투명
			btn[i].setBackground(color[index]);		
			contentPane.add(btn[i]); 			
		}
		
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Frame15();

	}

}
