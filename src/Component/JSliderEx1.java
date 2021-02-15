/*
 	JSlider
 		.슬라이드 바를 출력하여 마우스로 값을 선택하도록 하는 컴포넌트
 		
 		- 이벤트	: changeEvent
 		- 종류(Orientation)	: JSlider.HORIZONTAL, JSlider.VERTICAL
 		- 구성
 			. Knob
 			. MajorTickSpacing
 			. MinorTickSpacing
 			. label
 			. Track
 			. value
 		- 메소드
 			. setOrientation()
 			. setMinimum()/setMaximum()
 			. setPaintTicks(boolean)
 			. setPaintTrack()
 			. setPaintLables()
 			. SetMajorTickSpacing()
 			. setMinorTickSpacing()
 			. setValue()
 			. getValue()
 */

package Component;

import java.awt.*;

import javax.swing.*;

public class JSliderEx1 extends JFrame{

	public JSliderEx1() {
		setTitle("슬라이드 컴포넌트 학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		//판넬
		SliderPane sp=new SliderPane();
		//기본슬라이드
		JSlider slider1 = new JSlider(0,100,50);//최소,최대.간격
		slider1.setPaintTrack(true);
		slider1.setBackground(Color.GRAY);
		sp.add(slider1);
		//수직설정 슬라이드
		JSlider slider2 = new JSlider(0,100,50);
		slider2.setOrientation(JSlider.VERTICAL);
		slider2.setPaintTrack(true);
		slider2.setPaintLabels(true);
		slider2.setPaintTicks(true);
		slider2.setMinorTickSpacing(5);
		slider2.setMajorTickSpacing(10);
		c.add(slider2);
		//수평
		JSlider slider3 = new JSlider(JSlider.HORIZONTAL,0,100,50);
		slider3.setPaintTicks(true);
		slider3.setPaintTrack(true);
		slider3.setPaintLabels(true);
		slider3.setMajorTickSpacing(20);
		c.add(slider3,BorderLayout.SOUTH);
		
		
		
		c.add(sp,BorderLayout.NORTH);
		
		setSize(400,200);
		setVisible(true);
	}
	class SliderPane extends JPanel{
		private void SliderPane() {
			setBackground(Color.ORANGE);
		}
	}
	public static void main(String[] args) {
		new JSliderEx1();

	}

}
