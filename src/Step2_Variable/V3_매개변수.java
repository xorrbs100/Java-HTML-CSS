package Step2_Variable;


class Score{
	//멤버변수
	
	//생성자
	
	//메소드
	void add(int k, int e) {//매개변수 타입 int 
		
		k=e;
		System.out.println("국어점수 : "+k);
	}
	
	
}

public class V3_매개변수 {

	public static void main (String [] args) {
		
		int kor = 70;
		int eng = 80;
		
		//객체생성
		Score sc = new Score();
		
		//객체활용
		sc.add(kor, eng);  
		
		
		System.out.println("메인 국어점수: "+kor);
		
	}
	
}
