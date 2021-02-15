//임의의 숫자난수를 발생시키고 그값을 몇번만에 맞췄는지 보는 게임을 구현해 보자.

package c5_dowhile;

import java.util.Scanner;

public class D3_NumeriGame {
	public static void main (String[] args) {
		
		
		System.out.println("1~100까지의 숫자중 한가지를 입력하여 맞추세요");
		
		//랜덤값 지정
		int answer = (int)(Math.random()*100+1); //Math 클래스 안의 random 메소드 호출 random은 0<double value <1 까지의값을가져옴
		
		
		//맞추기 위해 숫자를 입력
		Scanner sc = new Scanner(System.in);
		int i=0;
		int num = 0; //입력횟수
		
		do {
			 i = sc.nextInt();
			 if(answer==i) {
				 System.out.println(num +"번에 맞추셨습니다.");
				 break;
			 }else if(answer>i) {
				 System.out.println("더 큰수를 입력하세요");
			 }else {
				 System.out.println("더 작은수를 입력하세요");
			 }
		 num++;
		}while(true);
		sc.close();
		
		
		
		System.out.println("정답은 "+i+"입력횟수는 "+num+"번입니다");
		
	}

}
