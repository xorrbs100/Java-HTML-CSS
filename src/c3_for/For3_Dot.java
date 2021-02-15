package c3_for;

public class For3_Dot {

	public static void main(String[] args) {
	
		for(int i=0; i<10; i++) {
			
			System.out.printf("*");
			
		}
		System.out.println();
		for(int j=10; j>1; j--) {
			System.out.printf("*");
		}
		System.out.println();
		for(int i=0; i<=10;i+=2) {
			System.out.printf("*");
		}
		System.out.println();
		//증감조건 두개이상
		for(int i=1, j=1; i<=10 &&j<=9; i++,j++) {
			System.out.println("("+i+","+j+")"+"i+j="+(i+j));
			
		}
	}

}
