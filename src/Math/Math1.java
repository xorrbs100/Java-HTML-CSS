/*
 		Math 클래스
 			. java.lang 패키지에 포함
 			. 기본적인 산술연산을 수행해주는 메소드를 제공한다.
 			. 모든 멤버메소드들이 static으로 정의되어 있어서 객체를 생성할 필요없다.
 			. 정수와 실수타입의 메소드를 제공하는 대부분 실수연산으로 double타입이 사용된다.
 			
 			. 주요메소드
 				- abs(): 절대값
 				- ceil():올림		3.1 ----> 4
 				- floor():내림
 				- max(a,b):최대값
 				- min(a,b):최소값
 				- random():0~1사이 작은 임의의 실수값 반환
 				- round():반올림  3.1 ---->3
 
 */

package Math;

public class Math1 {

	public static void main(String []args) {
		//난수기본
		//for(int x =0;x<10;x++) {
		//	double num = Math.random()*100;//0<num<100실수발생 
		//	int n = (int)(Math.round(num)); //반올림
		//	System.out.print(n+" ");
			
		//}
		//로또 번호안겹치게해보기
		for(int i=0;i<6;i++) {
			double num = Math.random()*47;
			int n =(int)(Math.round(num));
			System.out.print(n+" ");
		}
	}
}
