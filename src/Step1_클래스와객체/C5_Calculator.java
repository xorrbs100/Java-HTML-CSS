package Step1_클래스와객체;

public class C5_Calculator {


	double add,sub,mul,div;
	
	void add(double x, double y) {
		add = x+y;
		System.out.println(add);
		
	}
	void sub(double x, double y) {
		sub = x-y;
		System.out.println((float)sub);
	}
	void mul(double x, double y) {
		mul=x*y;
		System.out.println((float)mul);
	}
	void div(double x, double y) {
		div=x/y;
		System.out.println((float)div);
	}
	
}
