package Collection;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student1{
	private String id,name;
	private int kor,eng,math;
	Student1(){}
	Student1(String id , String name , int kor, int eng, int math){
		this.id=id;this.name=name;this.kor=kor;this.eng=eng;this.math=math;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return kor+eng+math;
	}
	public float getAvg() {
		return getTotal()/3;
	}
	public void print() {
		System.out.print(id+"학번 "+name+"의 성적: ");
	}
	
}

public class HashMapEx3 {

	public static void main(String[] args) throws IOException { //입출력이여서예외처리
		
		HashMap<String, Student1> st = new HashMap<>();
		st.put("1",new Student1("1" , "홍길동", 80, 90, 100));
		st.put("2", new Student1("2", "이순신", 90, 90, 75));
		st.put("3", new Student1("3", "강감찬", 80, 100, 95));

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("메뉴 번호를 눌러주세요 1 학생등록, 2 검색, 3 삭제, 0 종료");
			int q= Integer.parseInt(bf.readLine());
			if(q==0) {
			System.out.println("종료합니다"); break;}
			while(q==1) {
				System.out.println("s번 학생을 등록합니다 s,학번,이름,국어점수,영어점수,수학점수 순으로 입력해주세요 종료는0");
				String s = bf.readLine();
				if(s.equals("0")) {
					break;
				}
				
				String b = bf.readLine();
				String c = bf.readLine();
				int d= Integer.parseInt(bf.readLine());
				int e= Integer.parseInt(bf.readLine());
				int f= Integer.parseInt(bf.readLine());
				st.put(s, new Student1(b,c,d,e,f));
				Student1 a = st.get(s);
			}
			
			while(q==2) {
				System.out.println("학번을 입력하세요 종료는 0");
				String s = bf.readLine();
				if(s.equals("0")) {
					System.out.println("종료합니다");
					break;
				}
				Student1 a = st.get(s);
				if(a==null) {
					System.out.println("없음");
				}else {
					a.print();
					System.out.println(" 수학 : "+a.getMath()+" 국어 : "+a.getKor()+" 영어 : "+a.getEng()+ " 합계 : "+ a.getTotal()+" 평균 : "+a.getAvg());
				}
			}
			while(q==3){
				System.out.println("학번을 입력하세요 종료는 0 ");
				String s = bf.readLine();
				if(s.equals("0")) {
					System.out.println("종료합니다");
					break;
				}
				Student1 a = st.remove(s);
				if(a==null) {
				System.out.println("해당학생 없음");
				}else {
					st.remove(s);
					System.out.println(a.getName()+"가 삭제 되었습니다");
				}
			}
		
		}
		bf.close();
		System.out.println("등록된 학생수는 " +st.size());
		/*for(int i= 1;i<=st.size();i++) {
			String k = String.valueOf(i);
			st.get(k);
			Student1 a = st.get(k);
			a.print();
		}*/
		for(String key : st.keySet()) {
			st.get(key).print();
		}
		//st.clear();
		
	}
 
        
}


