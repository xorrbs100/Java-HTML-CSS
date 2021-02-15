package Step3_Constructor;

class Sonata{
	
	Sonata(){
		System.out.println("df");
	}
	Sonata(int a){
		this("half");
		System.out.println("자동차 도어 수는"+a);
		
	}
	Sonata(String str){
		System.out.println("자동차 옵션은"+str+"입니다");
		
	}
}


public class C2_constructorEX {

	public static void main(String [] args) {
		
		Sonata s1= new Sonata();
		Sonata s2= new Sonata(4);
		Sonata s3= new Sonata("풀");
		
	}
}
