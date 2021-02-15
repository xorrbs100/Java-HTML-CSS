package 연습문제;

import java.util.Scanner;

public class Ex5_삼각형가능 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세변의 길이 값을 입력해주세요");
		int 길이1 =sc.nextInt();
		int 길이2 =sc.nextInt();
		int 길이3 =sc.nextInt();
		
		if((길이1+길이2)<길이3||(길이1+길이3)<길이2||(길이2+길이3)<길이1){
			System.out.println("삼각형이 될 수 없습니다");
			
		}else {
			System.out.println("삼각형이 될 수 있습니다");
		}
		

	}

}
