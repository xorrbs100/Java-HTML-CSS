/*
 	  Reader				Writer
 		|					   |
 	InputStreamreader		OutputStreamReader
 	FileReader				FileWriter <가장많이사용>
 	
 	BufferReader			Bufferwriter
 	FilterReader			FilterWriter
 	CharArrayReader			CharArrayWriter
 	PipedReader				PipedWriter
 	StringReader			StringWriter
 */

package IO;

import java.io.FileReader;
import java.io.IOException;

public class C1_FileReader {

	public static void main(String[] args) {
		try {
			FileReader in = new FileReader("c:\\windows\\system.ini");
			int c;
			while((c=in.read())!=-1) {
				System.out.print((char)c);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
