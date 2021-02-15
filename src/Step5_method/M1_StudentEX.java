package Step5_method;

class Student{
	String name;
	int kor, eng ,math;
	//생성자로초기화
	Student(){}
	Student(String name,int kor, int eng, int math){
		this.name=name; this.kor=kor; this.eng=eng; this.math=math;
	}
	//총점메소드
	int sum(){
		int sum;
		sum = kor+eng+math;
		return sum;
	}
	//평균
	float avg() {
		float avg;
		avg = (kor+eng+math)/3.0f;
		return avg;
	}
	//출력
	void print() {
		System.out.println(name+"의 총점은 : "+sum()+"   평균은 : "+avg() );
	}	
}
public class M1_StudentEX {

	public static void main(String [] args) {
		
		//배열을 만들고
		Student S1[]= new Student[10];
		
		//배열속에 객체를 넣어본다
		Student st1=new Student("홍길동",10,20,30);//객체변수 생성해서 저장
		S1[0]=st1;
		Student st2=new Student("이순신",40,50,60);
		S1[1]=st2;
		S1[2]=new Student("강감찬",70,80,90);//객체생성해서 직접저장
		S1[2].print();
		
		
	}	
}
