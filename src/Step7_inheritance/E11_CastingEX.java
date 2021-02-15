package Step7_inheritance;

class AA{
	int a = 50;
	String b = "자바";
	
	void printA() {
		System.out.println("부모메소드입니다.");
	}
	
}
class BB extends AA{
	int c = 60;
	String d= "재밌다";
	void printB() {
		System.out.println("자식메소드입니다.");
	}
	
}
public class E11_CastingEX {

	public static void main (String [] args) {
		//기본생성
		BB b = new BB();
		b.printA();
		
		AA a;
		//업캐스팅
		a=b;
		a.printA();
		//a.printB();
		//a.c=100;
		//다운캐스팅
		BB c = (BB)a;
		c.c=100;
		c.printA();
		
	}
}
