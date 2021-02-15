package Step8_추상과인터페이스;

interface Phone {
	public static final int TIMEOUT=10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	public default void printLogo() {
		System.out.println("******Phone*****");
		System.out.println("TIMEOUT");

	}
}

//LG핸드폰 구현
class LGPhone implements Phone{

	@Override
	public void sendCall() {
		System.out.println("LG폰으로 전화를 겁니다");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("LG폰으로 전화를 받습니다");
		System.out.println("지정된 시간은"+TIMEOUT);
	}
	@Override
	public void printLogo() {
		System.out.println("****LGPHONE****");	
	}	
}

public class T6_LGPhoneEx {

	public static void main(String[] args) {
	
		LGPhone Lp = new LGPhone();
		Lp.sendCall();
		Lp.receiveCall();
		Lp.printLogo();

	}

}
