package 직렬화;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Goods implements Serializable{

	private static final long serialVersionUID = 7612199802295877831L;

	String item;
	int price;
	String shop;
	
	Goods(){}
	Goods(String item, int price, String shop){
		this.item = item; this.price = price ; this.shop=shop;
	}
	@Override
	public String toString () {
		return "상품명: " +item +", 가격 : "+price+", 제조사 : "+shop;
	}
}

public class SerializationEx2 {

	public static void main(String[] args)  {
		//제품명 제품가격 제조사를 입력
		Goods gs1 = new Goods("컴퓨터",100,"삼성");
		Goods gs2 = new Goods("핸드폰",90,"삼성");
		try {
		FileOutputStream fos = new FileOutputStream(".\\file\\serial2.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(gs1);
		oos.writeObject(gs2);
		System.out.println("파일이 생성되었습니다");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream(".\\file\\serial2.out");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Goods g1 = (Goods)ois.readObject();
			Goods g2 = (Goods)ois.readObject();
			System.out.println(g1);
			System.out.println(g2);
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
