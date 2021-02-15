/*
 * Do While문
 * 	. 먼저 실행하고 뒤에서 비교해서 조건에 맞으면 또 실행
 *  . 문법
 *  	do{
 *  		실행문;
 *  }while(조건식)
 */


package c5_dowhile;

public class D1_Sumto10 {

	public static void main(String[] args) {
		
		int sum = 0, i=1;
		
		do { 
			sum+=i;
			i++;
		}while(i<=10);
		
		System.out.println("10까지 합계: "+sum);
	}

}
