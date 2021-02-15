/*
 		동기화(Synchronized)를 걸어준다는 의미
 			- 여러 스레드가 Synchronized로 설정한 부분을 동시에 호출할 때
 			- 먼저 호출한 것이 끝날때까지 나머지는 대기하게 만드는 것을 말한다.
 			
 		멀티스레드의 주의점 : 동시접근시 충돌이 발생하지 않게 처리하는 것.
 		
 		구현방법 2가지 :		1) 메소드 전체를 Synchronized로 처리한다.
 		 				2) 필요한 임의의 코드블럭을 임계영역으로 지정처리한다.
 		동기화 동작	   :	들어갈때 Lock, 나올때 UnLock 동작으로 이뤄진다. 				
 */

class Cal{
	int sum=0;
	int n;
	synchronized void add() {
		n=sum;
		//Thread.yield();			//다른 스레드에 양보
		n+=10;
		sum=n;
		System.out.println(Thread.currentThread().getName()+sum);
	}
	
}
class Student extends Thread{
	Cal c ;
	public Student(String name, Cal c) {
		super(name);
		this.c=c;
	}
	public void run() {
		int i = 0;
		while(i<10) {
			c.add();
			i++;
		}
	}
	
}
public class Syn1 {

	public static void main(String[] args) {
		Cal cal = new Cal();
		Student th1 = new Student("홍길동",cal);
		Student th2 = new Student("이순신",cal);
		th1.start();
		th2.start();
		
		

	}

}
