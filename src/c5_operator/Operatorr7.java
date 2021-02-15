/*
 * 비트연산자
 * 	.논리연산자와 비슷하나 하는일은 전혀다름.
 *  .비트를 사용해서 연산하는 연산자이다.
 *  .정수와 정수형태의 연산만 가능하다
 *  
 *  . AND(&) : 11-->1
 *  . OR(\) 00-->
 *   .XOR(^);00-->0, 11->0, 0 1 -->, 1 0-->1, 01 -->1 (다르면1)
 */



package c5_operator;

public class Operatorr7 {

	public static void main (String artgs[]) {
		
		int n1 = 10;
		int n2 = 5;
		int result = n1 & n2;
/*		비트연산자계산
				16 8 4 2 1 
		------------------
		n1 10	0 1 0 1 0
		n2 5	0 0 1 0 1	
		-----------------
		&       0 0 0 0 0 =0
		
*/		
		System.out.println(result);
		
		result =n1|n2;
		System.out.println(result);
/*		비트연산자계산		
					16 8 4 2 1 
			------------------
			n1 10	0 1 0 1 0
			n2 5	0 0 1 0 1	
			-----------------
			|       0 1 1 1 1 =15

*/		
		result = n1^n2;
		System.out.println(result);
/*		비트연산자계산		
					16 8 4 2 1 
			------------------
			n1 10	0 1 0 1 0
			n2 5	0 0 1 0 1	
			-----------------
			^       0 1 1 1 1 =15

*/		
				
		
	}
}
