package Step8_추상과인터페이스;

public class T4_LenderableEx {

	public static void main(String[] args) {
		SeperateVolume sv = new SeperateVolume("젊은 베르테르의 슬픔");
		sv.status=0;//1: 대여상태, 0: 대여가능상태
		sv.checkOut("정형돈","2015/10/21");
		sv.checkIn();
		
	}

}
