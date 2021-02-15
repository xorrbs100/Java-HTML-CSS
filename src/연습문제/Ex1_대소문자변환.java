package 연습문제;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1_대소문자변환 {

	public static void main(String[] args) {
		
		System.out.println("대소문자 변환을 위한 영문자를 입력해 주세요>>");
		
		InputStreamReader rd = new InputStreamReader(System.in);
		
		int a;
		
		while(true) {
			try {
				//실행문
				a=rd.read();
				if(a==-1) { //ctrl+z가 입력되면 read()메소드는 -1값을 리턴해 준다.
					break;
				}else if(a=='\n' || a=='\r') {//Enter키를 치면 \n \r
					continue;
				}
				if(a>='a'&& a<='z') { // 소문자면
					a=a-('a'-'A'); //대문자로 변환  a=a-('a'-'A') : 65-(65-97) = 97
				}else if (a>='A'&& a<='Z') {//대문자면
					a=a+('a'-'A');   //소문자로 변환 a=a+('a'+'A') : 97+(65-97) = 65
				}else {
					System.out.println("영문자가 아닙니다");
					continue;
				}
				//위에서 받은 아스키코드값을 문자로 형변환해서 출력
				System.out.println((char)a);
			}catch(IOException e) {
				//에러났을때 처리할 문장
				System.out.println("입력 에러 발생");
			}
		}
			
	}

}
