
class Test2 extends Thread{		//스레드 클래스 상속
	int n=0;
	@Override
	public void run() {			//public void run() 메소드 재정의
		super.run();
		//스레드코드작성
		while(true) {
			
			System.out.print(n+ " ");
			n++;
			try {
			sleep(100);
		}catch(InterruptedException e) {
			return;
		}
		
		}
		
		
	}
}
public class ThreadEx2 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.start();				//JVM에 스레드처리요청
		

	}

}
