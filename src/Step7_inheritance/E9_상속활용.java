package Step7_inheritance;

class T{
	private String name;
	private int age;
	T(){
		
	}
	T(String name, int age){
		this.name=name;
		this.age=age;
				
	}
	void show() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class T1 extends T{
	String degree;
	T1(String name, int age, String degree){
		super(name,age);
		this.degree=degree;
	}
	void show() {
		super.show();
		System.out.println("등급: "+degree);
	}
}
public class E9_상속활용 {
	public static void main(String [] args) {
		T1 f = new T1("홍길동" ,30,"박사");
		f.show();
		T t = new T("홍길동",30);
		t.show();
	}
	
}
