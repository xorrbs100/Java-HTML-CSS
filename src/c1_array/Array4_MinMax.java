
//정수배열에 8개의 값을 저장해놓고 최대값과 최소값을 찾아내는 프로그램
package c1_array;

public class Array4_MinMax {

	public static void main(String[] args) {
	
		//정수배열 8개값
		int num[]= {1,2,30,4,50,6,7,8};

		int min = 120, max=0, sum=0; //min은 충분히 적은수, max는 충분히 큰수를 가정해서 넣어둔다
		
		//최대값 최소값 찾기
		for(int i=0; i<num.length;i++) {
			//합계
			sum+=num[i];
			//최대값 구하기
			if(num[i]>max) {
				max=num[i];
			}
			//최소값 구하기
			if(num[i]<min) {
				min=num[i];
				}
			System.out.println("합계: "+sum);
			System.out.println("평균: "+sum/num.length);
			System.out.println("Max: "+max);
			System.out.println("Min: "+min);
		}
	}

}
