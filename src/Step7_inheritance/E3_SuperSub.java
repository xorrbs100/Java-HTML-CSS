package Step7_inheritance;

class A{
	public int p;
	private int n;
	
	public void setN(int n) {
		this.n=n;
	}
	public int getN() {
		return n;
	}
	
}
class B extends A{
	
	private int m;
	private int n;
	
	public void setM(int M) {
		this.m=m;
	}
	public int getM() {
		return m;
		
	}
	public String toString() {
		return super.getN()+","+this.getM();
		
	}
}

public class E3_SuperSub {

	public static void main(String []artgs) {
		A a =new A();
		B b = new B();
		
		a.p=6;
	//	a.n=5;  //접근불가
		
		b.p=7;
	//	b.n=8; //접근불가
		b.setN(10);
		
	//	b.m=20; //접근불가
		b.setM(20);
		System.out.println(b.toString());
		
		
	}
}
