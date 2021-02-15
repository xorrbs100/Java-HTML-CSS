/*
	컬렉션 
		. 배열이 가진 고정크기의 단점을 극복하기 위해서 가변크기의 컨테이너로 구현해 놓은 자료구조들이다.
		. 자바에서는 필요한 자료구조를 미리 구현하여 java.util패키지에서 자료구조 라이브러리를 제공하고 있는데 이를 컬렉션프레임이라 한다.
		. 구조 
									Collection											Map<k,v>			
								     	|													|	
				----------------------------------------------------------					|
				|						|								|					|
			  set<E>				List<E>							Queue<E>				|
				|						|								|					|
		------------				----------					  -------------			HashMap<k,v>
		HashSet<E>					ArrayList<E>				LinkedList<E>			TreeMap<k,v>
		TreeSet<E>					Vector<E>								
									stack<E>

		. 주요메소드
			(Collection인터페이스)
			- boolean add(E e) : 객체추가
			- boolean remove(Object e) :객체삭제
			- void clear() : 모든 객체제거
			- Iterator<E> iterator(): 순환할 반복자를 반환
			- int size()	: 요소의 개수반환
			(Collections클래스)
			- sort() : 컬렉션에 포함된 요소들의 정렬
			- reverse(): 요소를 반대 순으로 정렬
			- max(), min(): 최대,최소값  찾아내기
			(Map)
			- V push(k key, v value) : key와 value를 짝으로 맵에추가
			- V get(k key)			 : key로 값 반환
			- V remove(k key)		 : key가 있는 경우 제거
			- boolean isEmpty()      : Map이 비어있는지 여부 반환 --- 주로 if문과 같이사용
			- set keyset ()			 : key집합을 set으로 반환(중복안됨)
			- Collection values()	 : value를 Collection으로 반환(중복허용)			
*/
package Collection;

public class Member {
	private int memberID;
	private String memberName;
	//초기화
	public Member(int memberId, String memberName) {
		this.memberID=memberId ; this.memberName=memberName;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	//추가
	@Override
	public String toString() {
		return memberName+"회원님의 아이디는 "+memberID+"입니다";
	}
	

}
