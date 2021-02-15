

class Th1 extends Thread{
	public void run() {
		for(int i=0; i <= 20 ;i++) {
			System.out.println("끝까지");
			try {
				sleep(1000);
			}catch(InterruptedException e ) {
				System.out.println("천천히");
			}
		}
	}
	
}
class Th2 extends Thread{
	public void run() {
		for(int i=0;i<21;i++) {
			System.out.println("최선을");
			try {
				sleep(1000);
			}catch(InterruptedException e ) {
				System.out.println("천천히");
			}
		}
	}
	
}
public class ThreadEx4 {

	public static void main(String []args) {
		Th1 th1 = new Th1();
		Th2 th2 = new Th2();
		
		th1.start();
		th2.start();
		
	}
}
