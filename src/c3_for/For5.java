// 주사위 두개의 합이6이디는 경우만출력

package c3_for;

public class For5 {

	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i+j==6) {
					System.out.println(i+"+"+j+"="+(i+j));
				}
			}
		}
	}

}
