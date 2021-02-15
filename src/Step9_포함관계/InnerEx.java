//클래스안에 클래스생성 및 활용
//https://docs.oracle.com/javase/10/docs/api 활용패키지
package Step9_포함관계;

class Outer{
	int width = 10;
	int height = 10;
	Outer(){}
	Outer(int width,int height){
		this.width=width; this.height=height;
	}
	public Inner getInner() {
		return new Inner();
	}
	//클래스속에 클래스
	class Inner {
		int depth = 10;
		int volume() {
			return width*height*depth;
		}
	}
}

public class InnerEx {

	public static void main(String[] args) {
		
		Outer o1 = new Outer(12,15);
		Outer o2 = new Outer(100,200);
		
		//안쪽클래스접근
		Outer.Inner in1= o1.new Inner();
		Outer.Inner in2= o1.getInner();

	}

}
