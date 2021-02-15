/*
 * 1. 주석 : //, ctrl+shift+/
 * 2. 이름작명법 . 패키지 : 모두 소문자 
 * 			  . 클래스명 : 대문자 
 * 			  . 변수명 : 소대문자
 * 			  . 메소드 : 소대문자
 * 			  . 상수  : 대문자  
 * 3. 식별자 규칙
 *  	. 첫글자는 숫자불가
 *  	. 한글도 가능
 *  	. if, while, class등 자바의 예약된 단어는 사용불가
 *  	. true, false,null 사용불가
 *  	. 대소문자 구분됨
 *  	. 길이제한 없음
 *  4. 클래스
 *  	. 자바의 프로그램 단위
 *  	. 구성요소 
 *  		- 전역변수(필드)
 *  		- 생성자
 *  		- 메소드
*/
package C2_기본문법;

public class Java기본문법 {

	//멤버변수(필드)
	int x;
	int y;
	//생성자
	Java기본문법(int x, int y){
		this.x = x;
		this.y =y;
	}
	//메소드
	void addCalculator() {
		int sum = 0;
		sum = x+y;
		System.out.println("합:"+sum);
		
	}
	
	//실행메소드
	public static void main(String arg[]) {
		//객체생성
		Java기본문법 객체 = new Java기본문법(10,20);
		//메소드나 변수호출 활용
		객체.addCalculator();
	}
	
}



