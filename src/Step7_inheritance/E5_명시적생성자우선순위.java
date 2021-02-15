package Step7_inheritance;

class DB1{
	public double d1;
	public DB1() {
		System.out.println("클래스 DB1의 묵시적 생성자 수행");
		d1=10*10;
	}
}
class DB2 extends DB1{
	public double d2;
	public DB2(double d) {
		System.out.println("클래스 DB2의 묵시적 생성자 수행");
		d2=d*d*d;
	}
	
}

public class E5_명시적생성자우선순위 {

	public static void main(String args[]) {
		DB2 s = new DB2(11);
		
		System.out.println("10의 2제곱"+s.d1);
		System.out.println("10의 3제곱"+s.d2);
	}
}
