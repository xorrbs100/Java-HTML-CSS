package GenericMake;


class Gstack3<T>{
	
	int point;
	Object [] stack; //Object의 객체를 담는 배열 stack선언
	
	public Gstack3() {
		point =0;
		stack = new Object[10];  //Object의 객체를 담는 배열 stack생성
	}
	public void push(T item/* 클래스타입의 객체선언 오브젝은 최상위 클래스이기 때문에 가능*/) {
		if(point==10) { //스택이가득차면
			return;  //호출한 곳으로 그냥 돌아가라
		}
		//저장공간이 남아있으면 객체를 저장하고 포인트를 증가시켜놓는다.
		stack [point] = item; //부모걸로(Object) 형변환
		point ++;
	}
	public T pop() {
		if (point==0) {
			return null;
		}
		//값이있으면, 포인트를 내려놓고 값을 리턴해라.
		point --;
		return (T)stack[point]; // 클래스 다운캐스팅
	}
}

public class G2_Generic {

	public static void main(String [] args) {
		//제네릭 구체화 - 객체생성시 타입결정
		Gstack3<Integer> st3 = new Gstack3<Integer>();
		
		st3.push(1);
		st3.push(2);
		st3.push(3);
		st3.push(4);
		for(int n =0;n<4;n++) {
			System.out.println(st3.pop());
		}
		//스트링
		Gstack3<String> st4 = new Gstack3();
		st4.push("et");
		st4.push("etzt");
		st4.push("etzte");
		for(int n =0;n<2;n++) {
			System.out.println(st4.pop());
		}
	}
}
