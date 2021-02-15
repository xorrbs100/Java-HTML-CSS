package Step8_추상과인터페이스;



public interface T4_Lenderable {

	int BORROW=1;
	int NORMAL = 0;
	void checkOut(String borrower, String date);
	void checkIn();
	
}
class SeperateVolume implements T4_Lenderable{
	String title;
	String date;
	String borrower;
	int status;
	public SeperateVolume(String title) {
		this.title=title;
		
	}
	@Override
	public void checkOut(String borrower, String date) {
		if(status!=NORMAL) { //대여상태라면
			return;
		}
		this.date=date;
		this.borrower=borrower;
		status=BORROW;
		System.out.println(borrower+"가 "+date+"일에 "+title+"을 대여했습니다");
	}
	@Override
	public void checkIn() {
		if(status!=BORROW) { //대여상태가 아니라면
			return;
		}
		System.out.println(borrower+"가"+title+"이 반납되었습니다.");
		title = null;
		borrower=null;
		status=NORMAL;
	}
	
}