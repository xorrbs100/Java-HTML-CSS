package 백준;

public class no_1747 {
	public static void chk(String num) {
		int i = 2; // i : 나눌 대상
		int n = Integer.parseInt(num);
		boolean isPrime = true;
		while (i <= n) {
			isPrime = true;
			for (n = 2; n < i; n++) {
				if (i % n == 0) {
					isPrime = false;
					break;
				}
				continue;
			}
			if (isPrime == true)
			{
				String str = String.valueOf(i);
				int j = str.length() - 1;
		        for (int k = 0; k <str.length() / 2; k++, j--) {
		            if (str.charAt(k) != str.charAt(j)) {
		               
		            }
		            System.out.println(str);
		        }
			}
			i++;
		}
	}
	public static void main(String [] args) {
		chk("42324");

	}	
}

