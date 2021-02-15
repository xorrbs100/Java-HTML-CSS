package Step7_inheritance;

class Parent{
	int x =100;
	
	Parent(){
		this(200);
		System.out.println("실행 1. 이때 x 값은 ?"+x);//200
	}
	Parent(int x){
		System.out.println("실행2. 이때 x 값은? "+this.x); //100
		this.x=x;
		System.out.println("실행3. 이때x값은?"+this.x); //200
		System.out.println(x); ////200
	}
	
	int getX() {
		return x;//200
	}
	
}
class Child extends Parent{
	int x = 3000;
	Child(){
		this(1000);
		System.out.println("실행 4 . 이때x값은"+x); //1000
	}
	Child(int x){
		//super(x);
		System.out.println("실행5. 이때 x값은 "+this.x); //3000
		this.x=x;
		System.out.println("실행6 이때 x 값은 "+this.x);//1000
		System.out.println(x); //1000
	}
	int gotX(){
		return x; ///1000
	}
	
}

public class E7_SuperTest {

	public static void main(String args[]) {
		
		Child c = new Child();
		System.out.println("x="+c.getX());
		System.out.println("x="+c.gotX());
	}
}
