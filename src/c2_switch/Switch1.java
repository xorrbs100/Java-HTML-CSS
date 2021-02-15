/*
 * Switch문
 * 	-if 문보다 깔끔지만 확장성은 if문이 더 넓다
 * 	-문법
 * 		switch(변수명){
 * 			case 변수:  		
 * 				실행문;
 * 			case 변수:
 * 				실행문;
 * 			default:
 * 				실행문;		
 * }
 */
package c2_switch;

import java.util.Scanner;

public class Switch1 {

	public static void main(String args[]) {
		System.out.println("시작할 번호를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("L");
		break;
		case 2 : System.out.println("O");
		break;
		case 3 : System.out.println("V");
		break;
		case 4 : System.out.println("E");
		break;
		case 5 : System.out.println("F");
		break;
		case 6 : System.out.println("O");
		break;
		case 7 : System.out.println("R");
		break;
		case 8 : System.out.println("E");
		case 9 : System.out.println("V");
		case 10 : System.out.println("E");
		case 11 : System.out.println("R");
		
		
		
		}
		
	}
}
