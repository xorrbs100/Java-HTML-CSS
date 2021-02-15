//Enter = Cr+Lf
//		  13 10
//		  \r \n
package IO;

import java.io.IOException;

public class IO2_StandardIO {

	public static void main(String[] args) {
		System.out.println("알파벳을 여러개 쓰고 [Enter]를 누르세요>>");
		int i;
		try {
			while((i=System.in.read()) !=-1) {
				System.out.print((char)i);
			}
		}catch(IOException e ){
			e.printStackTrace();
		}
	}
}