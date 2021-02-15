package Step8_추상과인터페이스;


public class T7_SAMSUNGPhone implements Phone{

	@Override
	public void sendCall() {
		System.out.println("삼성폰 걸기");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("삼성폰 받기");
		
	}
	public void flash() {
		System.out.println("화면이 켜졌습니다");
	}
	

	public static void main(String [] args) {
	
		T7_SAMSUNGPhone sp = new T7_SAMSUNGPhone();
		sp.sendCall();
		sp.receiveCall();
		sp.flash();
		sp.printLogo();
	}
}
