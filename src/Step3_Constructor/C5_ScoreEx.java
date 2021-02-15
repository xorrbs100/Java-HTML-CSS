package Step3_Constructor;

class Score{
	//이름, 국어,영어,수학
	private String name;
	private int kor, eng, math;
	Score(){}
	Score(String name, int kor, int eng, int math){
		this.name = name; this.kor=kor; this.eng=eng; this.math=math;
	}
	void print() {
		double avg;
		int sum;
		sum=kor+eng+math;
		avg=sum/3.0;
		System.out.println("이름 :"+name +"총점은: "+sum +"점 평균은"+(float)avg+"점 입니다.");
	}
}

public class C5_ScoreEx {

	public static void main(String [] args) {
		Score n1 = new Score("홍길동",99,98,95);
		Score n2 = new Score("이순신",93,94,92);
		
		n1.print();
		n2.print();
		
		
	}
}
