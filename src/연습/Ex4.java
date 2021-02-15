//문자열을 입력받아 한글자씩 회전시켜 모두 출력하는 프로그램 
package 연습;

import java.util.Scanner;

public class Ex4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String msg = sc.nextLine();
		int len=msg.length();
		for(int i = 0 ; i<len;i++) {
			
			String first = msg.substring(0, 1);
			String last = msg.substring(1);
			msg= last+first;		//첫글자를 끝으로붙임
			System.out.println(msg);
		}
		sc.close();
	}
}