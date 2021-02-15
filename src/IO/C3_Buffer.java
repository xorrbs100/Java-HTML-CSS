/*
 		버퍼입출력 스트림
 			. 입력과 출력전에 버퍼를 두어서 다 채워지면 한번에 입출력하게 함으로써 컴퓨터의 호율을 높인것
 			. 내부에 버퍼를 가진다는 것뿐이고 개발자에게 보이는 형식은 동일하다.
 			
 			. FileReader ---> BufferReader ---> read();
 			
 */


package IO;

import java.io.*;

public class C3_Buffer {

	public static void main(String[] args) throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//기반스트림
		FileReader fin = new FileReader("c:\\windows\\system.ini");
		//보조스트림
		BufferedReader br= new BufferedReader(fin,20);
		//콘솔에출력
		BufferedOutputStream out = new BufferedOutputStream(System.out,20);
		//읽어오기
		int c;
		while((c=br.read())!=-1) {
			out.write((char)c);
		}
		out.flush();
		br.close();
	}

}
