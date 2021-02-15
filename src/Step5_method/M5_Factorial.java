package Step5_method;

class E1{
	int result=1;
	
	void factorial(int cnt) {
		if(cnt==1) {
			System.out.println("1= "+result);
			result=1;
			return ;
			
		}else {
			System.out.print(cnt+"*");
			result=result*cnt;
			
			//팩토리얼처리 알고리즘
			factorial(--cnt); //재귀함수 : 자기 자신을 호출하는 것
		}
		
	}
	
}

public class M5_Factorial {

	public static void main(String args[]) {
		
		E1 e = new E1();
		e.factorial(10);
	}
}
