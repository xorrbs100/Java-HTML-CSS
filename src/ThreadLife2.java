
public class ThreadLife2 extends Thread{

	int n =0;
	public void run() {
		while(n<10) {
			System.out.println(n);
			n++;
			
			try {
				sleep(1000);
			}catch(Exception e) {
				return;			//예외가 발생되면 스스로 스레드를 종료하고 호출한 곳으로 간다.
			}
		}
	}
	public static void main(String[] args) {
		ThreadLife2 t= new ThreadLife2();
		t.start();
		//t.interrupt();		//강종

	}

}
