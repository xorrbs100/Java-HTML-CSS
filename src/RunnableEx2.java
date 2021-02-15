
//1초에 하나씩 숫자를 0부터 1씩증가하면서 짝수만출력
class Timer1 implements Runnable{

	@Override
	public void run() {
		for(int i =0;i<50;i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
			try {
				Thread.sleep(1000);
				
			}catch(Exception e) {
				return;
			}
		}
	}
	
}

public class RunnableEx2 {

	public static void main(String[] args) {
		Timer1 t1 = new Timer1();
		Thread th1 = new Thread(t1);
		th1.start();
	}

}
