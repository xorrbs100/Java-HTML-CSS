package Step8_추상과인터페이스;

interface Volume{
	void volumeUp();
	void volumeDown();
}
class Tv implements Volume{

	Tv(){}
	
	@Override
	public void volumeUp() {
		System.out.println("Tv 볼륨을 올립니다");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("Tv 볼륨을 내립니다");
		
	}
	public void On() {
		System.out.println("전원on");
	}
	public void Off() {
		System.out.println("전원off");
	}
}
class Audio implements Volume{
	Audio(){}
	@Override
	public void volumeUp() {
		System.out.println("오디오 볼륨을 올립니다");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("오디오 볼륨을 내립니다");
		
	}
}
class Speaker implements Volume{
	Speaker(){}
	@Override
	public void volumeUp() {
		System.out.println("스피커 볼륨을 올립니다");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("스피커 볼륨을 내립니다");
		
	}
	
}
public class T3_Volume {

	public static void main(String[] args) {
		
		Volume V1 = new Tv();
		Volume V2 = new Audio();
		Volume V3 = new Speaker();
		
		V1.volumeUp();
		V2.volumeDown();
		V3.volumeDown();
	}
}
