package c5_dowhile;

public class D2_gugudan {

	public static void main(String args[]) {
		int i=1, j=1;
		
		do {
			System.out.println(i+"단 시작");  
			do {
				System.out.println(i+"*"+j+"="+(i*j));
				j++;
			}while(j<10);
			
			i++;
			j=1;
		}while(i<10);
		
	}
}
