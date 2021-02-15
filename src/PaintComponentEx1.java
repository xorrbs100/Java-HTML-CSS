import java.awt.*;

import javax.swing.*;

/*
 		. 컴포넌트 - 전형적인 모양에 적합
 		. 그래픽 - 게임,차트등 자유로운 모양에 적합
 		
 		1. JComponent 클래스의 paintComponent()추상 메소드를 상속받아서 재정의하여 구현한다.
 				
 				JComponent
 					|
 		---------------------------------
 		|		|		|		|		|
  	JButton		JPanel....................
  	paintComponent()로 구현하는 것이었음.
  		
  		2. paintComponent()가 호출되는 경우 - 화면에 그려져야 하는 경우
  			1) 컴포넌트가 처음으로 그려질때
  			2) 컴포넌트가 변화가 생길때
  			3) 컴포넌트가 가려졌다가 드러날때
  			4) 컴포넌트가 본래 크기로 복구될 때
  			5) 응용프로그램에서 컴포넌트의 repaint() 호출에 의해 다시 그려질때
  			
  		3. paintComponent(Graphics g)
  			- Graphics 객체 g : 그래픽 context라고도 부른다.
  			- 컴포넌트 그리기를 위한 기본 정보와 다양한 메소드들을 가지고 있다.
  			
  		4. JPanel
  			- 아무 모양도 없는 단순한 컴포넌트 이면서 컨테이너이다.
  			- 그래픽의 캔버스로 적합하여 JPanel을 많이 사용한다.
  			
  		5. 그래픽 메소드
  			1) 도형	- 선 : g.drawLine(시작x,시작y,끝x,끝y)
  				 	- 사각형 : g.drawRect(x1,y1,width,height)  꼭지점 1개설정 가로길이세로길이
  				 	- 둥근사각형 : g.drawRoundRect(x1,y1,x2,y2,반지름x,반지름y) 꼭지점2개+r
  				 	- 원 :	g. drawArc(중심점x , 중심점y,width,height)
  			2) 다각형 - 원호 : g.drawArc(중심점x, 중심점y, width, height, 시작각도, 끝각도)
  					- 다각형 : int [] x = {}
  							 int [] y = {} -> g.drawPolygon(x,y,꼭지점수)
  			3) 채워넣기 : fill메소드로 사용
  					- drawRect() ---> fillRect()
  
 */
public class PaintComponentEx1 extends JFrame{

	public PaintComponentEx1() {
		setTitle("그래픽");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		MyCanvas canvas = new MyCanvas();
		canvas.setBackground(Color.WHITE);
		
		c.add(canvas,BorderLayout.CENTER);
		
		setSize(1400,900);
		setVisible(true);
	}
	public static void main(String[] args) {
		new PaintComponentEx1();
	}

	class MyCanvas extends JPanel{
		//그래픽준비
		@Override
		public void paintComponent(Graphics g) {
			//캔버스초기화
			super.paintComponent(g);
			//글자그리기
			g.setColor(Color.blue);
			g.setFont(new Font("이탤릭",Font.ITALIC,30));
			g.drawString("JAVA가 제일 재밌다", 10, 500);
			//선그리기
			g.setColor(Color.blue);
			g.drawLine(20, 20, 100, 20);
			g.drawLine(100, 20, 20, 100);
			g.drawLine(20, 150, 150, 155);
			g.drawLine(50, 50, 80, 80);
			//원그리기
			g.setColor(Color.RED);
			g.drawArc(200, 200, 100, 100, 0, 360);
			//사각형그리기
			g.setColor(Color.orange);
			for(int i =0; i<10;i++) {
				g.drawRect(300+i*2,50+i*2, 100,100);
			}
			//다각형그리기
			g.setColor(new Color(0x00FF007F));
			for(int i =0; i<10;i++) {
				int [] x = {550+i,400+i,450+i,420+i};
				int [] y = {300,500,400,600};
				for(int j=0;j<10;j++) {
					g.drawPolygon(x,y,4);
				}
			}
			//원호그리기
			g.setColor(Color.black);
			for(int i = 0; i<10;i++) {
				g.drawArc(600, 300, 100+i*i, 300+1*i, 0, 288);
			}
			//타원그리기
			g.setColor(Color.BLACK);
			g.drawOval(630, 50, 150, 50);
			//사각형채우기
			g.setColor(Color.orange);
			g.fillRect(900, 50, 150, 100);
			//둥근사각형채우기
			int [] red = {92,61,0,0};
			int [] green = {209,183,130,87};
			int [] blue = {229,204,153,102};
			for(int i = 0;i<4;i++) {
				g.setColor(new Color(red[i],green[i],blue[i]));
				g.fillRoundRect(900+5*i, 200+5*i, 200-10*i, 200-10*i, 10, 10);
			}
			g.setColor(Color.white);
			g.drawString("삼겹살", 950, 310);
			
			//원채우기
			g.setColor(new Color(255,94,0));
			g.fillArc(900, 450, 100, 100, 0, 360);
			
			g.setColor(new Color(189,189,189));
			g.fillArc(925, 475, 50, 50, 0, 360);
			
			g.setColor(new Color(234,234,234));
			g.fillArc(936, 487, 25, 25, 0, 360);
			
			//타원채우기
			g.setColor(new Color(188,229,92));
			g.fillOval(1150, 50, 100, 200);
			
			//원호채우기
			g.setColor(new Color(255,94,0));
			g.fillArc(1150, 350, 100, 100, 0, 280);
			
			//다각형채우기
			int [] r = {47,71,134,183};
			int [] gr = {157,200,229,240};
			int [] b = {39,62,127,177};
			for(int i=0;i<4;i++) {
				int [] x = {1200+10*i,1250,1000};
				int [] y = {450+10*i,630,630};
				g.setColor(new Color(r[i],gr[i],b[i]));
				g.fillPolygon(x,y,3);
			}
		}
		
	}
}
