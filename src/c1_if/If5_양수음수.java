//스캐너로 숫자 입력받아서 양수인지 음수인지 , 짝수인지 홀수인지

package c1_if;

import java.util.Scanner;

public class If5_양수음수 {

	public static void main(String args[]) {
		
		System.out.println("정수값을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0) {
			if(a%2==0) {
				System.out.println("양수이고 짝수입니다");
			}else {
				System.out.println("양수이고 홀수입니다");
			}
		}else if(a<0) {
			if(a%2==0) {
				System.out.println("음수이고 짝수입니다");
			}else {
				System.out.println("음수이고 홀수입니다");
			}
		}else {
			System.out.println("다시입력해주세요");
		}
		sc.close();
	}
	
}
