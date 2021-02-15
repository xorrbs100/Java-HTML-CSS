/*		
 	StringBuffer :String클래스의 블변문제를 개선 --> 스레드 동시요청시 안전한 변경보장, 속도는 상대적 느림 
 	
 		.메소드
 			append(String str)	: str스트링을 스트링 버퍼에 덧붙인다.
 			capaciity()			: 스트링버퍼의 현재 크기를 정수값으로 리턴해준다.
 			delete(int start, int end): start위치에서 end위치앞까지 문자삭제
 			insert(int offsett, String str):str을 offset 위치에 삽입시킨다.
 			reverse() 			: 문자열을 반대로 순서변경해준다.
 			void setLength(int newLength): 스트링버퍼 내 문자열의 길이를 새롭게 재 설정한다. 			
 */




package StringBuffer;

public class StringBuffer1 {

	public static void main(String[] args) {
	
		//1. 객체생성
		StringBuffer sb1 = new StringBuffer("Hellow Java");
		StringBuffer sb2 = new StringBuffer("처음 시작하는 자바");
		System.out.println(sb1);
		System.out.println(sb1.length());
		//메소드호출
		System.out.println("버퍼를 포함한 길이 : "+sb1.capacity());
		System.out.println(sb2.length());
		System.out.println("버퍼를 포함한 길이 : "+sb2.capacity());
		
		//insert
		
		System.out.println(sb1.insert(11, "c"));
		//charAt()
		System.out.println("8번째 문자추출 : "+sb1.charAt(8));
		//setCharAt
		sb2.setCharAt(5, '되');
		System.out.println("5번째의 값을 \'되\' 로 변경"+sb2);
		//setLength()
		sb2.setLength(5);
		System.out.println("문자열을 5까지만 고정시킨 새로운 값"+sb2);
		//reverse()
		System.out.println("문자열의 역순으로 출력하기"+sb2.reverse());
		System.out.println(sb1.reverse());
		sb1.setCharAt(5, 'a');
		System.out.println(sb1);
		System.out.println(sb1.reverse());
	}

}
