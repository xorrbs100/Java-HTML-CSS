/*
	제네릭(Generics)
		. 모든 종류의 타입을 다룰 수 있도록, 클래스나 메소드를 타입매개변수(generics type)을 이용하여 선언하는 기법이다.
		. C++의 템플릿과 유사하다.
		. 클래스 코드를 타입에 따라 찍어내듯이 생산할 수 있도록 일반화(generics)시키는 도구이다.
		. 다이아몬드 연산자<>를 사용하여 정의한다.
		. 제네릭클래스 안에서 제네릭 타입의 객체를 생성할 수는 없다.
		. 제네릭에서 데이터 타입은 객체타입만 가능하다. 고로 박싱(객체명.intValue() 또는 자동박싱)
	컬렉션(Collection)
		. 제네릭 클래스의 모음
		. 배열이 가진 고정크기의 단점을 극복하기 위해서 객체들을 쉽게 삽입,삭제,검색할 수 있는 가변크기의 컨테이너로 구현해 놓은 자료구조들이다.
		. 대표적인 종류
			- Vector<E>, ArrayList<E> : 가변크기의 배열 구현
			- LinkedList<E>			  : 노드들을 링크로 연결한 리스트 구현
			- HashSet<E>			  : 집합구현
			- HashMap<k,v>			  : 키와 값 쌍으로 이루어지는 데이터 저장 자료구조 구현
		. 특징
		 	- 컬렉션은 제네릭이라는 기법으로 만들어져 있다.
		 	- 컬렉션의 요소는 객체들만 가능하다.	(int 불가 Integer가능)
		 	  그렇지만, 자동박싱에 의해 Wrapper클래스 타입으로 변환되어 저장된다.
*/
package GenericMake;

class Stack1<E>{ //<>클래스에서 일반화시켜놓고 선언한다.
	
	//Integer [] a = new Integer[10];
/*	Integer [] push(Integer[] e1) {//인티저배열
		for(int i = 0 ; i < e1.length ;i++) {
			e1[i]=i;				//자동박싱 = new Integer(i)
		}
		return e1;
	}
	void pop(Integer [] e1){
		for(int i=0;i<e1.length;i++) {
			System.out.println("e1["+i+"]="+e1[i]);
		}
	}*/
	E[] push(E [] e2) {
		for(int i =0;i<e2.length;i++) {
			e2[i]=(E)Integer.valueOf(i);//박싱
		}return e2;
	}
	void pop(E [] e2) {
		for(int i=0;i<e2.length;i++) {
			System.out.println("e2["+i+"]="+e2[i]);
		}
	}
}


public class G1_Concept {

	public static void main(String []args) {
		
		/*Integer []e2 = new Integer[10];
		Stack1 s1 = new Stack1();
		s1.push(e2);
		s1.pop(e2);
		
		String []e2 = new String[10];
		Stack1 s2 = new Stack1();
		s2.push(e2);
		s2.pop(e2);
*/
		Integer[]e2=new Integer[10];
		//제네릭 객체 생성하는 문법 : 클래스명<데이터타입> 객체변수 = new 클래스명 <데이터타입>();
		Stack1<Integer> s1 = new Stack1/*<Integer>*/();
		s1.push(e2);
		s1.pop(e2);
	}
	
}
