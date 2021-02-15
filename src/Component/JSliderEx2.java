package Component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderEx2 extends JFrame{

	Container c = getContentPane();
	JSlider[] colorSlider = new JSlider[3];
	JLabel colorLabel;
	public JSliderEx2() {
		setTitle("색상조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());
		for(int i = 0;i<colorSlider.length;i++) {
			colorSlider[i] = new JSlider(0,255,100);
			colorSlider[i].setPaintTrack(true);
			colorSlider[i].setPaintTicks(true);
			colorSlider[i].setMinorTickSpacing(5);
			colorSlider[i].setMajorTickSpacing(50);
			colorSlider[i].setPaintLabels(true);
			colorSlider[i].addChangeListener(new ChangeListener() {
				
				@Override
				public void stateChanged(ChangeEvent e) {
					int r = colorSlider[0].getValue();
					int g = colorSlider[1].getValue();
					int b = colorSlider[2].getValue();
					colorLabel.setBackground(new Color(r,g,b));
					colorLabel.setText("R " +r+"G "+g+"B "+b);
					
				}
			});c.add(colorSlider[i]);
			
		}

		colorSlider[0].setForeground(Color.red);
		colorSlider[1].setForeground(Color.GREEN);
		colorSlider[2].setForeground(Color.BLUE);
		colorLabel=new JLabel(new ImageIcon(".\\imge\\개.png"),SwingConstants.CENTER);
		colorLabel.setOpaque(true);
		c.add(colorLabel);
				
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JSliderEx2();

	}

}
