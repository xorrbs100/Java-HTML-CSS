//차트만들기

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex4 extends JFrame {

	
	Container c ;
	//데이터저장 배열
	int [] data= {0,0,0,0};
	//각도저장 배열 - 원그릴때 각도주기위함
	int [] arcAngle = new int [4];
	//컬러저장 배열 - 그래프 점유율에 따른 컬러설정값을 미리저장
	Color[] color= {Color.red,Color.blue,Color.GREEN,Color.YELLOW};
	//항목이름저장 배열
	String [] itemName = {"apple","cherry","Starwberry","prune"};
	//텍스트 입력필드
	JTextField [] InputTf=new JTextField[4];
	//차트판넬객체생성
	ChartPanel chartP=new ChartPanel();
	
	public Ex4() {
		setTitle("파이차트 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c=getContentPane();
		c.add(new InputPanel(),BorderLayout.NORTH);
		c.add(new ChartPanel());
		setSize(500,300);
		setVisible(true);
	}
	//chart를 그려주는 메소드
	void drawChart() {
		int sum = 0;
		//입력필드 입력값 합산
		for(int i = 0;i<data.length;i++) {
			data[i]=Integer.parseInt(InputTf[i].getText());
			sum +=data[i];
		}
		if(sum==0) return;
		//각도구하기
		for(int i = 0; i<data.length;i++) {
			//각도(data값 / 합계 *360)저장
			arcAngle[i]=(int)(Math.round((double)data[i])/(double)sum*360);
		}
		//구한 값으로 차트그리기
		chartP.repaint();
	}
	//입력창
	class InputPanel extends JPanel{
		
		
		public InputPanel() {
			setBackground(Color.LIGHT_GRAY);
			for(int i =0;i<InputTf.length;i++) {
				InputTf[i]=new JTextField("0",5);
				InputTf[i].addActionListener(new Action());
				add(new JLabel(itemName[i]));
				add(InputTf[i]);
				
			}
		}
		class Action implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField jt = (JTextField)e.getSource();
				int n;
				try{
					n=Integer.parseInt(jt.getText());
					
				}catch(NumberFormatException ex) {
					jt.setText("0");
					return;
				}
				drawChart();
			}
			
		}
	}
	//그래프 차트판넬
	class ChartPanel extends JPanel{
		public ChartPanel() {
			
		}
		//그래픽으로 그리기
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int startAngle = 0;
			for(int i =0;i<data.length;i++) {
				g.setColor(color[i]);
				g.drawString(itemName[i]+""+Math.round(arcAngle[i]*100/360)+"%",50+i*100,20);
			}
			for(int i =0;i<data.length;i++) {
				g.setColor(color[i]);
				g.fillArc(150, 50, 200, 200, startAngle, arcAngle[i]);
				startAngle=startAngle+arcAngle[i];
				repaint();
			}
		}
	}
	public static void main(String[] args) {
		new Ex4();
	}
}
