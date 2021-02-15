/*
 *        *
 *        **
 *        ***
 *        ****
 *        
 *        *****
 *        ****
 *        ***
 *        **
 *        *
 *            *
 *           **
 *          ***
 *         ****
 *        *****
 *       ******
 */




package c3_for;

public class For4 {
	public static void main(String args[]) {
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}System.out.println();
		}System.out.println();
		for(int i=5;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();
		for(int i=0;i<6;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print(" ");}
			for(int m=0;m<6-i;m++) {
				System.out.print("*");
				}	
			System.out.println();
		}
	}
}


