package Collection;

import java.util.Vector;

public class Vector1Ex {
	public static void main(String args[]) {
		
		
		//Vector생성
		Vector<Integer> v = new Vector<>();
		//자료 입력
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(4);		//요소 값의 중복을 허용함
		
		//Vector의 중간에 삽입
		v.add(2, 1000);
		
		//Print
		for(int i = 0; i<v.size(); i++) {	//Vector에는 length가 없고 Size만 있으므로 길이를 비교할 경우 Size를 사용해야 한다.
			int n = v.get(i);
			System.out.println(n);
		}
		System.out.println("백터 내의 요소 객체의 수 : "+v.size());
		System.out.println("벡터의 현재 용량 : "+v.capacity());
		
		
		//벡터의 모든 정수를 더하시오.
		//벡터속의 총합을 출력하시오
		
		int sum = 0;
		System.out.println("벡터 내의 요소 총합은");
		for(int i = 0; i<v.size(); i++) {
			int n = v.get(i);
			sum += n;
		}
		System.out.println(sum+"입니다.");
		
		
		
		Vector<Member> m = new Vector<>();
		//Member t = new Member(1001, "김효진");
		m.add(new Member(1001, "김효진"));
		m.get(0);			//이곳에 1001, "김효진"이 두개 다 들어가 있다.>>따로 불러줘야 함
		Member t = m.get(0);
		System.out.println(t.getMemberName());
		t.setMemberID(1009);
		System.out.println(t.getMemberID());
		m.add(new Member(1009,"홍길동"));
		m.get(1);
		System.out.println(m.toString());
		System.out.println(t.toString());
	}
}
