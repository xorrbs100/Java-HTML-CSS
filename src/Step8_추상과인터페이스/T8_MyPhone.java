package Step8_추상과인터페이스;

interface MobilePhone extends Phone{
	void sendSMS();
	void receiveSMS();
	
}
interface Mp3{
	void play();
	void stop();
}
interface Music extends Phone,Mp3{
	void playMp3RingTone();
	
}
interface AI{
	void recognizeSpeech();
	void systhesizeSpeech();
	
}
class MyPhone implements Music,MobilePhone,AI{

	@Override
	public void sendCall() {
		System.out.println("전화걸기");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화받기");
		
	}

	@Override
	public void play() {
		System.out.println("음악재생");
		
	}

	@Override
	public void stop() {
		System.out.println("음악정지");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("문자보내기");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자받기");
		
	}

	@Override
	public void playMp3RingTone() {
	}

	@Override
	public void recognizeSpeech() {
		System.out.println("음성인식");
		
	}

	@Override
	public void systhesizeSpeech() {
		System.out.println("음성합성");
		
	}
	
}
public class T8_MyPhone{

	public static void main(String[] args) {
		int age=0;
		float a =0.3f;
		double d =age+a;
		MyPhone myp = new MyPhone();
		myp.play();
		myp.sendCall();

	}

}
