package C3_Print;

public class Print1 {

	public static void main(String args[]) {
		//print
		System.out.print("Hello \n"); // \n은 줄바꿈
		System.out.print("Java\n");
		//println
		System.out.println("hello");
		System.out.println("Java");
		//printf
		System.out.printf("%c\n",'가');
		System.out.printf("%d\n",100);
		System.out.printf("%s\n","안드로이드");
		System.out.printf("%.2f\n",101.23);
		
		//(과목전체의)평균은 (90.123)점입니다.
		System.out.printf("%s의 평균은 %.3f점입니다\n","과목전체",90.123 );
		
		//영어 : 87.5 점입니다
		System.out.printf("%s : %.1f입니다\n", "영어" ,87.5);
		
	}
}
