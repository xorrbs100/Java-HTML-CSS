//구구단
package c4_while;

public class While3 {

	public static void main(String[] args) {
		int i=1, j=1;
		
		while(i<10) {
			System.out.println(i+"단 시작");
			while(j<10) {
				
				System.out.println(i+"*"+j+"="+i*j);
				j++;
				
			}
			
		i++;	
		j=1;// ☆ j값 초기화 안하면 두번째와일문으로 안들어감
			
		}

	}

}
