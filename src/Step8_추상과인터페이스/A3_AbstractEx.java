package Step8_추상과인터페이스;

abstract class DObject{
	public DObject next;
	public DObject () {
		next = null;
		System.out.println(next);
	}
	abstract public void draw();
	abstract public void print();
}
abstract class Person extends DObject{
	protected String name;
	public Person(String name) {
		this.name=name;
		System.out.println(name);
	}

	@Override
	public void draw() {
		System.out.println("오버라이딩시 구현되는 메소드의 접근지정자는 범위가 더 넓어야 한다");
	}
	//추상메소드 추가
	abstract public void print();
}
class Print extends Person{
	public Print(String name) {
		super(name);
	}

	@Override
	public void print() {
		System.out.println(super.name+" DObject의 추상메소드는 Person에서 구현했고,"
				+ "Person클래스의 추상메소드는 자식Print에서 구현");
	}
}

public class A3_AbstractEx {

	public static void main (String [] args) {
		DObject O = new Print("홍길동"); //업캐스팅
		Person p;//추상클래스는 객체생성은 안돼도 선언은 가능하다
		O.print();
		O.draw();
	}
}
