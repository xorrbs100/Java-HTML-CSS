package c1_array;

import java.util.Scanner;

public class Array9_스캐너와배열 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 방의 크기를 입력해 주세요");
		
		int size =0;
		//예외
		try {
			//실행문
			size = sc.nextInt();
			
		}catch(Exception e){
			System.out.println("배열방의 크기를 잘못 입력하셨습니다");
			sc.close();
			System.exit(0);
		}
		//배열생성
		String [] arr=new String[size];
		String str;
		int i =0;
		System.out.println("저장할 이름을 입력해 주세요");
		while(i<size) {
			str = sc.next();
			
			if(str.equals("q")) break;
			arr[i]=str;
			i++;
			if(i==(size-1)) System.out.println("마지막 하나 남았습니다");
			
		}
		sc.close();
		System.out.println("저장된 이름은 ...");
		for(String k:arr) {
			System.out.println(k+" ");
		}

	}

}
