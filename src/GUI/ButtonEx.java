package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonEx extends JFrame{

	JCheckBox c1,c2;
	JButton b1;
	
	public ButtonEx() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp = new JPanel();
		setContentPane(jp);
		b1 = new JButton("qqqqqq");
		c1 = new JCheckBox("버튼 숨기기");
		c2 = new JCheckBox("버튼 활성화");
		c1.setSelected(true);
		c2.setSelected(true);
		c1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					b1.setVisible(true);
				}else b1.setVisible(false);
			}
		});
			
			
		c2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					b1.setEnabled(true);
				}else b1.setEnabled(false);
			}
		});
		jp.add(c1);
		jp.add(c2);
		jp.add(b1);
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEx();
		
	}
}
