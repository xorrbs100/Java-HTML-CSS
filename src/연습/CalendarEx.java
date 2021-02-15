package 연습;

import java.util.Calendar;

import org.omg.Messaging.SyncScopeHelper;

public class CalendarEx {

	public static void printCalendar(String msg,Calendar cal) {
		int ampm  = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		if(ampm==Calendar.AM) {
			System.out.printf("오전 Good Moring ");
		}else System.out.printf("오후 Good Afternoon");
		System.out.println(ampm+hour+"시 "+minute+"분 "+sec+"초 입니다");
	}
	public static void main(String []args) {
		Calendar ca = Calendar.getInstance();
		printCalendar("현재시간은 ", ca);
	}

}
