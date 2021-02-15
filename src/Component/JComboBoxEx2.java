/*
 		이벤트 : ActionEvent , ItemEvent두종류가 동시에 발생한다.
 				- ActionEvent는 아이템 선택할때 무조건한개 발생
 				- ItemEvent는 새로운 아이템을 선택한 경우에만 발생
 		메소드 
 			. getSelectedIndex() : 선택한 상태인 아이템의 인덱스번호 리턴
 			. getSelectedItem()  : 선택상태인 아이템의 객체리턴
 */

package Component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxEx2 extends JFrame{

	Container c = getContentPane();
	String [] f = {"사과","바나나","키위","망고"};	//4개
	ImageIcon [] img = {new ImageIcon(".\\imge\\개.png"),new ImageIcon(".\\imge\\돋보기.png"),new ImageIcon(".\\imge\\집.png"),new ImageIcon(".\\imge\\사람.png")}; 
	JLabel la=new JLabel();
	public JComboBoxEx2() {
		setTitle("콤보박스리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());
		JComboBox<String> strCombo = new JComboBox<String>();
		for (int i=0; i<f.length;i++) {
			strCombo.addItem(f[i]);
		}
		//리스너 등록
		strCombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> b = (JComboBox)e.getSource();
				int index = b.getSelectedIndex();
				la.setIcon(img[index]);
			}
		});
		la.setSize(150,150);
		c.add(strCombo);
		c.add(la);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JComboBoxEx2();
	}
}
