/*
 		멀티태스킹 : 멀티+태스킹의 합성어, 다수의 작업을 동시에 처리하는 것
 		스레드(Thread) : thread of control의 줄임말
 			. 프로그램을 실행하는 하나의 실 혹은 제어의 개념
 			. 하나의 스레드로 하나의 작업밖에 처리할 수 없다.
 		멀티태스킹을 구현하는 두가지 방법
 			- 멀티프로세싱 : 하나의 응용프로그램을 여러개의 프로세스로 구성하여 각 프로세스가 하나의 작업을 처리하도록 하는 기법(고유한 메모리 영역을 보유하고 독립적 실행) 
 			- 멀티스레싱   : 하나의 응용프로그램을 동시에 처리가 가능한 여러작업 코드로 분할하고 작업의 개수만큼 스레드를 생성하여 각 스레드로 하여금 하나의 작업을 처리하도록 하는 기법
 			 			(모든 스레드는 응용프로그램 내의 자원과 메모리를 공유한다)
 			*자바는 멀티스레싱 방식을 지원한다. 그래서 동시에 여러개의 응용프로그램을 동시실행이 불가하고
 			*하나의 응용프로그램을 여러개의 스레드로 나눠서 동시처리하게 한다.
 		구현방법
 			- Thread클래스 활용
 			- Runnable 인터페이스 활용
 		Thread클래스 메소드
 			- run()		: 스레드 코드작성. JVM에 의해 호출되는 메소드이다.
 			- start()	: JVM에게 스레드를 실행요청하는 메소드 (실행 타이밍은 JVM이 결정한다)
 			- interrupt() : 스레드 실행을 강제종료한다.
 			- yield()	: 다른 스레드에게 양보한다.
 			- join()	: 스레드가 종료될때까지 기다린다.
 			- sleep()	: 스레드를 잠자게한다.
 */



class Test{
	int n=0;
	void print() throws InterruptedException {
		while(true) {
			System.out.println(n);
			Thread.sleep(2000);			//스레드의 sleep메소드. 실행을 잠재운다. 1000-1초
			n++;
		}
	}
}
public class ThreadEx1 {

	public static void main(String[] args) throws InterruptedException {
		Test t = new Test();
		t.print();
	}

}
