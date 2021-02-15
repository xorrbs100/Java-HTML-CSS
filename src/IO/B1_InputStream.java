/*
 		바이트 단위 스트림
 			. InputStream 클래스	-읽어오기, 바이트단위
 			. OutputStream 클래스	-출력하기, 바이트단위
 			
 			메소드 : int read() : 입력스트림으로부터 1바이트씩 읽고 읽은 자료의 바이트수를 반환한다.
 				  void close() : 입출력 스트림과 연결된 대상 리소스르 닫는다.
 				  
 			하위클래스
 				-FileInputStream	: 파일에서 바이트 단위로 자료를 읽어오는 클래스
 				-FileOutputStream	: 파일에서 바이트 단위로 자료를 출력해주는 클래스
 */

package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_InputStream {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(".\\file\\Bs1.txt");
			//utf-8을 표현한값 239 187 191
			//반복문을통한활용-한글깨짐
			/*int i;
			while((i=fis.read() )!=-1) {
				System.out.print((char)i);}*/
			//utf-8을 설정해서 출력 - 한글안깨짐
			InputStreamReader in = new InputStreamReader(fis,"utf-8");
			int i;
			while((i=in.read())!=-1) {
				System.out.print((char)i);
			}
			in.close();
			fis.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
