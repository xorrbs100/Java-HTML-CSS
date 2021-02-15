package c1_if;

import java.util.Scanner;

public class If2_Score {
	public static void main (String args[]) {
		
		String grade = null;
		System.out.println("성적을 입력해 주세요>>>");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		//90이상 A 80이상 B, 70이상 C, 그외 D  ---> 95이상 A+,A0, B+ B0,,,
		
		if(score>=90) {
			if(score>=97) {
				grade="A+";
			}else if(score<94){
				grade = "A-";
			}else {
				grade="A0";
			}
			
			
		}else if(score>=80) {
			if(score>=87){
				grade = "B+";
				
			}else if(score>=84){
				grade = "B-";
				
			}else {
				grade ="B0";
			}
		
		}else if(score>=70) {
			if(score>=67) {
				grade = "C+";
			}else if(score >=64) {
				grade = "C-";
			}else {
				grade = "C0";
			}
		}else {
			grade = "D";
			
		}
		System.out.println("점수는 "+score +"점이고 학점은 "+grade+" 입니다");
		
	sc.close();	
	}
}
