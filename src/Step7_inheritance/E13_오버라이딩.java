/*  오버라이딩 학습
  	-상속 관계에서 부모의 것을 재정의
  	-오버라이딩 조건
  		1) 슈퍼클래스의  메소드와 완전히 동일한 메소드를 재정의 한다.
 		2) 메소드 오버라이딩 시에 슈퍼클래스 메소드의 접근 지정자보다 접근의 범위가 좁아질수 없다(에러)
 		3) 메소드 오버라이딩 시에 메소드이름, 매개변수 리스트, 리턴타입까지 모두 같아야 한다.

 	
				오버로딩과              오버라이딩
			--------------------------------
			정적바인딩				동적바인징
			컴파일시중복메소드중  	실행시간에 오버라이딩된
			호출메소드결정		메소드 찾아 호출
			
			이름이 같은 여러개의		슈퍼클래스에 구현된 메소드를 무시하고
			메소드를 중복 정의하여		서브클래스에서 새로운기능의 메소드를
			사용자편리성향상키위함		재정의 하고자 할 경우
*/		
			




package Step7_inheritance;

class Shape{
	public void draw() {
		System.out.println("shape");
	}
}
class Line extends Shape{

	
	public void draw() {
		System.out.println("선을 그립니다");
	}
	
}
class Rect extends Shape{
	public void draw() {
		System.out.println("사각형을 그립니다");
		
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("원을 그립니다");
	}
}
public class E13_오버라이딩 {

	public static void main (String []args) {
		Line line = new Line();
		line.draw();
		//동적바인딩-오버라이딩-상속,업캐스팅
		Shape s ;
		s= new Line();//업캐스팅
		s.draw();
		s= new Rect();
		s.draw();
	}
}
