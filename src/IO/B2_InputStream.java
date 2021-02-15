package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_InputStream {
	public static void main(String [] args) {
		
		try {
			FileInputStream f = new FileInputStream(".\\file\\Bs2.txt");
			InputStreamReader in = new InputStreamReader(f,"utf-8");
			int i =0;
			while((i=in.read())!=-1){
				System.out.print((char)i);
			}in.close();
			f.close();
		}
		catch(IOException e ) {
			e.printStackTrace();
		}
	}
}
