package Student;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;
import java.util.Vector;

public class StudentTest  {

	public static void main(String[] args) throws MissingFormatArgumentException{
		
		Vector<StudentOutput> v= new Vector<StudentOutput>();
		
		Scanner sc = new Scanner(System.in);
		Login lo = new Login();
		lo.BooleanloginCheck();
		if(lo.loginBool==true) {
			while(true) {
				System.out.println("메뉴를 입력하세요 1 학생정보입력 2 학생정보출력 3 프로그램종료");
				int a = sc.nextInt();
				if(a==3) {
					System.out.println("종료합니다");
					break;
				}while(a==1) {
					int num=0;
					System.out.println("학생 정보를 등록합니다 입력순서는 이름 국어점수 영어점수 수학점수 컴퓨터점수 등록 종료는 0번");
					String name = sc.next();
					if(name.equals("0")) {
						System.out.println("종료합니다");
						break;
					}
					int kor = sc.nextInt();
					int eng = sc.nextInt();
					int math = sc.nextInt();
					int com= sc.nextInt();
					v.add(new StudentOutput(name, kor, eng, math, com));
					StudentInput st=  v.get(num);
					st.input();
					num++;
					System.out.println("입력된 학생수는 "+num+"입니다");
				}
				 while(a==2) {
					 System.out.println("학생 정보를 출력합니다 종료는q 계속은 아무키나 눌러주세요");
					 String q=sc.next();
					 if (q.equals("q")) {
						 System.out.println("종료합니다");
						 break;
					 }
					 try{
					 System.out.println("학생의 인덱스번호를 입력하세요 0번부터 ");
					 int num=sc.nextInt();
					 
					 StudentOutput st = v.get(num);
					 st.input();
					 st.print();
					 }
					 catch(ArrayIndexOutOfBoundsException e) {
						 System.out.println("등록된 학생이 없습니다");
					 }
					 catch(InputMismatchException e) {
						 System.out.println("숫자만 입력해주세요");
					 }
				  }
				
			}

		}else System.out.println("로그인 3회 오류로시스템을 종료합니다");
		
	}

}
