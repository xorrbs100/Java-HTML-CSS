package String;

public class String2 {

	public static void main(String[] args) {
		//String 객체 생성방법들
		String s1 = "Java Korea";//단축초기화 문자열이라고 한다 - 상수풀 이용
		String s2 = new String("Java Korea");
		String s3 = s2.intern();//intern() : 객체를 단축초기화 문자로 바궈주는 메소드.
		String s4 = "Java Korea";  //단축 초기화 문자여로 생성
		String s5 = new String("Java Korea");
		
		//==(객체주소)와 equals()(값)로 비교
		if(s1==s2) {
			System.out.println("s1과 s2은 같은장소이다");
		}else {
			System.out.println("s1과 s2는 다른장소이다");
		}
		if(s1==s4) {
			System.out.println("s1과 s4는 같은장소이다");
		}else System.out.println("s1,s4는 다르다");
		if(s2==s3) {
			System.out.println("s2와 s3는 같은장소이다");
		}else System.out.println("s2,s3는 다르다");
		if(s1.equals(s2)) {
			System.out.println("s1과 s2의 값은같다");
		}else System.out.println("s1과 s2의 값은 다르다");
		if(s2.equals(s3)){
			System.out.println("s2와 s3의 값은같다");
		}else System.out.println("s2,s3의 값은다르다");
		if(s1==s3) {
			System.out.println("s1과 s3는 같은주소이다");
		}else System.out.println("s1과 s3는 다른주소");
		if(s1.equals(s3)) System.out.println("같은값이다");
		else System.out.println("다른값이다");
	}

}
