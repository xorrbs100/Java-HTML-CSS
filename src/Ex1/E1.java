package Ex1;

import java.util.Scanner;

public class E1 {
	
	public static void main(String args[]) {
		String a[] = new String[10];
		int b[] = new int[a.length];
		Scanner sc = new Scanner(System.in);	
		String str;
		int i =0;
		System.out.println("문자열 정수 10개를 입력하세요");
		while(i<a.length) {
			str = sc.next();
			a[i]=str;
			i++;
			
		}
		sc.close();
		
		for(int j=0;j<a.length;j++){
			b[j]=Integer.parseInt(a[j]);
				
				if(((b[j]%3)==0)) {
				System.out.println(b[j]+"는 3의 배수입니다.");
				}
			
		}
	}
	
}

