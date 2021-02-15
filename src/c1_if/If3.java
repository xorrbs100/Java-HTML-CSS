/*
 * 10~999 까지 정수를 입력해서 그 숫자속에 같은 숫자가 몇개있는지 처리해보자
 * 
 */



package c1_if;

import java.util.Scanner;

public class If3 {
	
	public static void main (String args[]) {
		System.out.println("숫자 100~999까지의 정수를 입력하세요>>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int num1=num/100;		
		System.out.println(num1);
		int num2=(int)((num%100)/10.0);
		System.out.println(num2);
		int num3=(int)(((num%10)));
		System.out.println(num3);
		
		if((num1==num2)&&(num2==num3)) {
			System.out.println("3자리의 숫자가 모두 같습니다.");
		}else if((num1==num2)||(num1==num3)||(num2==num3)) {
			System.out.println("3자리 숫자중 2개의 숫자가 같습니다");
		}else {
			System.out.println("숫자가 모두 같지 않습니다.");
		}
	}

}
