package Ex2;

import java.util.Scanner;

public class GuGudanEx {

	public static void main (String []args) {
		int a;
		int b;
		System.out.println("단과 수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		GuGuDan gu = new GuGuDan();
		
		gu.multiplication(a,b);
	}
}
