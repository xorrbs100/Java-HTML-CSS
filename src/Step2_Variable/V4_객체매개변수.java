package Step2_Variable;

class Data{
	
	int kor,eng;
	
	void add(Data k, Data j) { //데이터가 매개변수
		k.kor=j.eng;
		System.out.println("d1: "+k);
		
		
	}
	
}

public class V4_객체매개변수 {

	public static void main (String [] args) {
		
		Data d1=new Data();
		Data d2=new Data();
		Data d3=new Data();
		d1.kor = 70;
		d2.eng = 80;
		
		d3.add(d1, d2); //d1과 d2는 객체매개변수(주소값)
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println("메인국어점수 :" +d1.kor);
	}
	
}
