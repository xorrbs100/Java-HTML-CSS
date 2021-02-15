/*
	LinkedList
				배열						Linkedlist
		-----------------------------------------------
		저장	   물리적연속공간					논리적 연속공간
	삽입/삭제	  크기가변하면 다시 만들어야함		앞뒤 노드의 연결주소만 변경
	   장단점	 자료변경이 거의 없을때			자료변경이 많을때
	   
	   . 주요메소드
	   	- add(), add(index,value), addFirst(value), addLast(value)
	   	- get(index), getFirst(), getLast()
	   	- remove(index), removeAll(), removeFirst(), removeLast()
 */
package Collection;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<>();
		

		link.add("A");
		link.add("B");
		link.add("C");//끝에 삽입
		System.out.println(link);
		link.add(1,"D");
		link.add(1,"E");
		link.addFirst("0");
		link.addLast("3");
		System.out.println(link);
		//1번째값을출력하시오.
		System.out.println(link.get(0));
		System.out.println(link.getLast());
		link.remove(2);
		System.out.println(link);
		
	}

}
