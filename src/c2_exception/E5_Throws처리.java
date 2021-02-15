// try~catch : 예외가 발생한 메소드에서 그예외를 바로 처리
// throws    : 예외처리를 미루면서 그메소드를 호출하여 사용하는 부분에서 처리

package c2_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E5_Throws처리 {

	public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
		
		
		FileInputStream fis = new FileInputStream("./file/a.txt");
		
		int c;
		while((c=fis.read()) !=-1) {
			System.out.print((char)c);
		}
		fis.close();
		
		}
	

	}


