
//배열속에 있는 값을 오름차순으로 정렬하시오.

package c1_array;

public class Array5_Sort {

	public static void main(String[] args) {
		//배열생성
		int num[]= {2,3,5,7,4,21,1};
		int imsi=0;
		//정렬수행
		for(int i =0; i<num.length;i++) {
			for(int j=i+1; j<num.length;j++) {
				if(num[i]>num[j]) {
					imsi = num[i];
					num[i]=num[j];
					num[j]=imsi;
							
				}
				
			}
		}
		//결과출력
		System.out.println("정렬된 값은 :");
		for(int k:num) {
			System.out.println(k+" ");
		}

	}

}
