package Step8_추상과인터페이스;

abstract class MyCalculator{
	MyCalculator(){}
	abstract public int add(int a , int b);
	abstract public int substract(int a, int b);
	abstract public double average(int []a);
}

class GoodCal extends MyCalculator{
	public int add (int a , int b) {
		return a+b;
	}
	public int substract(int a, int b) {
		return a-b;
	}
	public double average(int [] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum/(float)a.length;
	}
}

public class A4_AbstractEx {

	public static void main (String []args) {
		MyCalculator ca = new GoodCal();
		System.out.println(ca.add(3,6));
		System.out.println(ca.substract(2, 1));
		System.out.println(ca.average((new int[] {1,2,3,4,5,6,7,8,9,10}))); //매개변수가 배열
	}	
}
