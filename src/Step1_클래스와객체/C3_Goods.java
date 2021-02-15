package Step1_클래스와객체;

class Goodsex{
	
}

public class C3_Goods {
	
		//필드
		String name;
		
		int price, numberOfStock, sold;
		
		//생성자
		/*C3_Goods(){기본생성자 생략가능 컴파일러가 자동생성
			
		}*/
	
		
		//메소드
		public static void main(String [] args) {
		
			//객체생성
			C3_Goods camera;
			camera = new C3_Goods(); //기본생성자
			
			//멤버변수값 설정
			camera.name="Samsung";
			camera.price=400000;
			camera.numberOfStock=30;
			camera.sold=50;
			
			
			//활용
			System.out.println("제품명: "+camera.name+" 판매가: "+camera.price+" 재고수: "+camera.numberOfStock+" 판매수량: "+camera.sold);
			
			
			
	}
	
	
}
