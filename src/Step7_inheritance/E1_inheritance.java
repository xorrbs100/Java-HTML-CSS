/*
 		상속은 부모의 멤버변수와 메소드를 그대로 가져와서 사용하는 것이다.
 		생성자는 상속되지 않는다.
 		자식의 객체속에는 부모에게서 물려받은 것이 그대로 들어있다
 		자식의 객체생성시 생성자의 실행은 부모것부터 실행된다
 */


package Step7_inheritance;

class A1{
	protected int a=7;
	protected int b=10;
	A1(){
		System.out.println("난 부모클래스");
	}

}
class A2 extends A1{
	A2(){
		System.out.println("난 자식 클래스");
	}
	void f() {
		System.out.println("자식 메소드");
	}
}

public class E1_inheritance {

	public static void main(String []args) {
		
		A2 k = new A2();	//자식객체
		k.f();				//자식메소드
		System.out.println(k.a); //부모필드
		System.out.println(k.b); //부모필드
		
	}
}
