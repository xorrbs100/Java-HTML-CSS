package C3_Print;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String args[]) {
		//안내문구를띄운다
		System.out.println("이름과 나이 몸무게를 공란으로 구분해서 입력해주세요");
		
		//스캐너를가져온다
		Scanner sc= new Scanner(System.in);
		
		//스캐너활용
		String name = sc.next();  //문자
		int age = sc.nextInt(); //정수
		double weight = sc.nextDouble(); //실수
		System.out.println(name+"씨의 나이는"+age+"세 이고");
		System.out.printf("몸무게는 %.1fkg 입니다\n", weight);
		//스캐너닫기
		sc.close();
	}
}
