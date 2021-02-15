package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class B3_InputStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("c:\\Windows\\system.ini");
			int i;
			while((i=fis.read())!=-1) {
				
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
