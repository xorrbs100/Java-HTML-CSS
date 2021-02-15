/*
 	싱글톤 패턴이란 ?
 		. 객체지향 프로그램에서 인스턴스(객체)를 단 하나만 생성하는 디자인 패턴을 말한다.
 		. static을 응용하여 싱글톤 패턴을 구현할 수 있다.
 */
package Step6_접근지정자;

class Company{
	//멤버변수
	private static Company instatance ;
	//생성자
	private Company() {}
	//메소드
	public static Company getInstance() {
		if(instatance==null) {
			instatance = new Company();  //없으면 객체생성해라
		}
		return instatance;  //외부에서는 유일하게 여기를 통해서만 객체를 생성할 수 있다.
	}
	
}

public class C3_SingleTorn {
 
	public static void main() {
		
		//Company c=newCompany();
		Company c=Company.getInstance();
		
		
		
	}
	
	
}
