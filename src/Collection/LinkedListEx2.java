package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx2 {

	public static void printList(LinkedList<String> m) {
		Iterator<String> iterator = m.iterator(); //순서대로 찾아가는 역할
		while(iterator.hasNext()) { //다음 값이 있으면..
			String e = iterator.next();//값을 읽어서 저장하고 
			String separator;
			if(iterator.hasNext()) {
				separator="->";  // 마지막이 아니면 ->
				
				
			}else {
				separator="\n" ; // 마지막이면 줄바꿈
			}
			System.out.print(e+separator);
		
		}
		
	}
	
	public static void main(String[] args) {
		
		LinkedList<String> myList=new LinkedList<>();
		
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
		
		Collections.sort(myList);
		printList(myList);

		int index = Collections.binarySearch(myList, "아바타")+1;
		System.out.println("아바타는 "+index+" 번째 요소입니다");
	}

}
