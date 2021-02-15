
class Thread4 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i<=100; i++) {
			System.out.println(Thread.currentThread().getName()+"대박\t");
			if(i%10==0) {
				System.out.println();
			}
			
		}
		
	}
	
}

public class RunnableEx1 {

	public static void main(String[] args) {
		Thread4 t1 = new Thread4();
		Thread4 t2 = new Thread4();
		//스레드에 러너블로만든 클래스의 객체삽입
		Thread th1 = new Thread(t1,"첫번째");
		Thread th2 = new Thread(t2,"두번째");
		th1.start();
		th2.start();
		
	}

}
