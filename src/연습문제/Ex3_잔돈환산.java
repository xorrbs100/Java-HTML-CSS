package 연습문제;

import java.util.Scanner;

public class Ex3_잔돈환산 {

	public static void main(String[] args) {
		//환산단위 선언 final이 붙으면 프로그램 실행중에 값을 변경할 수 없다
		final int 오만원 = 50000;
		final int 만원 = 10000;
		final int 천원 = 1000;
		final int 오백원 = 500;
		final int 백원 = 100;
		final int 오십원 = 50;
		final int 십원 = 10;
		final int 일원 = 1;
		//스캐너 입력
		System.out.println("금액을 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		int 입금액 = sc.nextInt();
		
		//계산 알고리즘
		int 몫_매수 = 입금액/오만원; // 64,215/50000 =1
		입금액 = 입금액%오만원; // 이제 입금액은 14,215
		if(몫_매수>0) {
			System.out.println("오만원권 "+몫_매수+"매");
			
		}
		//----------------------------------------
		몫_매수=입금액/만원;
		입금액 = 입금액%만원;
		if(몫_매수>0) {
			System.out.println("만원권"+몫_매수+"매");
		}
		몫_매수=입금액/천원;
		입금액 = 입금액%천원;
		if(몫_매수>0) {
			System.out.println("천원권"+몫_매수+"매");
		}
		몫_매수=입금액/오백원;
		입금액 = 입금액%오백원;
		if(몫_매수>0) {
			System.out.println("오백원"+몫_매수+"매");
		}
		몫_매수=입금액/백원;
		입금액 = 입금액%백원;
		if(몫_매수>0) {
			System.out.println("백원"+몫_매수+"매");
		}
		sc.close();
	}


}
