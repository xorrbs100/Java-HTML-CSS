package Step7_inheritance;

class Person2{
	private String name;
	private int age;
	Person2(){}
	Person2(String name, int age){
		this.name=name; this.age=age;
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
	public void print() {
		System.out.println("------------------");
		System.out.println("이름 : "+name);
		System.out.println("나이 :"+age);
	}
}
class Student2 extends Person2{
	private String sno;
	public Student2(String name, int age, String sno) {
		super(name,age);		
		this.sno=sno;
	}public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public void print() {
		super.print();
		System.out.println("학번 : "+sno);
	}
}
class Teacher2 extends Person2{
	private String sub;
	public Teacher2(String name, int age, String sub) {
		super(name,age);
		this.sub=sub;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public void print() {
		super.print();
		System.out.println("과목 : "+sub);
	}
}
class Manager2 extends Person2{
	private String Part;
	public Manager2(String name, int age, String part) {
		super(name,age);
		this.Part=part;
	}
	public String getPart() {
		return Part;
	}
	public void setPart(String part) {
		Part = part;
	}
	public void print() {
		super.print();
		System.out.println("부서 : "+Part);
	}
}
public class E16_오버라이딩활용 {
	public static void main(String []args) {
		Person2 [] p = new Person2[5];
		//업캐스팅
		p[0]=new Student2("박유정",10,"1111");
		p[1]=new Teacher2("박인희", 11, "java");
		p[2]=new Manager2("홍길동", 20, "영업");
		p[3]=new Student2("박유정", 12, "1242");
		p[4]=new Teacher2("인정빈", 13, "JAVA");
		
		for(Person2 i : p) {
			i.print(); // 오버라이딩된 자식print()
			if(i instanceof Manager2) {
				Manager2 m =(Manager2)i;
				System.out.println(m.getPart());
			}
		}
	}
}
