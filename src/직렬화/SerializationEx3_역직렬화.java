package 직렬화;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx3_역직렬화 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(".\\file\\Serial3.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Parr p = (Parr)ois.readObject();
		for(int i = 0; i<p.arr.length;i++) {
			if(p.arr[i]==null) {
				break;
			}else {
				System.out.print(p.arr[i].getName());
				System.out.print(p.arr[i].getAddress());
				System.out.print(p.arr[i].getAge());
				System.out.println();
			}
			
		}


	}

}
