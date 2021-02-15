/*
 	스레드 생명주기
 		1. 스레드생성 : new 
 				start()
 		2. Runnable : 실행준비
 	yield()		run()
 		3. Runnable : 실행
 				
 		4. Wating: 대기		4.Timed_wating : 시간대기 sleep()		4. Block : 봉쇄		4.Terminated:스레드가 종료한 상태
 		
 		
 		스레드 우선순위
 			. MAX_PRIORITY = 10  최댓값
 			. MAX_PRIORITY = 5 	중간값
 			. MAX_PRIORITY = 1	최소값
 			
 */

//스레드
 

//리스너

public class ThreadLife {

	
	public static void main(String [] args) {
	
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		System.out.println("현재 스레드의 이름 : "+name +" id : "+id+" 우선순위 : "+priority);
		
	}
}
