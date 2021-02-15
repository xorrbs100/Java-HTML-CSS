//버튼에 색상4개만 랜덤위치에
package GuI_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame16 extends JFrame{

	Frame16(){
		setTitle("버튼");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		setLayout(new GridLayout(10, 10));
		JButton [] btn = new JButton[100];
		Color [] color  = {Color.BLACK,Color.RED,Color.CYAN,Color.GRAY};
		for(int i=0; i<btn.length;i++) {
			btn[i]=new JButton(Integer.toString(i));
			
			contentPane.add(btn[i]);
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		new Frame16();

	}

}
