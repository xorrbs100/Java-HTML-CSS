/* 정수가아닌 문자열을 정수로 변환할때
 * 실수가 아닌 문자열을 실수로 변환할때
 * 
 * 			정수문자 --> 정수 : Integer.parseInt("정수문자")
 * 			실수문자 --> 실수 : Float.parseFloat("실수문자")
 * 							Double.parseDouble("실수문자")
 * 			정수숫자--> 문자 : Integer.toString("정수숫자")
 * 			실수숫자--> 문자 : Float.toString("실수숫자")
 * 						   
 */

package c2_exception;

public class E3_NumberFormatException {

	public static void main(String[] args) {
		
		//문자열을 저장하는 배열
		String strNum [] = {"23", "12", "998", "3.141592"};
		
		
		try {
			for(int i=0; i<strNum.length;i++) {
			
			//배열에 있는 문자를 정수타입으로 변환해서 j로 선언
			
			int j =Integer.parseInt(strNum[i]);
			
			System.out.println("숫자로 변환된 값은: "+j);
		}
		
			
		}catch(NumberFormatException e) {
			
			System.out.println("배열에 정수가 아닌값이 들어있습니다");
		}

	}

}
