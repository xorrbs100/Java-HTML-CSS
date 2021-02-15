package IO;

import java.io.*;
import java.util.Scanner;

public class IO3_Standard {

	public static void main(String[] args) {
		try {
			//파일을 바이트 단위로 읽은 객체생성 - 원본에 공백이 있으면 그 다음은 못 읽는다.
			FileInputStream fio = new FileInputStream(".\\file\\StandardIO1.txt");
			Scanner sc = new Scanner(fio);
			String str = sc.next();
			System.out.println(str);
		}catch(IOException e ) {
			e.printStackTrace();
		}
		
	}

}
