package Step8_추상과인터페이스;

abstract class Calculator{
	int a;		//멤버변수
	abstract void cal(int x, int y) ; //추상메소드
	void print() { //멤버메소드
		System.out.println("여기는 추상클래스 입니다.");
	}
}

class Add extends Calculator{
	int b;
	@Override
	void cal(int x, int y){
		System.out.println(x+"+"+y+"="+(x+y));
	}
	
}
class sub extends Calculator{
	int b;
	@Override
	void cal(int x, int y){
		System.out.println(x+"-"+y+"="+(x-y));
	}
	
}


public class A2_CalculatorEx {

	public static void main(String[] args) {
	//추상클래스는 객체를 생성할 수 없다.
	//그래서 추상클래스를 상속받아 구현한 다음에 객체를 생성하고 사용한다.
		Calculator c = new Add(); //업캐스팅
		c.cal(5, 9);
		
	}

}
