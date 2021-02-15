/*
		ComboBox<E>
			. JTextField + JButton + Jlist 합쳐진 기능
			. 주요메소드
				- addItem();	아이템을 리스트와 다르게 직접 ComboBox에 추가할 수 있다.
				- remove();		삭제가능
				- removeAT()	해당 인덱스번호의 아이템 삭제
				- removeAll()	
				- getSelectedIndex		인덱스번호 호출
 */

package Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JcomboBoxEx1 extends JFrame{

	//멤버변수
	Container c = getContentPane();
	String [] fruits = {"사과","바나나","망고","배","체리"};
	
	
	public JcomboBoxEx1() {
		setTitle("콤보박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());
		
		//방법1 - 생성자이용
		JComboBox<String> strCombo1 = new JComboBox<>(fruits);
		//방법2 - addItem()
		JComboBox<String> strCombo2 = new JComboBox<>();
		strCombo2.addItem("임택균");
		strCombo2.addItem(fruits[1]);
		strCombo2.removeItem(fruits[1]);
		c.add(strCombo1);
		c.add(strCombo2);
		
		
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JcomboBoxEx1();

	}

}
