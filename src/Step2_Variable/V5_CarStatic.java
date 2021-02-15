/*	-Static
 		클래스가 시작될 때 메모리의 데이터 영역에 독립적으로 생성되어 여러메소드들과 공유되어 사용된다.
 		static 선언된 변수와 메소드를 클래스변수, 클래스 메소드라고 부른다.
 		static 으로 선언된 메소드안에서는 일반변수와 this를 사용할 수 없다.
 */

package Step2_Variable;

class Car{
	String color;
	static int speed;
	void print() {
		System.out.println("색깔 : "+color);
		System.out.println("속도 : "+speed);
		System.out.println("**************");
		
	}
}


public class V5_CarStatic {

	public static void main (String [] args) {
		//객체생성전
	//	Car.speed=200; //static이 붙은 클래스변수 , 클래스 메소드는 객체생성전에도 접근가능
					   // 클래스명.변수 클래스명.메소드()
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.color="red";
		c1.speed=150;
		
		c2.color="노랑";
		c2.speed=300;
		
		c1.print();
		c2.print();
		
	}
	
}
