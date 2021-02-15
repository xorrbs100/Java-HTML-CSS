package Component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxEx2 extends JFrame{
	JCheckBox[] fruits;
	Container c;
	JLabel sumla;
	int sum=0;
	public JCheckBoxEx2() {
		setTitle("체크박스리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.ORANGE);

		//안내문구라벨
		JLabel la = new JLabel("사과 1000원, 배5000원,체리1500원");
		c.add(la);
		//과일이름 저장배열
		String [] name = {"사과","배","체리"};
		//체크박스생성
		fruits = new JCheckBox[3];
		//ButtonGroup bg = new ButtonGroup();
		
		for(int i =0; i<fruits.length;i++) {
			fruits[i]=new JCheckBox(name[i]);	//체크박스생성
			fruits[i].addItemListener(new MyCheckBox());//리스너 붙임
		//	bg.add(fruits[i]);
			c.add(fruits[i]);			//팬에붙임
		}
		//구매합산내역 출력라벨 생성
		sumla = new JLabel("현재 0원 입니다");
		c.add(sumla);

		setSize(250,200);
		setVisible(true);
		
	}
	class MyCheckBox implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			//선택과 해제시 + ,- 연산
			int selected ;
			if(e.getStateChange()==ItemEvent.SELECTED) {	//getStateChange()
				selected = +1;
			}else {
				selected=-1;
			}
			if(e.getItem()==fruits[0]) {	//사과가 선택되었다고 하면  getItem()
				sum = sum+(selected*1000);
				
			}else if (e.getItem()==fruits[1]) {//배
				sum = sum+(selected*5000);
			}else sum= sum+(selected*1500);
			sumla.setText("현재 선택한 총 금액은 "+sum+"원 입니다");
		}
		
	}
	public static void main(String[] args) {
	
		new JCheckBoxEx2();
	
	}

}
