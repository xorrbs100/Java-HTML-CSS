/*
 * 전위증감연산자, 후위증감연산자
 */



package c5_operator;

public class Operator2 {
	public static void main(String args[]) {
		int a = 5;
		int b = 2;
		
		int sum= a+b;
		System.out.println("a+b="+sum);
		//빼기
		int min= a-b;
		System.out.println("a-b="+min);
		//곱하기
		int c=a*b;
		System.out.println("a*b="+c);
		//나누기
		double d=a/(double)b;	
		System.out.println("a/b="+d);
		//나머지
		int e=a%b;
		System.out.println("a%b="+e);
		//전위증감연산자(++a , --a)
		//현재a값은5
		int c1=++a; // c = a+1
		System.out.println("전위증감연산자 c1의값은 몇일까요?:"+c1);
		System.out.println("현재 a의 값은 ?"+a);
		//현재a값은6
		int c2=a++;// c=a, c=a+1
		System.out.println("후위증감연산자 c2의 값은 몇일까요?:"+c2);
		System.out.println("현재 a의 값은?"+a);
		
		//현재b는 2
		//c=++b = 3 c=b++=2
	}
}
