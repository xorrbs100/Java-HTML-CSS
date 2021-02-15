/* 향후 학습에 활용하기 위해서 Scanner를 우선 학습해봄
 * 콘솔창으로 값을 입력받아서 내부에서 처리하기 위함.
 * 활용순서를 익혀주고, 사용절차를 자꾸 반복해서 따라해볼것.
 * 
 */


package C3_Print;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String args[]) {
		//1. 안내문구를 띄운다
		System.out.println("이름을 입력해주십시오>>");
		
		//2. 스캐너를 가져온다
		Scanner sc = new Scanner(System.in); 
		
		//3. 스캐너로 입력받은 값을 활용한다
		String str = sc.next(); //데이터 타입 : 문자는 char 문자열은 String
		System.out.println("입력받은 이름은 "+str+" 입니다");
		
		//4. 스캐너를 닫아준다.
		sc.close();
		
	}

}
