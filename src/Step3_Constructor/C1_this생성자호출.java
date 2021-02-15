/*
 	this의 활용법
 		1. 다른 메소드 호출할때 객체자신의 레퍼런스를 전달하는 경우
 		2. 메소드가 객체 자신의 레퍼런스를 반환할 경우
 		3. 객체의 멤버변수와 메소드속의 변수이름이 같은 경우		
 */

package Step3_Constructor;

class Book{
	
	String title,author;
	
	Book(){
		this(" ");	//this 메소드 -내 자신의 생성자호출 (문자열 한개인 생성자 호출)
		System.out.println("생성자호출");
	}
	Book(String title){
		
		this(title,"작자미상");	//this 메소드 (문자열 2개인 생성자 호출)
		System.out.println("");
	}
	Book(String title, String author){
		this.title = title;	//this - 내자신의 변수 호출
		this.author=author;
		System.out.println("제목 :"+title+" 저자 :"+author);
	}
	void show(){
		System.out.println("메소드: " +title+","+author);
	}
}

public class C1_this생성자호출 {

	public static void main (String [] args) {
		    //------------->오버로딩
		
		Book b1 = new Book();
		Book b2 = new Book("우");           //
		Book b3 = new Book("가","나");  
		b2.author="다";
		b2.show();
		b3.title="라";
		b3.show();
		Book littlePrince = new Book("어린왕자","생떼쥐페리");
		Book lovestory=new Book("춘향전");
		Book EmptyBook=new Book();
		
	}
}
