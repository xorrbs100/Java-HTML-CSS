package c2_switch;

import java.util.Scanner;

public class Switch4 {

	public static void main(String args[]) {
		int a = 7, b= 12;
		
		System.out.println("연산자(operator)를 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		switch(str) {
		case "+" : System.out.println("덧셈:"+(a+b));break;
		case "-" : System.out.println("뺄셈:"+(a-b));break;
		case "*" : System.out.println("곱셈:"+(a*b));break;
		case "/" : System.out.println("나눗셈:"+(a/b));break;
		default : System.out.println("다시입력해주세요");
		}
		sc.close();
		
	}
}
