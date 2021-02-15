/*
    정해진 에외를 사용하는 것이 아니라 내가 직접 만들어서 사용하는 방법
    
    -문법
    	1. 먼저 Exception 클래스를 상속받아서 내 예외 클래스를 만들어 놓는다.
    	간단하게 메세지를 받아서 super(부모) 생성자에 메시지를 전달한다.
    	2. 메인 클래스에서 필요한 곳에서 강제로 예외처리를 시킨다.
    		1) 먼저 throws 만들어놓은 예외클래스 처리
    		2) 강제로 예외처리 : throws new 만들어놓은 예외클래스(문구)
    
 */

package c2_exception;

import java.util.Scanner;

//1. 직접 만등러 놓는 사용자 정의예외

class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}
//2. 현재 클래스 속에서 위에 만들어 놓은 예외처리 클래스를 활용
public class E6_IDFormatTest {
	
	//멤버변수
	private String userID;
	
	//userID값을 가져오는 메소드
	public String getUserID() {
		return userID;
	}
	
	//userID를 설정하는 메소드
	public void setUserID(String userID)throws MyException { //1. 사용할 예외처리클래스를 throws처리해놓고 
		//만약, userID값을 입력하지 않았을 경우, 강제로 예외를 발생시킨다.
		if(userID==null) {
			throw new MyException("아이디는 null일 수 없습니다"); //2. throw new로 예외클래스(내용) 처리한다.
			
		}else if(userID.length()<8||userID.length()>20) {
			throw new MyException("아이디는 8자 이상 20자 이하로 만들어 주세요");
		}
		this.userID=userID;			
	}
	
	//실행메소드
	public static void main(String[] args)  {
		//객체생성 - 클래스가져다 사용
		E6_IDFormatTest test = new E6_IDFormatTest();
		System.out.println("ID를 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		String userID = sc.next();
		
		try {
			test.setUserID(userID);
			System.out.println("아이디가 정상적으로 입력되었습니다.");
			
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}









