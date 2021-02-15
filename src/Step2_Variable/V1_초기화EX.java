package Step2_Variable;

public class V1_초기화EX {

	public static void main(String[] args) {
		
		V1_초기화1 mCar=new V1_초기화1();
		V1_초기화1 yCar=new V1_초기화1();
		
		
		mCar.color="빨강";
		yCar.color="초록";
		
		System.out.println("내차는...");
		mCar.speed=200;
		mCar.speedup();
		
		
		yCar.speedup();
		
		mCar.print();
		yCar.print();
		
	}
}
