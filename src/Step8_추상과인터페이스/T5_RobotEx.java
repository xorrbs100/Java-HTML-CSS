package Step8_추상과인터페이스;

public class T5_RobotEx {

	static void action(T5_Robot r) {
		if(r instanceof DanceRobot) {
			((DanceRobot) r).dance();
		}
		else if(r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		}
		else if(r instanceof SingRobot) {
			((SingRobot) r).sing();
		}
	}
	
	public static void main(String[] args) {
		T5_Robot [] rb = new T5_Robot[3];
		rb[0]=new DanceRobot();
		rb[1]=new DrawRobot();
		rb[2]=new SingRobot();
		
		for(T5_Robot r:rb) {
			T5_RobotEx.action(r);//클래스명생략가능
			
		}
	}
}
