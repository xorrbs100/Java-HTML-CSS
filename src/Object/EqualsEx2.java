package Object;

class Rect{
	int width;
	int height;
	
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	public boolean equals(Rect p) {
		if(width*height==p.width*p.height) {
			return true;
		}
		else return false;
	}
}

public class EqualsEx2 {

	public static void main(String[] args) {
		
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,5);
		Rect c = new Rect(3,2);
		if (a.equals(b)) {
			System.out.println("a와 b의 면적은 같다");
		}else System.out.println("a와 b의 면적은 다르다");
		if (a.equals(c)) System.out.println( " a와c는 같다");else System.out.println("a와 c는 다르다");
		if (b.equals(c)) System.out.println("b와 c는 같다");else System.out.println("b와 c는 다르다");
	}

}
