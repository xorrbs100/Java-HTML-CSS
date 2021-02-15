package Step8_추상과인터페이스;


interface E1{
	void aa();
	
}
interface E2 extends E1{
	void bb();
}
interface E3 extends E2{
	void cc();
}
class E4 implements E3 {

	@Override
	public void bb() {
		System.out.println("BB");
		
	}

	@Override
	public void aa() {
		System.out.println("AA");
		
	}

	@Override
	public void cc() {
		System.out.println("CC");
		
	}
	
}

public class T2_Interface {

	public static void main(String args[]) {
		
		E1 inter = new E4();
		inter.aa();
		E2 inter2 = new E4();
		inter2.bb();
		E3 inter3 = new E4();
		inter3.cc();
		
		
	}
}
