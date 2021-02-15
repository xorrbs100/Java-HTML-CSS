/*
		this : 내 자신의 객체를 가르킴
		this():내 자신의 생성자를 호출함. 반드시 생성자 속에서 사용해야함. 그것도 첫줄에
		
		super: 부모의 객체를 가르킴
		super():부모의 생성자를 호출함. 반드시 생성자 속에서 사용해야함. 그것도 첫줄에
 */

package Step7_inheritance;

class A4{
	int n = 5;
	int k = 7;
	
	A4(){
		System.out.println("1. 부모의 기본생성자");
	}
	A4(int i){
		System.out.println("매개변수 있는 부모생성자");
	}
	void display() {
		System.out.println("얏호 금욜");
	}
	void print() {
		System.out.println("난 부모 메소드야");
	}
}
class A5 extends A4{

	int n =10;
	int k =9;
	A5(){
		super(3);//부모기본생성자로안감
		System.out.println("2. 자식의 기본 생성자");
	}
	void print() {
		super.print();
		System.out.println("난 자식 멤버 a= "+n);
		System.out.println("난 부모 멤버의  a= "+super.n);
		System.out.println("난 자식 멤버 : k="+k);
		System.out.println("난 부모 멤버의 k ="+super.k);
	}
}


public class E6_Super {

	public  static void main(String args[]) {
		
		A5 a = new A5();
		
		a.print(); //부모 +자식  --> 자식을호출
		a.display();//부모
		
	}
	
	
	
}
