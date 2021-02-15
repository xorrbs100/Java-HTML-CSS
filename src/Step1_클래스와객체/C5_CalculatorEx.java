package Step1_클래스와객체;

import java.util.Scanner;

public class C5_CalculatorEx {

	public static void main(String[] args) {
		
		
		//1.객체생성
		C5_Calculator ca= new C5_Calculator();
		
		//2.스캐너입력받기
		System.out.println("두 수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		
		double x =sc.nextDouble();
		double y =sc.nextDouble();
		
		//3. 더하기계산을 한다. - Calculator 클래스속의		   add 호출활용
		ca.add(x, y);
		//			빼기									sub호출
		ca.sub(x, y);
		
		//			곱하기       							mul호출
		ca.mul(x, y);
		//			나누기								div호출
		ca.div(x, y);
		
		sc.close();
		
	}
	
}
