/*
 		Calendar클래스
 			. static 멤버,메소드로 구성
 			. 컴퓨터의 시간을 가져와서 설정한다
 */

package Calendar;

import java.util.Calendar;

public class Calendar1 {

	public static void printCalendar(String msg,Calendar cal) {
		//Calendar now = Calendar.getInstance(); //컴퓨터에 있는 년월일시간을가져온다
		int year = cal.get(Calendar.YEAR);
		int month= cal.get(Calendar.MONTH)+1;      //1월0 ~12월11
		int day = cal.get(Calendar.DAY_OF_MONTH); //월단위날짜
		int week = cal.get(Calendar.DAY_OF_WEEK); //월단위 주
		int hour = cal.get(Calendar.HOUR);
		int hourofday=cal.get(Calendar.HOUR_OF_DAY );//24시간 기준시간
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		int millisec=cal.get(Calendar.MILLISECOND);
		System.out.printf(msg+year+"/"+month+"/"+day+"/");//년원일출력
		//요일로 변환해서 출력
		switch(week) {
		case Calendar.SUNDAY:System.out.println("일요일");break;
		case Calendar.MONDAY:System.out.println("월요일");break;
		case Calendar.TUESDAY:System.out.println("화요일");break;
		case Calendar.WEDNESDAY:System.out.println("수요일");break;
		case Calendar.THURSDAY:System.out.println("목요일");break;
		case Calendar.FRIDAY:System.out.println("금요일");break;
		case Calendar.SATURDAY:System.out.println("토요일");break;
		
		}
		//am,pm
		if(ampm==Calendar.AM) {
			System.out.println("오전");
		}else System.out.println("오후");
		System.out.println(hour+"시"+minute+"분"+second+"초"+millisec+"밀리초 입니다");
		
	}
	public static void main(String []args) {
		
		Calendar now = Calendar.getInstance();
		printCalendar("지금시각은",now );
		
		//설정(set)
		Calendar DateTime = Calendar.getInstance();
		DateTime.clear();
		DateTime.set(2020, 4,23);//9월이면 7로설정해야 한다. - 0부터시작
		DateTime.set(Calendar.HOUR_OF_DAY, 20);
		DateTime.set(Calendar.MINUTE,30);
		printCalendar("데이트약속시간", DateTime);
	}
		
	
}
