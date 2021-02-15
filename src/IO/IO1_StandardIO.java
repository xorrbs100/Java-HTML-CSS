/*1. 스트림이란 ?
		-입력과 출력의 장치가 너무 각기 다양하므로 이런 장치에 무관하게 프로그램을 구현하도록
		만들어 놓은 가상통로인 스트림을 제공한다.
		- 이 가상통로가 다양한 입력과 출력을 표준화하여 호환성을 갖도록 해 준다.
		- 자바에서는 모든 입출력 기능에 대해 Stream클래스를 제공한다.
		- 스트림 특징
			. 단방향이다.
			. 선입선출이 된다.
			. 기본단위는 1바이트 단위이다. 단, 문자가 가장 많기 때문에 문자 스트림을 별도로 제공하고 있다.
			. 스트림의 양 끝에는 입출력 장치와 자바 응용프로그램이 연결되어 있다.
				입력-----> 자바응용프로그램 ----->출력
  2. 스트림의 종류
  	- 다양한 스트림이 존재하므로 3가지 분류로 나누어 학습해 보자.
  	
  	1) 입력이나 출력이냐? - 입출력 스트림
  	 	- 클래스 이름에
  	 		.Input 또는 Reader : 입력스트림
  	 		.Output 또는 Writer : 출력스트림
  	2) 바이트단위냐 문자단위냐
  		- 자바는 기본적으로 1바이트(8비트)씩 읽는다. - 사진, 동영상, 그림
  		- 문자(char) 는 2바이트인데 1바이트씩 읽으면 에러가 나므로 특별하게 문자스트림을 별도로 제공한다.
  		- 클래스 이름에
  			. 바이스트림 : ~~~Stram
  			. 문자스트림 : ~~Reader, ~~Writer
  	3) 직접 읽고 쓰도록 지원하는 스트림이냐 ? 직접 쓰지 못하고 보조용으로 쓰는 스트림이냐?
  		-보조 스트림은 직접 읽고 쓰기기능이 없고, 항상 다른 스트림음 포함하여 생성한다.
  		- 클래스 이름에
  	 	. File : 기반스트림
  	 	. 그외   : 보조스트림
  예) FileInputStream  ---- > File(기반), Input(입력), Stream(바이트)로 해석
  	(p514)
  		스트림        			입력/출력		바이트/문자		기반/보조
  		------------------------------------------------------
  		FileReader			입력			문자				기반
  		FileOutputStream	출력			바이트			기반
  		BufferedReader		입력			입력				보조
 3. 자바의 입출력
 		: 자바의 입출력 실행문은 반드시 예외처리를 해주어야 한다.
 		.FileNotFoundException : 파일을 찾지 못함
 		.IOException : 입출력시 에러
 		.ClassNotFoundException : 클래스를 찾지못함 등등
 4. 표준입출력
 	:자바에서 미리 정해둔 입출력으로 프로그램이 실행될때 생성되어 우리가 객체를 만들 필요가 없다.
 	: 콘솔로 입출력을 받은것을 말한다.
 		class System{
 		static PrintStram out ; //표준 출력스트림 (1바이트단위)
 		static InputStream in ; //표준 입력 스트림 (1바이트단위)
 		static OutputStream err; //표준 오류출력 스트림(1바이트단위)
 		}
 		
*/

package IO;

import java.io.IOException;

public class IO1_StandardIO {

	public static void main(String[] args) {
		System.out.println("숫자1 , 영어A, 한글'가'를 차례로 입력하세요>>>");
		
		int i;
		//입출력은 반드시 예외처리를 해주어야한다
		try {
			i = System.in.read(); //0~255까지의 아스키코드 정수값을 반환해준다. 마지막은 -1 값반환
			System.out.println(i);
			System.out.println((char)i);
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
