package Ex5;

interface Shape{
	public static final double PI =3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("-- 다시 그립니다.");
		draw();
	}
}
class Circle implements Shape{

	double a;
	Circle(){}
	Circle(double a){
		this.a=a;
	}
	@Override
	public void draw() {
		System.out.println("반지름이 "+a+"인 원입니다");
		
	}

	@Override
	public double getArea() {
		
		return a*a*PI;
	}
	
}
class Oval implements Shape{

	double a ,b;
	Oval(){}
	Oval(double a, double b){
		this.a=a; this.b=b;
	}
	@Override
	public void draw() {
		System.out.println(a+"x"+b+"에 내접하는 타원입니다");
		
	}

	@Override
	public double getArea() {
		
		return a*b*PI;
	}
	
}
class Rect implements Shape{

	double a,b;
	Rect(){}
	Rect(double a,double b){
		this.a=a; this.b=b;
	}
	@Override
	public void draw() {
		System.out.println(a+"x"+b+"크기의 사각형 입니다");
		
	}

	@Override
	public double getArea() {
		
		return a*b;
	}
	
}
public class ShapeInterfaceEx {
	
	public static void main(String args[]) {
		Shape[] list = new Shape[3];
		list[0]=new Circle(10);
		list[1]=new Oval(20,30);
		list [2]=new Rect(10,40);
		for(int i=0;i<list.length;i++) {
			list[i].redraw();
		}
		for(int i=0;i<list.length;i++) {
			System.out.println("면적은 " + list[i].getArea());
		}
	}

}
