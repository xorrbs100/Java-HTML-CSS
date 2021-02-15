package Step5_method;

public class PersonEx {

	public static void main(String []artgs) {
		
		Student1 st=new Student1();
		Manager ma=new Manager();
		Teacher tc=new Teacher();
		
		st.setName("수지");
		st.setAge(21);
		st.setBan("1반");
		st.printSt();
		
		tc.setName("홍길동");
		tc.setAge(35);
		tc.setSubject("java");
		tc.printTc();
		
		ma.setName("원빈");
		ma.setAge(30);
		ma.setPart("화장실청소");
		ma.printMG();

	}
}
