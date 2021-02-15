package Step5_method;

public class Manager {

	private String name,part;
	private int age;
	
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	void setPart(String part) {
		this.part=part;
	}
	String getPart() {
		return part;
	}
	void setAge(int age) {
		this.age=age;
	}
	int getAge() {
		return age;
	}
	void printMG() {
		System.out.println(part+" " +name+" "+age+" ");
		System.out.println("*************************");
	}
	
}
