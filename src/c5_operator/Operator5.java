/*
 * 논리연산자
 * and(&&)그리고,논리곱 ------참참참.....참(1)
 * 		0 0   ? 거짓
 *      0 1   ? 거짓
 *      1 0   ? 거짓
 *      1 1   ? 참
 * 
 * or(||)또는,논리합 -------거짓거짓거짓.....거짓(0)
 * * 	0 0   ? 거짓
 *      0 1   ? 참
 *      1 0   ? 참
 *      1 1   ? 참
 * not(!)아니다. 반대
 *   0-->1
 *   1-->0
 */

package c5_operator;

public class Operator5 {

	public static void main(String[] args) {
		int n1 =10;
		int n2 = 5;
		int n3 = 7;
		int n4 = 15;
		
		//and
		System.out.println(n1>n2 && n3==n4); //false
		//or
		System.out.println(n1>n2 || n3==n4); //true
		//not
		System.out.println(!true);
		
		
		
	}

}
