/*
 * for(시작점 ;조건식; 증감식){
 * 			실행문;
 * }
 * 
 * - 조건식이 맞는 동안 반복한다.
 * - 시작점, 조건식, 증감식은 모두 생략가능하다.
 */


package c3_for;

public class For1_SumTo10 {

	public static void main(String[] args) {
		
		int sum =0;
		
		for(int i=1;i<=10;i++) {
			sum += i; // sum=sum+i
			//0 = 0+1
			//1 = 1+2
			//3 = 3+3
			//6 = 6+4
			//10 = 10+5
			
			System.out.println(i+"까지의 합은"+sum+"입니다");
		}
		
		System.out.println("총 합계 :"+sum);
		//조건식 안의 칸을 비워서 구현해보자
		sum=0;
		int j = 0;
		for (;;) {
			
			if(j>10) {
				break;
			}
			sum+=j ;
			System.out.println(j+"까지의 합은"+sum+"입니다");
			j++;
		}
			System.out.println("총 합계 :"+sum);
	}

}
