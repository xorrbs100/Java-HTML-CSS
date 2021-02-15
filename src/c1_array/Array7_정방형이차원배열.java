package c1_array;

public class Array7_정방형이차원배열 {

	public static void main(String[] args) {
		String a [][] = {{"이순신","홍길동","강감찬"},{"박유정","홍예훈","김효진"},{"김형주","인정빈","임택균"}};
		
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
		}System.out.println();
	}
	
		char b [][] = {{'a', 'b','c','d','e'},{'f','g','h','i','j'}};
		
		  for(int i=0; i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}System.out.println();
		  }	
	}
	
}
