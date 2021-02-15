/*	직렬화와 역직렬화
 		. 객체가 생성된 후 객체의 변수값은 생명체처럼 지속변경된다.
 		. 객체가 생성된 후 어느순간 그대로 저장하거나 네트워크를 통해 어느시점의 데이터를 전송하는 것을 말한다.
 		
 		. 객체내용을 연속스트림으로 만드는 것을 말한다.
 		  이렇게 만들어야 파일에도 쓸수있고 네트워크로 전송할 수 있다.
 		. 문법구조
 			(임의의 자료구조 클래스생성)
 				. serialversionUID생성
 					
 			(출력) - 직렬화
 				1) (기반스트림) FileOutputStream으로 저장할 파일을 생성한다.
 				2) (보조스트림) ObjectOutStream으로 Object 형으로 출력시킨다.
 					  |
 				출력(저장,전송)
 					  |
 			(입력) - 역직렬화
 				  	.serivalversionUID를 확인하고 변경되었으면 에러발생
 				  1) 기반스트림 FileInputStream으로 읽어올 파일의 객체를 생성한다.
 				  2) 보조스트림 ObjectInputStream으로 object형으로 읽어오고 이때,
 				  	 데이터의 해당클래스 타입으로 형변환하여 객체를 생성활용한다. 
 */
package 직렬화;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{ //직렬화
	private static final long serialVersionUID = -604289753895036974L;	
	String name;
	String job;
	public Person() {}
	public Person(String name, String job) {
		this.job=job;this.name=name;
	}
	@Override
	public String toString() {
		return name + ","+job;
	}
}

public class SerializationEx1 {

	public static void main(String[] args) {
		Person ahn = new Person("안재용","대표이사");
		Person kim = new Person("김철수","상무이사");
		try {
		FileOutputStream fos = new FileOutputStream(".\\file\\serial1.out");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ahn);
		oos.writeObject(kim);
		}catch(IOException e) {
			e.printStackTrace();
		}

		//역직렬화
		try {
		FileInputStream fis = new FileInputStream(".\\file\\serial1.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p1= (Person)ois.readObject();
		Person p2 = (Person)ois.readObject();
		System.out.println(p1);
		System.out.println(p2);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
