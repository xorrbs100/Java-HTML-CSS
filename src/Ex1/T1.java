package Ex1;

import java.util.Scanner;

public class T1 {

	public static void main(String args[]) {
		System.out.println("배열의 크기를 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		int ac = sc.nextInt();
		String [] arr = new String[ac];
		
		System.out.println("정수 "+ac+"개를 입력해 주세요");
		
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		for(String k : arr) {		//출력폼에서도되네
			if(Integer.parseInt(k)%3==0) {
				System.out.println(k);
			}else {
				continue;
			}
		}
		sc.close();
	}
}
