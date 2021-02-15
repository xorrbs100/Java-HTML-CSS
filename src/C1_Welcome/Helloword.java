package C1_Welcome;

public class Helloword {
	public static void main(String arg[]) { //jvm은 main 메소드를 찾아서 거기부터 실행한다. main 메소드는 반드시 public static void로 선언되어야 한다.
		System.out.println("Helloword"); //sysout : java에서 제공하는 시스템관련 클래스 .(Dot): 오른쪽에서 왼쪽으로 접근시키는 접근연산자 
										//println() 화면에 자동줄바꿈(개행)이 되는 출력메소드
										//print(): 줄바꿈이 되지않는다.
										//printf("%s %c %d %f,) : 문자형식을 지정해서 출력해라는 메소드(줄바꿈 안됨)
		System.out.println(10+20+30); // +는 숫자는 연산으르 문자는 결합처리를 해준다
		System.out.print("10+20+30");//"는 문자열로 취급
		System.out.println("오늘은"+"태풍이 온다고 합니다."); //문자는 결합
		System.out.printf("%s의 학점은 %c이고 점수는 %d입니다","국어",'A',90); //%s 문자열" ,%c 문자' ,%d 정수, %f 실수
	}
}
