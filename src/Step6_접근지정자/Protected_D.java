package Step6_접근지정자;

import bak.Protected_A;

class Protected_B extends Protected_A{ //상속
	
	protected int b;
	protected void b() {
		b=5;
		a=50;
		a();		//객체생성 하지않아도 상속관계여서 _A를 바로부를수있다
		PrintA();
	}
	protected void printB() {
		System.out.println("여기는 protect_B");
	}	
}
class Protected_C extends Protected_B{

	void f() {
		b=3;
		PrintA();
	}
}

public class Protected_D {

	
	public static void main(String []args) {
		
		
		Protected_C pC=new Protected_C();
		pC.printB(); //부모메소드
		pC.b();
		Protected_B pB=new Protected_B();
		//pB.PrintA(); 다른패키지의 부모는 객체생성으로 부를수없다
	}
}
