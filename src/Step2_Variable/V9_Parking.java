package Step2_Variable;

public class V9_Parking {

	//멤버변수
	String name;
	int intime,outtime;
	final int AMTPERTIME = 3000; //시간당3천원
	
	//생성자
	V9_Parking(){}
	public V9_Parking(String name, int intime, int outtime){
		this.name = name;
		this.intime=intime;
		this.outtime=outtime;
		
	}
	
	
	//메소드
	void print() {
		int fee=(outtime - intime)*AMTPERTIME;  //주차비
		System.out.println("차이름  : "+name);
		System.out.println("입고시간 : "+intime);
		System.out.println("출고시간 : "+outtime);
		System.out.println("주차비 : "+fee);
	}
	
	
}
