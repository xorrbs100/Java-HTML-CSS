package Step5_method;

class Num{
	
	void print() {
		System.out.println("매개변수가 없는 메소드");
	}
	void print( int a) {
		System.out.println("매개변수가 1개 : "+a);
	}
	void print(String x) {
		System.out.println("매개변수가 1개 : "+x);
	}
	void print(int x,String str) {
		System.out.println("매개변수가 2개 : "+ x+str);
	}
}

public class M6_overloading1 {

	public static void main(String [] args) {
		
		Num n= new Num();
		n.print();
		n.print(7);
		n.print("ㅇㅇ");
		n.print(17,"123");
	}
	
}
