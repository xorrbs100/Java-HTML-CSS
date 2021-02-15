/*
 * 		배열
 * 			-자료형이 동일한 여러개의 값을 연이어 저장할 수 있도록 하는 저장공간의 집합체
 * 			1. 선언/생성형식
 * 				데이터타입[] 배열명;            -선언
 * 				배열명 = new 데이터타입[방의갯수]  -생성
 * 			2. 초기화 : 배열은 초기화 하지 않아도 자바에서는 초기화 해준다. 
 */
package c1_array;

public class Array1 {

	public static void main(String[] args) {
		
		//방5개짜리 정수값 저장하는 방
		int a[]= new int [5]; //a= [] [] [] [] []
							  //   a0 a1 a2 a3 a4
							  //   배열의 길이를 구해주는 메소드 a.length()=5
		a[0]=7;
		a[1]=8;
		a[2]=34;
		a[3]=6;
		a[4]=234;
		//a[5]=2; 에러
		
		int  b [];
		b= new int[] {1,2,3,4,5}; //선언부와 따로쓸때
		
		int c [] = {1,2,3,4,5}; //new int 생략
		
		System.out.println(c[0]);
		System.out.println(b[3]);
		for(int i=0;i<a.length;i++) { //a.length로 값을잡는다
			System.out.println("a["+i+"]="+a[i]);
			
		}
	}
}
