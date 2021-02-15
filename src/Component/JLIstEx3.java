package Component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class JLIstEx3 extends JFrame{
	
	JTextField tf = new JTextField();
	Vector<String> v = new Vector<>();
	JList<String> nameList = new JList<String>(v);
	
	public JLIstEx3() {
		
		setTitle("리스트변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new Label("이름을 입력후 <Enter>"));
		c.add(tf);
		v.add("홍예훈");
		v.add("김효진");
		v.add("박유정");
		nameList.setVisibleRowCount(5);  //5행까지 보여주세요
		nameList.setFixedCellHeight(20);	//폭20
		c.add(new JScrollPane(nameList));
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				v.add(t.getText());
				nameList.setListData(v);
			}
		});
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new JLIstEx3();
	}
}
