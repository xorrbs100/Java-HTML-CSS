package 연습문제;

import java.util.Scanner;

public class Ex2_주민번호앞자리만출력 {
	public static void main(String[] args) {
		System.out.println("-를 포함한 주민번호를 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\s|-"); 
		
		System.out.println("주민번호 앞자리는 "+sc.next()+"입니다");
		System.out.println("주민번호 뒷자리는 "+sc.next()+"입니다");
		
		sc.close();	
	}

}
