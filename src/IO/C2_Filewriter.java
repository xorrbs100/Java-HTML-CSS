package IO;

import java.io.FileWriter;
import java.io.IOException;

public class C2_Filewriter {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter(".\\file\\Cs1.txt");
			fw.write("파일에 입력.");
			fw.write('A');
			char[] buf = {'a','b','c'};
			fw.write(buf);
			fw.write(buf,1,2);
			
			System.out.println("정상출력되었습니다.");
			fw.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
