package Step3_Constructor;

class Subscribe{
	private String name;
	private String phone;
	
	Subscribe(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	void changePhone(String phone) {
		this.phone = phone;
	}
	void print() {
		System.out.println("이름 : "+ name + "  번호 : "+ phone);
	}
}

public class C4_SubscribeEx {
	
	public static void main(String []args) {
		
		Subscribe su1 = new Subscribe("홍길동","010-1111-2222");
		Subscribe su2 = new Subscribe("이순신","010-2222-3333");
		//su1.name="강감찬";  private로 잠궈서 다른 클래스에서 호출불가능 필드값임의 조작불가능하게 하는기능 (보안개념)
		
		
		su2.print();
		su1.print();
		su1.changePhone("010-2243-2342");
		su1.print();
		
	}

}
