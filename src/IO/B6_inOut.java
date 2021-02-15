package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class B6_inOut {

	public static void main(String[] args) {
		try {
			//데이터를 저장 : file/Bs7.txt
			FileOutputStream fos = new FileOutputStream(".\\file\\Bs7.txt");
			//10,9,8,7,6,5,4,3,2,1
			for(int i =10; i>0;i--) {
				fos.write(i);
			}
			fos.close();
			//------------------------------
			//데이터 읽어오기
			FileInputStream fis = new FileInputStream(".\\file\\Bs7.txt");
			int a;
			while((a=fis.read())!=-1) {
				System.out.print(a);
			}
					fis.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
