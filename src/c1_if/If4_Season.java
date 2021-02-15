package c1_if;

import java.util.Scanner;

public class If4_Season {

	public static void main(String args[]) {
		
		System.out.println("월을 입력해 주세요");
		//1. 스캐너로 월을 받는다.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		//2. 조건문에서 3~6을 봄 7~9은 여름 10~11가을 12~2 는 겨울
		if(a>=3&&a<=6){
			System.out.println("봄");
		}else if(a>=7&&a<=9){
			System.out.println("여름");
		}else if(a>=10&&a<=11){
			System.out.println("가을");
		}else if(a==1||a==2||a==12){
			System.out.println("겨울");
		}else {
			System.out.println("다시입력해주세요");
		}
		sc.close();
		
	
}
}

