/*
 * break문을 만나면 반복문 종료
 * 
 */

package c6_continuebreak;

public class Break1 {

	public static void main(String[] args) {
	
		int num = 0, sum =0;
		while(true) {
			num++;
			sum+=num;
			if(num==20) {
				break; //해당 반복문을 빠져나온다.
			}
		}
		System.out.println("1~"+num+"까지의합계 : "+sum);

	}

}
