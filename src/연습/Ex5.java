//컴퓨터와 철수가 가위바위보 게임을하는 프로그램 가위1 바위2 보 3 끝내기 4


package 연습;


import java.util.Random;
import java.util.Scanner;

public class Ex5 {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		Random b = new Random();
		
		while(true) {			
			int r = b.nextInt(3)+1;
			System.out.println("가위바위보를 입력해 주세요 ");		
			System.out.println("1 가위 2 바위 3보 종료 4");
			int a = sc.nextInt();
			if(a==4) {
				System.out.println("종료합니다");
				break;
			}
			System.out.println("컴퓨터의 값 : "+(int) r);
			if(a==1) {
				//가위에 대한 가위바위보 결과
				if(a==r) {
					System.out.println("비겼습니다");
				}else if(r==2) {
					System.out.println("패");
				}else System.out.println("승");
			}
			if(a==2) { //입력값 바위
				if(a==r){
					System.out.println("비겼습니다");
				}else if (r==3) {
					System.out.println("패");
				}else System.out.println("승");
			}
			if(a==3) {//입력값 보
				if(a==r) {
					System.out.println("비겼습니다");
				}else if (r==1) {System.out.println("패");
				}
				else {System.out.println("승");}
			}
		}
	
	sc.close();
	}
}

