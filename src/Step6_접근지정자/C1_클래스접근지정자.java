/*
	클래스 접근지정자
		.public : 다른패키지에서도 호출가능
		.default: 같은패키지 안에서만 가능하다.

		*import ctrl+shift+o   import package.class
 */


package Step6_접근지정자;

import bak.A;

public class C1_클래스접근지정자 {

	public static void main(String args[]) {
		
		A a=new A();
		
	}
}
