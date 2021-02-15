/*
      *  i=0,j4,j3,j2,j1,k0
     **  i=1,j4,j3,j2,k1,k0
    ***	 i=2 j4,j3,k2,k1,k0
   ****  i=3 j4,k3,k2,k1,k0
  *****	 i=0 k4,k3,k2,k1,k0
  ****	 i=1 k4,k3,k2,k1,j0
  ***	 i=2 k4,k3,k2,j1,j0
  **	 i=3 k4,k3,j2,j1,j0
  *   	 i=4 k4,j3,j2,j1,j0
 */



package 연습문제;

public class Ex9_모양찍기 {

	public static void main(String[] args) {
		
		for(int i=0;i<4;i++) {
			
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print("*");
			}
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
