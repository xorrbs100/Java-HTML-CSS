/*
 * 사칙연산 
 *  
 */



package c5_operator;

import java.util.Scanner;

public class Operator1 {

	public static void main(String[] args) {
		System.out.println("숫자값 2개를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int result;
		
		System.out.println("더하기:"+(n1+n2));
		System.out.println("빼기 :"+(n1-n2));
		System.out.println("곱하기 :"+(n1*n2));
		System.out.println("나누기: "+ (n1/n2)); //형변환필요
		System.out.println("나누기나머지값 : "+(n1%n2)); 
		
		sc.close();


	}

}
