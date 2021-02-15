package Step4_objectArray;

class Circle{
	private int radius;
	
	Circle(){}
	Circle(int radius){
		this.radius=radius;
		
		
	}
	double getArea() {
		
		
		return 3.14*radius*radius;
	}
	
}

public class OA1_Circle {

	
	public static void main(String []args) {
		//객체 배열을 선언해서 생성
		Circle[] c1 = new Circle[10];
		//반복문으로 객체입력
		for(int i =0 ; i<c1.length;i++) {
			c1[i]=new Circle(i);
		}
		//호출
		for(int i=0;i<c1.length;i++) {
			//System.out.println(c1[i].radius);   radius는 private
			System.out.println(c1[i].getArea());
			
		}
	
	
	}
}
