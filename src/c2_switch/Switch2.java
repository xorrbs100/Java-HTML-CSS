package c2_switch;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		
		System.out.println("점수를 입력해 주세요");
		//스캐너로성적받아10단위
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String grade="";
		
		switch(n) {
		case 90 : grade="A"; break;
		case 80 : grade="B"; break;
		case 70 : grade="C"; break;
		case 60 : grade="D"; break;
		default : grade="F";
		}
		//grade를ABCD로출력
		System.out.println("등급은 "+grade+" 입니다");
		
		switch (n/10) {
		case 9 : grade="A"; break;
		case 8 : grade="B"; break;
		case 7 : grade="C"; break;
		case 6 : grade="D"; break;
		default : grade="F";
		
		}
		
		sc.close();
		System.out.println("등급은 "+grade+" 입니다");
	}

}
