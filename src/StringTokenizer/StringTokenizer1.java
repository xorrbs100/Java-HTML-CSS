/*
 	StringTokenizer클래스
 		- 문자열분리
 		- String split()메소드와 동일기능
 		- 구분문자(delimiter)라고 부름
 		- 토큰 (token)은 분리된 문자열을 말한다.
 		
 		- 포함된 메소드
 		 	. contTkoens():몇개의 토큰으로 분리되어 있는지 카운트해준다.
 		 	. nextToken():토큰을 하나씩 읽어내기 위해 다음 토큰을 반환해 준다.
 		 	. hasMoreTokens():스트링 토큰나이저에 포함된 토큰의 개수를 반환해 준다.
 */

package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {
		String query = "name = korea&address =seoul&age=21";
		StringTokenizer st = new StringTokenizer(query,"&");
		
		int a = st.countTokens();
		System.out.println(a);
		for(int i=0;i<a;i++) {
		//	String tok = st.nextToken();
			System.out.println(st.nextToken());
			
		}
	}

}
