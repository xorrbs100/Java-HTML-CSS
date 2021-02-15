package C3_Print;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String args[]) {
		System.out.println("이름,도시,나이,체중을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		
		System.out.println(city+"에 거주하는"+name+"씨의 나이는"+age+"세" +weight +"kg 입니다");
	
		sc.close();
		
	}
}
