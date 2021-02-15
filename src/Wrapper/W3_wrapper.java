package Wrapper;

public class W3_wrapper {

	public static void main(String [] args) {
		Integer i = new Integer(10);
		char c ='4';
		Double d = new Double(3.14);
		
		
		System.out.println(Character.toLowerCase('A'));//소문자로전환
		System.out.println(Character.isDigit(4));//문자면 true, 숫자면 false
		
		if(Character.isDigit(c)) {
			System.out.println(Character.getNumericValue(c)+100); // 문자->숫자
		}
		System.out.println(Integer.parseInt("-123"));
		int a = Integer.parseInt("123");
		int b = a+100;
		System.out.println(b);
		
		System.out.println(Integer.toBinaryString(28));//정수--->2진수로
		System.out.println(Integer.toHexString(28));//정수--->16진수로
		System.out.println(i.doubleValue()); //정수-->더블형태로
		System.out.println(d.intValue());//더블-->정수
	}
}
