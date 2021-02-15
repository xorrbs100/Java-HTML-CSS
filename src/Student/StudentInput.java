package Student;



public class StudentInput {
	String name ;
	int kor,eng,math,com ;
	StudentInput(){}
	StudentInput(String name,int kor,int eng,int math,int com) {
		this.name=name; this.kor=kor; this.eng=eng;this.math=math; this.com=com;
	}
	
	
	public void input() {
		
		
		//System.out.println(name+"의 국어점수: "+kor+"영어점수: "+eng+"수학점수: "+math+"컴퓨터점수 : "+com);
	}

}
