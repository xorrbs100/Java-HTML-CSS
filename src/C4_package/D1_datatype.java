/*
 변수: 데이터를 저장하는 그릇 ,데이터(값, 또는 주소값)이 저장된다.
                 프로그램이 연산을 하면서 중간의 값들을 저장하는데 활용된다.
 변수에는 타입이 있다.
	-기본데이터타입
		. 논리타입 : boolean 1바이트(8비트)	
		. 문자타입 : char 2바이트(유니코드 UTF8,UTF16,,) 
		. 정수타입 : byte 1바이트 -128~127 
				  short  2바이트-32,768~32,767
				  int 4바이트* -2,147,483,648~2,147,483,647
				  long 8바이트  ---끝에L을붙임
				  
		. 실수타입 : float 4바이트---끝에 F를붙임 double 8바이트*
	* 해당타입의 범위를 벗어나면 에러가 발생된다.

	-참조변수타입:배열 , 클래스, 인터페이스등이 여기에 속한다

*/

package C4_package;

public class D1_datatype {
	public static void main(String args[]) {
		//byte
		byte a; //변수선언 
		a=127;	  //초기화 (변수선언은 한번만 해야한다)
		System.out.println("127을 저장한 byte값은"+a);
		
		//short
		short b;
		b=32767;
		System.out.println("short의 최대값은"+b);
		
		//int
		int c=2147483647;
		
		System.out.println("int의 최대값은"+c);
		
		//long
		long d = 3537624123564373565L; //L을 붙여줘야 한다
		System.out.println("d의값은"+d);
		
		
		
	}
	

	
}
