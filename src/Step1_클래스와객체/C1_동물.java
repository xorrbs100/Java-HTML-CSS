	//1. 멤버변수=필드,전역변수  -----명사/속성
	
	
	//2.생성자  (){}	------객체를 생성하고 초기화 시켜주는 역할을 한다.
	//				------생성자는 클래스 이름과 동일하다.	
	
	//3.메소드(){} -----------동사/기능

package Step1_클래스와객체;


class 말하기{//클래스 선언 

	String str;
	

	
	말하기(String s){ //생성자
		str=s;
		System.out.println(str);

	}
	말하기(){};
	
	void 웃기다() { //메소드
		System.out.println("말하면서 잘 웃깁니다.");
	}
		
	String e() { //메소드
		System.out.println("ㅋㅋㅋ");
		return "값";
	}
		
	
}

//실행클래스
public class C1_동물 { 

	public static void main(String args[]) {
		//객체생성
		말하기 s1 = new 말하기("ㅎㅎ"); 
		말하기 s2 = new 말하기("운다");

		//객체접근(활용)
		String s = s1.str;//멤버변수접근
		System.out.println("필드값 str은 "+s+"입니다");
		
		s2.웃기다();  //메소드호출
		s2.e();
		
	}

}
