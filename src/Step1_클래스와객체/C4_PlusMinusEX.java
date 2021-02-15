package Step1_클래스와객체;

public class C4_PlusMinusEX {

	public static void main(String[] args) {
		
		C4_PlusMinus pm= new C4_PlusMinus();
		
		String p =pm.plus(1, 2);
		String m =pm.minus(4, 2);
		
		System.out.println(p);
		System.out.println(pm.minus(100,25));
	}

}
