package 연습문제;

import java.util.Scanner;

public class Ex6_윤년변별 {

	public static void main(String[] args) {
		System.out.println("연도를 입력해주세요");
		
		Scanner sc = new Scanner(System.in);
		
		int year=sc.nextInt();
		
		//윤년이라함은 4로 나누어서 떨어지는 해 , 100년단위는 아님, 400년 단위는 윤년임
		
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다");
		}
			
			sc.close();
			
		
		

	}

}
