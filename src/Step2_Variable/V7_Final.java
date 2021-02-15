/*
 		final변수
 		  - final은 중간에 변경이 불가하고 변수명을 대문자로만 만들기를 권장한다.
 		  - 기능
 		  	. 객체 생성후 실행중에 값을 변경할 수 없는 것을 선언할때(급여 단가 파이)
 		  	. final 선언 클래스는 상속될 수 없다.
 		  	. final 선언된 메소드는 오버라이딩 시킬 수 없다. 		
 */


package Step2_Variable;

class Final{
	int a =7;
	final int ABC=10; //대문자변수명
	
}

public class V7_Final {

	public static void main (String [] args) {
		
		Final fn = new Final();
		
		fn.a=9;
		//fn.ABC=0;// final 변수는 변경불가
		System.out.println(fn.a+","+fn.ABC);
	}
}
