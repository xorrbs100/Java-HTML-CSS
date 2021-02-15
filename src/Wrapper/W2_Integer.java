package Wrapper;

public class W2_Integer {

	public static void main(String[] args) {
		System.out.println("********parseInt*********");
		int j = Integer.parseInt("123"); //문자열 숫자를 정수로변환
		System.out.println(j);
		boolean b = Boolean.parseBoolean("@@@@@@");//문자값이면 true
		System.out.println(b);
		
		float f = Float.parseFloat("3.14");
		System.out.println(f);
		
		System.out.println("*********toString*******");
		String s1 = Integer.toString(123);
		System.out.println(s1+200);

		String s2 = Integer.toHexString(123); //16진수
		System.out.println(s2+200);
		
		String s3 = Float.toString(3.14f);
		System.out.println(s3+200);
		
		String s4 = Character.toString('a');
		System.out.println(s4+999);
		
		String s5 = Boolean.toString(true);
		System.out.println(s5+200);
		
	}

}
