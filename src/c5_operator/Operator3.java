package c5_operator;

import java.util.Scanner;

public class Operator3 {

	public static void main(String[] args) {
		int time;
		int second;
		int minute;
		int hour;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계산할 시간을 초단위로 입력해주세요>>");
		
		time =sc.nextInt();
		second=time%60;			//초
		minute=(time/60) %60;   //분
		hour = (time/60)/60;   //시간
		
		System.out.printf("당신이 입력한 시간은 %d시 %d분 %d초 입니다", hour,minute,second);
		sc.close();
		
	}

}
