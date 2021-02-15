package Step7_inheritance;

class Point{
	int x,y;
	void set(int x, int y) {
		this.x=x;
		this.y=y;
	}
	void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
class ColorPoint extends Point{
	String color;
	void setColor(String color) {
		this.color=color;
	}
	void showColor() {
		System.out.println(color);
		showPoint();
	}
}

public class E2_ColorPointEx {

	public static void main(String []args) {
		
		ColorPoint cp=new ColorPoint();
		cp.setColor("red");	//자식메소드
		cp.set(5, 9);		//부모메소드
		cp.showColor();		//자식메소드
	}
}
