package Step7_inheritance;

class Car{
	int a = 7;
	void move() {
		System.out.println("이동한다");
	}
}
class Bus extends Car{
	int a = 25;
	@Override
	void move() {
		System.out.println("40명을 태우고 ");
		
	}
}
class Ambulance extends Car{
	void move() {
		System.out.println("싸이렌을 울리며");
	}
	void special() {
		System.out.println("환자를 태우고 있다.");
	}
}
class FireEngine extends Car{
	int a = 11;
	void move() {
		System.out.println("물을 뿌린다");
	}
}
public class E15_오버라이딩 {

	public static void main(String [] args) {
		Car[] c = new Car[3];
		c[0]=new Bus();
		c[1]=new Ambulance();
		c[2]=new FireEngine();
		
		for(Car i : c) {
			i.move();
			//System.out.println(i.a);
			if(i instanceof Ambulance) {
				Ambulance am = (Ambulance)i; //업캐스팅된 앰뷸을 다운캐스팅 후 자식내부메소드 접근
				am.special();
			}
		}
		
	}
}
