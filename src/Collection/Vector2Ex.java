package Collection;

import java.util.Vector;

class Point{
	private int x ,y ;
	
	Point(int x, int y){
		this.x=x; this.y=y;
	}
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
}

public class Vector2Ex {

	public static void main(String[] args) {
		
		Vector<Point> v = new Vector<Point>();
		
		//벡터안에 Point객체 3개저장
		v.add(new Point(2,3));
		v.add(new Point(3,4));
		v.add(new Point(4,5));
		//삭제
		v.remove(2);
		//모두출력
		for(int i=0;i<v.size();i++) {
			Point p = v.get(i); //객체.toString 자동으로부름
			System.out.println(p);
			
								//v[i].toString(), v[i].memberID
			System.out.println(v.get(i).toString());
			
			
			
		}
		

	}

}
