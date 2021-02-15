package Collection;

import java.util.HashMap;
import java.util.Scanner;

//학생 신상카드
class Student{
	private String id,name;
	private int age;
	public Student(String id, String name, int age ){
		this.id=id; this.name=name; this.age=age;		
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class HashMapEx2 {

	public static void main(String[] args) {
		//학생클래스저장
		HashMap<String, Student> card = new HashMap<>();
		//저장
		card.put("홍길동",new Student("1","홍길동",20));
		card.put("강감찬", new Student("2", "강감찬", 21));
		card.put("이순신", new Student("3", "박성진", 100));
		//검색
		Scanner sc = new Scanner(System.in);
		System.out.println(card.get("이순신").getName());
		//exit가 입력될때까지 계속검색
		while(true) {
			System.out.println("key를 입력하세요");
			String key=sc.next();
			if(key.equals("exit")) {
				System.out.println("종료합니다");
				break;
			}
			Student st = card.get(key);
			if(st==null) {
				System.out.println("없음");
			}else System.out.println("id : "+st.getId()+" 이름 : "+st.getName()+" 나이 : "+st.getAge());
		}
		sc.close();
	}

}
