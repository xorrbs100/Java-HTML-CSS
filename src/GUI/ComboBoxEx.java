//텍스트입력받아콤보박스에저장

package GUI;

import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComboBoxEx extends JFrame{
	JPanel jp = new JPanel();
	JTextField tf;
	public ComboBoxEx() {
		setTitle("콤보박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(jp);
		JComboBox<String> strc = new JComboBox<String>();
		tf = new JTextField(10);
		tf.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					String str = tf.getText();
					strc.addItem(str);
					tf.setText("");
				}
			
		}
		});
		JLabel la = new JLabel("이름을 입력해 주세요");
		jp.add(la);
		jp.add(tf);
		jp.add(strc);
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComboBoxEx();

	}

}
