/* 책80P. 복합대입연산자
 * 
 * 		. =와 결합된 연산자
 * 			a+=1--->a=a+1
 * 			a*=1--->a=a*1
 * 			a/=1--->a=a/1
 * 			a%=1--->a=a%1
 * 
 */



package c5_operator;

public class Operator6 {

	public static void main(String args[]) {
		//증감연산자
		
		int num = 10;
		num = num+1;
		System.out.println(num);
		
		num += 1; 
		System.out.println(num);
		
		num *=3;
		System.out.println(num);
		
		num/=2;
		System.out.println(num);
		
		num%=2;
		System.out.println(num);
		
	}
}
