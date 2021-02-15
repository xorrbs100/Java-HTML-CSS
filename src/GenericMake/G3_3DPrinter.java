package GenericMake;

//파우더 클래스
class Powder{
	public void doPrinting() {
		System.out.println("Powder재료로 출력합니다");
	}
	public String toString() {
		return "재료는 Powder입니다";
	}
}
//플라스틱 클래스
class Plastic{
	public void doPrint() {
		System.out.println("Plastic재료로 출력합니다");
	}
	public String toString() {
		return "재료는 Plastic입니다";
	}
}
//파우더 사용 프린터
class ThreedPrinter1{
	//멤버변수 - 파우더클래스 객체타입의 변수선언
	private Powder material; //클래스타입변수선언
	
	//생성자 - 파우더클래스를 받아서 초기화
	public void setMaterial(Powder material) {
		this.material=material;
	}
	
	public Powder getMaterial(Powder material) {
		 return material;
	}
}
//플라스틱 사용하는 프린터
class ThreedPrinter2{
	//멤버변수 - 파우더클래스 객체타입의 변수선언
	private Plastic material; //클래스타입변수선언
	
	//생성자 - 파우더클래스를 받아서 초기화
	public void setMaterial(Plastic material) {
		this.material=material;
	}
	
	public Plastic getMaterial(Plastic material) {
		 return material;
	}
}
//제네릭프린터
class ThreedPrinter3<E>{
	//멤버변수 - 파우더클래스 객체타입의 변수선언
	private E material; //클래스타입변수선언
	
	//생성자 - 파우더클래스를 받아서 초기화
	public void setMaterial(E material) {
		this.material=material;
	}
	
	public E getMaterial() {
		 return material;
	}
	@Override
	public String toString() { //Object 클래스의 toString()을 재정의한 것임.
		return material.toString();
	}
}
public class G3_3DPrinter {

	public static void main(String[] args) {
		//1.Powder사용
		ThreedPrinter3<Powder> tp = new ThreedPrinter3();
		tp.setMaterial(new Powder()); // Powder p = new Powder(); p가필요없으니
		Powder p = tp.getMaterial();
		System.out.println(p);
		System.out.println(p.toString());
		
	}

}
