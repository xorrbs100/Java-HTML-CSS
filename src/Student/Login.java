package Student;

import java.util.Scanner;


public class Login {
	final String stid = "홍길동";
	final String stPw = "0000";
	boolean loginBool;
	int num=0;
	Scanner sc = new Scanner(System.in);
	public boolean BooleanloginCheck() {
		while(true) {
			System.out.println("로그인 정보를 입력해주세요");
			String id=sc.next();
			String pw = sc.next();
			if(stid.equals(id)&&stPw.equals(pw)) {
			System.out.println("로그인 되었습니다.");return loginBool=true;
			} 
			
			num++;
			
			if(num==3) {
				return loginBool=false;
			}
			System.out.println("로그인 "+(num)+"회 오류입니다"+" 다시 입력해 주세요"); 
		}
		
	}

}
