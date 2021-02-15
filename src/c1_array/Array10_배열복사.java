package c1_array;

public class Array10_배열복사 {

	public static void main(String[] args) {
		char [] a = {'가','나','다','라','마','바'};
		char [] b = new char[6];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
			
		}
		for(char k :b) {
			System.out.print(k+" ");
			
		}System.out.println();
		
		//배열을 복사해주는 기능을 가진 메소드 활용 - system.arraycopy()
		//B배열초기화
		for(int i=0; i<b.length;i++ ) {
			b[i]='*';
			
		}
		//복사메소드 활용
		System.arraycopy(a, 0, b, 1, 3); //원본배열, 원본시작점 , 복사배열 , 복사시작점, 복사개수 
		
		for(char k :b) {
			System.out.print(k+" ");
		}
		System.out.println();
	}

}
