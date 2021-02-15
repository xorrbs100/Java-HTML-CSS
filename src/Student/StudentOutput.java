package Student;

import java.util.Vector;

public class StudentOutput extends StudentInput {
	StudentOutput(){}
	StudentOutput(String name, int kor, int eng, int math, int com) {
		super(name, kor, eng, math, com);
	}
	Vector<StudentInput> v = new Vector<StudentInput>();
	
	int size=v.size();
	int sum=super.kor+super.eng+super.math+super.kor;
	int avg = sum/4;
	@Override
	public void input() {
		super.name=name;super.kor=kor;super.eng=eng;super.math=math;super.com=com;
		System.out.println(name+"의 국어점수: "+kor+"영어점수: "+eng+"수학점수: "+math+"컴퓨터점수 : "+com);
	}
	public void print() {
		System.out.println("총접은 :  "+sum+"평균은 : "+avg);
	}

}