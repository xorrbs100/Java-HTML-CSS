/*
 * 상수 (변하지않는값)
 * 	. 반족적으로 사용하고 변하지 않아야 하는값을 상수로 선언해 둔다.
 * 	. 예) 3.14
 * 	. 선언방법
 * 		final 대문자변수 = 값;
 * 
 */



package C4_package;

import java.util.Scanner;


public class D8_Constant {
	public static void main(String args[]) {
		//변수선언 , 초기화
		final double PI=3.14; //파이널로 선언
		System.out.println("반지름 값을 입력하세요");
		//double radius = 10;   //반지름
		
		double circleArea=0; //원의 면적
		double circlelength=0;//원의 둘레의 길이
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		
		//PI=3; 파이널로 선언되면 중간에 못바꾼다
		
		circleArea=radius * radius * radius * PI;
		circlelength=(radius*2)*PI;
		
		System.out.println("원의면적 : "+circleArea);
		System.out.println("원의둘레길이 : "+circlelength);
		sc.close();
	}
	
}
