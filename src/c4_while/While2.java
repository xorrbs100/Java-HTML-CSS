//외부에서 입력받은 숫자들의 평균

package c4_while;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		//스캐너로 반복 입력받기		
		System.out.println("숫자를 입력하세요 중단은0");
		Scanner sc = new Scanner(System.in);
		
		int n=0,i=0;
		double sum=0;
		while((i=sc.nextInt()) !=0) {
			
			sum +=i;
			n++;
		}
		System.out.println("입력된 수의 개수는"+n+"개이며 평균은"+(sum/(float)n)+"입니다");
	}
}
