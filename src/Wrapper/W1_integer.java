/*
		int i =10;
		Integer i = new Integer(10);
		
		Wrapper(포장) class
			
		기본데이터타입 					 Wrapper class
			int     ----------------- Integer
			char	----------------- Character
			double  ----------------- Double
			float   ----------------- Float
			byte    ----------------- Byte
*/
package Wrapper;

public class W1_integer {

	public static void main(String []args) {
		
		Integer i = new Integer(10);
		//int ii = i.intValue();		//intValue() : 언박싱 즉, 객체를 값으로 전환
		int ii = i;						// 자동언박싱
		Integer.valueOf(ii);			// 박싱  클래스.밸류오브(변수명);
		System.out.println(i);
		System.out.println(ii);
		
		Character c = new Character('c');
		//char cc = c.charValue();
		char cc = c;
		Character.valueOf(cc);
		System.out.println(c+"+"+cc);
		
		Double d = new Double(3.3);
		//double dd=d.doubleValue();
		double dd = d;
		Double.valueOf(dd);
		System.out.println(d+dd);
		
		Boolean b = new Boolean(true);
		//boolean bb = b.booleanValue();
		boolean bb = b;
		Boolean.valueOf(bb);  
		System.out.println(b+"+"+bb);
	}
}
