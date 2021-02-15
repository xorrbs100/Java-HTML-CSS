package c2_switch;

import java.util.Scanner;

public class Switch3 {

	public static void main(String args[]) {
		//월을 입력받는다.
		System.out.println("월을 입력해주세요");
		
		Scanner sc = new Scanner(System.in);
		String season = "";
		int month = sc.nextInt();
		
		//계절을 출력한다
		switch(month) {
		case 1 : 
		case 2 : case 12: season = "겨울";break;
		case 3 : case 4 : case 5 : season = "봄";break;
		case 6: case 7: case 8: case 9 : season = "여름";break;
		case 10: case 11: season = "가을"; break;
		 
		default : season = "다시입력해주세요";
		}
		System.out.println("계절은 "+season+"입니다");
		sc .close();
	}
}
