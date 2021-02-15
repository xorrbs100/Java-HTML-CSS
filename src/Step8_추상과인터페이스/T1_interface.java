/*
  		인터페이스
  			. 상수,추상메소드,default메소드로 구성되어 있다.
  			. 일반멤버변수는 포함될 수 없다.
  			. 상수는 public static final 로 선언되어야 하고 생략될 수 있다.
  			. 추상메소드는 public abstract로 선언되어야 하고 생략될 수 있다.
			. 상속기능을 사용하지 않으면서 서로 관련이 없는 전혀 다른 클래스가 갖는 공통적인 메소드를
			따로 떼어내어 하나의 인터페이스로 정의할 수 있다.
			. implement 예약어를 사용한다.
			. 다중상속이 된다.
		인터페이스의 역할
			. 양식 역할을 해준다. : 인터페이스를 사용하면 똑같은 양식을 써야하고 
					한번 작성해 놓으면 바꿀수가 없다.
			. 다중상속을 지원한다.
					사람
					 |
					인어공주 : 사람+물고기(인어공주 extends 사람 implement 물고기)  
 
 			. 클래스와 클래스를 연결, 접속시켜준다.
 			. 내부와 외부를 연결시켜주는 교량역할도 할 수 있다.
 */

package Step8_추상과인터페이스;

interface Inter1{
	public static final int a=3;
	public abstract void display();
	public abstract void print();
		
}
interface Inter2 extends Inter1{
	String str = "난 문자열";
	void display1();
	void print1();
	
}
class D1 implements Inter2{

	@Override
	public void display() {
		//a=10;
		System.out.println("난 재정의 했어");
		
	}

	@Override
	public void print() {
		System.out.println("나도 재정의 했어");
		
	}

	@Override
	public void display1() {
		System.out.println(str);
		
	}

	@Override
	public void print1() {
		System.out.println("나도 재정의 했지롱");
		
	}
	//추가
	public void print2(){
		System.out.println("난 추가 메소드야");
	}
	
}


public class T1_interface {

	public static void main(String[] args) {
		Inter1 inter=new D1();
		inter.display();
		inter.print();
		Inter2 inter2 = new D1();
		inter2.print1();
		inter2.display1();
		

	}

}
