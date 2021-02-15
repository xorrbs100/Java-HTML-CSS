package c6_continuebreak;

public class Break2 {

	public static void main(String[] args) {
		int i=0, j=0;
		while (true) {
			i++;
			
			System.out.println("현재의 i값은 ="+i+"입니다.");
			while(true) {
				j++;
				System.out.println("현재의 j값은="+j+"입니다");
				if(j==5) {
					System.out.println("***********");
					break;
				}
			}
			j=0;
			if(i==5) {
				break;
			}
			
		}System.out.println("끝");

	}

}
