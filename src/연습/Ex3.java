//스캐너로 문장을 입력받아서 공백으로 분리된 어절이 몇개나 들어있는지 카운트하고 분리된 토큰을 출력 입력받은 단어가 "그만"이라고 "종료합니다" 하고종료
package 연습;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex3 {

   public static void main (String [] args) {
      Scanner sc = new Scanner(System.in);
      StringTokenizer st;
      
      while(true) {
    	  System.out.println("문장을 입력해 주세요");
	      String a = sc.nextLine();
	       if(a.equals("그만")) {
	            System.out.println("종료합니다");
	            break;
	      
	         }
	      st = new StringTokenizer(a, " "); 
	      int num = st.countTokens();   
	      System.out.println("어절수 : "+num);
	         for(int i=0;i<num;i++) {
	         System.out.println(st.nextToken());      
	      }
	       System.out.println();
         
      }sc.close();
   }
      
}




