package 직렬화;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parr implements Serializable{// 도면을 담을배열

	private static final long serialVersionUID = -2261449786581744847L;
	Person2[] arr;
	Parr(){
		arr=new Person2 [5];
	}
	
}
//자료구조 도면클래스
class Person2 implements Serializable{
	private static final long serialVersionUID = 886966506812795403L;
	private String name;
	private String age;
	private String address;
	public Person2() {}
	
	public Person2(String name , String age , String address) {
	this.name= name;this.age=age;this.address=address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}

public class SerializationEx3 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Person2 p1 = new Person2();
		p1.setName("홍길동");p1.setAge("20");p1.setAddress("서울시");
		Person2 p2 = new Person2("강감찬","30","서울시");
		Person2 p3 = new Person2("슈퍼맨","25","워싱턴");
		Person2 p4 = new Person2("배트맨","25","런던");
		
		//배열에 저장
		Parr pa = new Parr() ; //Person2를 저장하는 배열5개 생성
		pa.arr [0]=p1;
		pa.arr[1]=p2;
		pa.arr[2]=p3;
		pa.arr[3]=new Person2 ("스파이더맨","23","뉴욕");
		pa.arr[4]=p4;
		//직렬화
		
		FileOutputStream fos = new FileOutputStream(".\\file\\Serial3.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(pa);
		System.out.println("저장되었습니다");
		
	}

}
