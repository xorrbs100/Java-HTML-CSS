// 두사람이 엔터키를 치면 초만 읽어온다 각각의 엔터를친 초시간이 10초간격에 근접한 사람이 Winner
package 연습;

import java.util.Calendar;
import java.util.Scanner;

public class Ex2 {

	public static int printCalender(Calendar cal) {
		int sec = cal.get(Calendar.SECOND);
		 return sec;
	
	}
	
	public static void main(String [] args) {
		int s1;
		int s2;
		int i1;
		int i2;
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		Calendar player1 = Calendar.getInstance();
		int sec1=printCalender(player1);
		System.out.println("플레이어1 의 초값  : "+sec1);
		a = sc.nextLine();
		Calendar player2 = Calendar.getInstance();
		int sec2=printCalender(player2);
		System.out.println("플레이어2 의 초값 : "+sec2);
		s1=sec1%10;
		s2=sec2%10;	
		i1=s1-5;
		i2=s2-5;
		
		if(s1==s2){
			System.out.println("비겼습니다");
		}
		
		if(s1==5) { //나머지값이 5일때
			if(s2==5) {
				System.out.println("비겼습니다");
			}
			else { System.out.println("플레이어2승");}
		}
		if(s1>5) {  	//나머지값이 5이상일때
			
			if(s2==5) {
				System.out.println("플레이어1승");
			}
			if(s2>5) {
				
				if(i1>i2) {
					System.out.println("플레이어1승"); 
				}
				else  if(i1<i2)	 {
					System.out.println("플레이어2승");
				}
				
			}
			if(s2<5) {
				if(i1<s2) {
					System.out.println("플레이어1 승");
				}else if(i1==s2)System.out.println("비겼습니다");
				else System.out.println("플레이어2 승");
			}
		}
		if(s1<5) {
			if(s2==5) {
				System.out.println("플레이어 1 승");
			}
			if(s2>5) {
				if(s1>i2) {
					System.out.println("플레이어 2 승");
				}else System.out.println("플레이어 1 승");
			}
			if (s2<5) {
				if(s1<s2) {
					System.out.println("플레이어 1 승");
				}else if(s1==s2)System.out.println("비겼습니다");
				else if (s1>s2)System.out.println("플레이어 2승");
			}
		}
			
		
	sc.close();	
	}
}