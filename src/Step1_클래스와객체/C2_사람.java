package Step1_클래스와객체;
class Human{
	
	String 이름;
	String 직업;
	int 나이;
	String 성별;
	String 혈액형;
	
	Human(String a,String b, int c, String d, String e){
		이름=a;
		직업=b;
		나이=c;
		성별=d;
		혈액형=e;
		
		System.out.println(a+"의 직업은"+b+"이고"+"나이는"+c+"세 성별은"+d+"혈액형은"+e+"형 입니다");
				
	}
	
	void 밥먹기(){
		System.out.println("3");
	}
	void 잠자기() {
		System.out.println("12시");
	}
	
	void 말하기() {
		System.out.println("Hi");
	}
	void 걷기() {
		System.out.println("ㅇㅇ");
	}
}

public class C2_사람 {

	public static void main(String args[]) {
		
		Human hm1=new Human("최승희","의사",45,"여","A");
		Human hm2=new Human("이미녀","골프선수",28,"여","O");
		Human hm3=new Human("김미남","교수",47,"남","AB");
		
		
		hm1.밥먹기();
		hm2.말하기();
		hm3.걷기();
		
	}
	
}
