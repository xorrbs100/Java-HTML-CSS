package 연습문제;


import java.util.Scanner;

public class Ex7_직사각형안에점이있는지 {

	public static void main(String[] args) {
		System.out.println("점(x,y)의 좌표값을 입력해 주세요>>");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//사각형은 (50,50) (100,100)인 사각형안에 입력받은 점이 존재하는지 확인
		if(x>=50 && x<=100 && y>=50 && y<=100) {
			System.out.println("사각형 안에 점이 있습니다.");
		}else {
			System.out.println("사각형 밖에 점이 있습니다");
		}

		sc.close();
	}

}
