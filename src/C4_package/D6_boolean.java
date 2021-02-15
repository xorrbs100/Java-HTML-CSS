package C4_package;

import java.util.Scanner;

public class D6_boolean {

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = 10>20;
		System.out.println(a);
		System.out.println(b);
	
		boolean c = a;
		System.out.println(c);
		
		System.out.println("액셀레이터의 조건값을 입력해주세요");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		//예제
		boolean stop = i<j;
		if(stop) {
			System.out.println("자동차를 멈춥니다");
		}else {
			System.out.println("계속진행합니다");
		}
		sc.close();
	}

}
