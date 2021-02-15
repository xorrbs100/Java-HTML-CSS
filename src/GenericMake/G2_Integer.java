package GenericMake;

class Gstack2{
	
	int point;
	Object [] stack; //Object의 객체를 담는 배열 stack선언
	
	public Gstack2() {
		point =0;
		stack = new Object[10];  //Object의 객체를 담는 배열 stack생성
	}
	public void push(Integer item/*인티져 클래스타입의 객체선언 오브젝은 최상위 클래스이기 때문에 가능*/) {
		if(point==10) { //스택이가득차면
			return;  //호출한 곳으로 그냥 돌아가라
		}
		//저장공간이 남아있으면 Integer 객체를 저장하고 포인트를 증가시켜놓는다.
		stack [point] = item; //부모걸로(Object) 형변환
		point ++;
	}
	public Integer pop() {
		if (point==0) {
			return null;
		}
		//값이있으면, 포인트를 내려놓고 값을 리턴해라.
		point --;
		return (Integer)stack[point]; //인티져 클래스로 다운캐스팅
	}
}

public class G2_Integer {

	public static void main (String [] args) {
		Gstack2 st2=new Gstack2();
		
		st2.push(100);
		st2.push(200);
		st2.push(300);
		st2.push(400);
		
		for(int n=0;n<4;n++) {
			System.out.println(st2.pop());
		}
	}
	
}
