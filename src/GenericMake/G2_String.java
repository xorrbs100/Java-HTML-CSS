package GenericMake;
//일반적인 클래스이고 문자를 받아서 스택에 저장하고 꺼내사용하는 스택클래스이다.

class Gstack1{
	
	int point;
	Object [] stack; //Object의 객체를 담는 배열 stack선언
	
	public Gstack1() {
		point =0;
		stack = new Object[10];  //Object의 객체를 담는 배열 stack생성
	}
	public void push(String item/*스트링 클래스타입의 객체선언 오브젝은 최상위 클래스이기 때문에 가능*/) {
		if(point==10) { //스택이가득차면
			return;  //호출한 곳으로 그냥 돌아가라
		}
		//저장공간이 남아있으면 String 객체를 저장하고 포인트를 증가시켜놓는다.
		stack [point] = item; //부모걸로(Object) 형변환
		point ++;
	}
	public String pop() {
		if (point==0) {
			return null;
		}
		//값이있으면, 포인트를 내려놓고 값을 리턴해라.
		point --;
		return (String)stack[point]; //스트링클래스로 다운캐스팅
	}
}

public class G2_String {

	public static void main(String [] args) {
		Gstack1 st = new Gstack1();
		st.push("서울");
		st.push("부산");
		st.push("광주");
		st.push("대구");

		
		for(int n =0;n<4;n++) {
			System.out.println(st.pop());
			
		}
	}
	
}
