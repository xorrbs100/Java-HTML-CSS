package Step2_Variable;

class Static{
	
	int a=7;
	static int b = 10;
	
	void print1(){//인스턴스 메소드
		System.out.println("a="+a+", b="+b);
	}
	
	static void print2() { //클래스 메소드
		
		//System.out.println("a="a+", b"+b);
		
	}
	
	static void print3() {
		System.out.println("b="+b);
	}
}

public class V6_StaticEx {

	public static void main(String args[]) {
		
		Static.print2();
		Static.print3();// = st.print3();
		Static.b=30;
		
		Static st =new Static();
		st.a=9;
		st.print1();
	
				
		
	}
	
	
}
