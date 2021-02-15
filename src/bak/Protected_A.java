package bak;

public class Protected_A {

	protected int a;
	protected String a() {
		return "Protected_A";
	}
	protected void PrintA() {
		System.out.println("여기는 다른 패키지의 protected지정 메소드입니다");
		
	}
}
