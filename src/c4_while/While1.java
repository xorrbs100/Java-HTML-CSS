/*
 * while문
 * 	.참일 동안만 실행
 * 	. 시작할때 참의 조건으로 시작
 * 	. while 문 안에서 거짓의 조건을 만들어서 반족을 중지시킨다
 */

package c4_while;

public class While1 {

	public static void main (String[] args) {
		
		int sum=0 ,i=1;
		
		
		while(i<=10) {
			
			sum+=i;
			System.out.println(i+"까지의합은"+sum+"입니다");
			i++;
		}
		
		System.out.println("10까지의합은"+sum);
		
	}
}
