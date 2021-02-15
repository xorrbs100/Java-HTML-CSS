/*
		1. 전역변수(멤버변수) :메소드 밖에 있는 변수
		2. 지역변수		  :메소드 안에서 선언된 변수
		----------------------------------------
		1. 인스턴스변수(객체변수) : static이 안붙은 변수
		2. 클래스변수			: static이 붙어 있는 변수(* static :Java에서 static 키워드를 사용한다는 것은 어떠한 값이 메모리에 한번 할당되어 프로그램이 끝날 때 까지 그 메모리에 값이 유지된다는 것을 의미한다. ) 
		
 */

package Step2_Variable;

public class V2_변수종류 {

	//멤버변수
	int a;				//인스턴스변수
	String b;
	
	static int k;		//클래스변수 객체선언하지 않아도 메모리에 올라와있음
	
	//생성자
	
	
	//메소드
	void aa() {
		int j=3; //지역변수
		System.out.println("a값은"+a+",b값은"+b+",k값은 "+k+",j값은 "+j);
		
	}
	static void bb() {
		System.out.println(k);
		//System.out.println(a,b); static이 붙은 k만 부를수 있다 인스턴스 변수는 static 보다 나중에 생성됨
		//System.out.println(j); j는 aa 메소드의 지역변수라서 에러
		
	}
}
