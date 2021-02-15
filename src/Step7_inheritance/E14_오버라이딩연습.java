package Step7_inheritance;

class Obj{
	

void print() {
	System.out.println("요일");
}
}
class Mon extends Obj{

	@Override
	void print() {
		System.out.println("월요일");
	}
}
class Thu extends Obj{
	@Override
	public void print() {
		System.out.println("화요일");
	}
}
class Wes extends Obj{
	@Override
	void print() {
		System.out.println("수요일");
	}
}
public class E14_오버라이딩연습 {

	public static void main(String[] args) {
		//각요일을 오버라이딩을 활용하여 동적바인딩시켜보세요
		Obj j = new Obj();
		j.print();
		
		j = new Mon();
		j.print();
		
		j=new Thu();
		j.print();
		
		j=new Wes();
		j.print();
	}
}
