package Step8_추상과인터페이스;

public interface T5_Robot {

	
}

class DanceRobot implements T5_Robot{
	void dance() {
		System.out.println("춤을 춥니다.");
	}
	
}
class DrawRobot implements T5_Robot{
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
class SingRobot implements T5_Robot{
	void sing() {
		System.out.println("노래를 부릅니다");
	}
	
}

