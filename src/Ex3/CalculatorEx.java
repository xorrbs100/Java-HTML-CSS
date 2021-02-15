package Ex3;

import java.util.Scanner;

/*
class Add extends Calculator{

	
	int a ,b;
	@Override
	int calculate() {
		
		return a+b;
				
	}

	@Override
	void setValue(int a, int b) {
		this.a=a; this.b=b;
		
	}
	
}
class Sub extends Calculator{
	
	int a, b;
	@Override
	int calculate() {
		return a-b;
	}

	@Override
	void setValue(int a, int b) {
		this.a=a;this.b=b;
		
	}
	
}
class Mul extends Calculator{
	int a,b;
	@Override
	int calculate() {
		return a*b;
	}
	@Override
	void setValue(int a, int b) {
		this.a=a;this.b=b;
		
	}
	
}
class Div extends Calculator{
	int a,b;
	@Override
	int calculate() {
		return a/b;
	}
	@Override
	void setValue(int a, int b) {
		this.a=a;this.b=b;
		
	}
	
}
*/
public class CalculatorEx {

	public static void main(String []args) {
		
		Calculator ca1 = new Add();
		Calculator ca2 = new Sub();
		Calculator ca3 = new Mul();
		Calculator ca4 = new Div();
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		for(;;) {
			System.out.println("1부터 5까지 수를 입력하세요 종료는 5 : ");
			int num= sc.nextInt();
			
			switch(num) {
			
			case(1): System.out.println("계산할 두수를 입력하세요");
			int a = sc.nextInt();
			int b = sc.nextInt();
			ca1.setValue(a,b); System.out.println(ca1.calculate()); break; 
			case(2):
			System.out.println("계산할 두수를 입력하세요");
			a = sc.nextInt();
			b = sc.nextInt();
			ca2.setValue(a,b);	System.out.println(ca2.calculate()); break;
			case(3):a = sc.nextInt();
			b = sc.nextInt(); ca3.setValue(a,b);	System.out.println(ca3.calculate()); break;
			case(4):a = sc.nextInt();
			b = sc.nextInt(); ca4.setValue(a,b);	System.out.println(ca4.calculate()); break;
			case(5): flag = true ; break;
			default :System.out.println("잘못 입력하셨습니다");break;
			
		}if (flag == true) {
             System.out.println("프로그램이 종료되었습니다.");
              break;
			
		
		}

	}sc.close();
}
}














