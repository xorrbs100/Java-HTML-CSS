/* 배열을 활용해서  합계와 평균을 구하는 연습
 * 출력폼 : 합계: ~  과목수:~ 평균 : ~
 */
package c1_array;

public class Array2 {

	public static void main(String[] args) {
		
		//1. 배열선언
		int a [] = new int [] {85,90,75,100,95};
		//2. 변수선언
		int sum=0, avg;
		//3 합계계산
		for(int i=0; i<a.length;i++) {
			sum+=a[i];
			
		}
		System.out.println("평균값은 "+sum/a.length+" 과목수는 "+a.length+" 총점은 "+ sum);
			
	}

}
//