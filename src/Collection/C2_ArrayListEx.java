package Collection;

import java.util.ArrayList;

class ArrayList1 {
	private ArrayList<Member> arrayList; //멤버클래스타입으로 어레이리스트 변수에 리스트 저장

	
	//생성자 - ArrayList를 생성해서 초기화 하고 있다.
	public ArrayList1() {
		arrayList = new ArrayList<>();
	}
	//멤버추가

	public void addMember(Member member) {
		arrayList.add(member);		//ArrayList에 member 객체 추가
	}
	//찾는 ID가 있으면 삭제
	public boolean removeMember(int memberId) {
		
		for(int i = 0; i<arrayList.size();i++) {
			Member member= arrayList.get(i);		//ArrayList 속에 저장된 member객체를 꺼내서 변수에 담는다.
			int tempId = member.getMemberID();		//꺼내온 member객체속에서 ID값을 꺼내서 tempId에 저장
			
			if(tempId==memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId+"는 존재하지 않습니다");
		return false;
	}
	//전체 회원카드 출력
	public void showAllMember() {
		for(Member m: arrayList) {
			System.out.println(m);
		}
		System.out.println();
	}
}

public class C2_ArrayListEx {

	public static void main(String[] args) {
		//회원멤버객체생성
		Member hong = new Member(1001, "홍예훈");
		Member kim = new Member(1002, "김효진");
		Member park = new Member(1003, "박유정");
		//만든회원카드를 ArrayList에 담아보자.
		ArrayList1 mlist = new ArrayList1();	//ArrayList<Member>생성
		mlist.addMember(hong);
		mlist.addMember(kim);
		mlist.addMember(park);
		mlist.addMember(new Member(1004, "홍길동"));
		//전체출력
		mlist.showAllMember();
		//회원삭제
		mlist.removeMember(1004);
		//삭제확인
		mlist.showAllMember();
		

	}

}
