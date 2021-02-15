package Step7_inheritance;

class Person1{
	
}
class Student1 extends Person1{
	
}
class Researcher extends Person1{
	
}
class Professor extends Researcher{
	
}

public class E12_계층업다운캐스팅 {

	public static void main(String [] args) {
	
		Person1 jee = new Person1();
		Person1 kim = new Student1();//업캐스팅
		Person1 lee = new Researcher();//업캐스팅
		Person1 jeong = new Professor();//업캐스팅
		if (jee instanceof Person1) { //소속관계를 t ,f 로반환해준다
			System.out.println("jees는 person 타입으로 true 입니다");
		}
		if (kim instanceof Student1) {
			System.out.println("kim는 student1 타입으로 true 입니다");
		}
		if (lee instanceof Researcher) {
			System.out.println("lees는 researcher 타입으로 true 입니다");
		}
		if (jeong instanceof Student1) {
			System.out.println("jeong Student1 타입으로 true 입니다");
		}else if(jeong instanceof Researcher) {
			System.out.println("jeong은 Researcher 타입이지 Student1타입이 아닙니다.");
		}
		
	}
	
}
