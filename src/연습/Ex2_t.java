package 연습;

import java.util.Calendar;
import java.util.Scanner;

class Player{
	private String name;
	private Scanner sc = new Scanner(System.in);
	public Player(String name) {
		this .name = name;
	}
	public String getName() {
		return name;
	}
	public int turn() {
		//시작초
		System.out.print(name + "님의 게임시작입니다 엔터를 눌러주세요");
		String enterkey=sc.nextLine();
		
		Calendar c = Calendar.getInstance();
		int startSecond = c.get(Calendar.SECOND);
		System.out.println("\n현재 초 : "+startSecond);
		
		//끝초
		System.out.print("10초가 되었다면 엔터를 눌러주세요>>");
		enterkey=sc.nextLine();
		int endSecond = c.get(Calendar.SECOND);
		System.out.println("\n초 : "+endSecond+"\n");
		//두개의 초 시간차계산 60초임을 고려
		if(startSecond>endSecond) {
			startSecond+=60;
		}
		return Math.abs(startSecond-endSecond); //시간차의 값만 리턴
	}
}

public class Ex2_t {

	public void run() {
		System.out.println("플레이어 2명의 이름을 차례로 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		String player1 = sc.next();
		String player2 = sc.next();
		Player[] player = new Player[2];
		player[0]=new Player(player1);
		player[1]=new Player(player2);
		
		int timeGap1 = player[0].turn();
		int timeGap2 = player[1].turn();
		
		System.out.println(player[0].getName()+"님의 시간차는 "+timeGap1);
		System.out.println(player[1].getName()+"님의 시간차는 "+timeGap2);
		System.out.println("승자는~~....");
		if(Math.abs(10-timeGap1)<Math.abs(10-timeGap2)){
			System.out.println(player[0].getName()+"님의 승리입니다");
		}else 
		{ System.out.println(player[1].getName()+"님의 승리입니다");
		}
	}

	public static void main(String[] args) {
		Ex2_t game = new Ex2_t();
		game.run();

	}

}
