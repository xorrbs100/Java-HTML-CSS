package c2_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E4_FileNotFoundException {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("./file/a.txt");
		
		int c;
		while((c=fis.read()) !=-1) {
			System.out.print((char)c);
		}
		fis.close();
		}catch(FileNotFoundException e1) {
			System.out.println("찾는 파일이 없습니다");
		}catch(IOException e2) {
			System.out.println("파일내용이 없거나 입출력오류가 발생하였습니다.");
		}
		
	}

}
