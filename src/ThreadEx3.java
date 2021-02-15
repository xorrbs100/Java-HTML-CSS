
class Test3 extends Thread{
	
	Test3(String str){
		super(str);
		
	}
	//스레드코드
	@Override
	public void run() {
		for(int i =0; i<100;i++) {
			System.out.print(getName()+"\t");			//getName()메소드 이름반환
			if(i%10==0) {
				System.out.println();
			}
			
		}
		
	}
	
}
public class ThreadEx3 {

	public static void main(String[] args) {
	
		Test3 t1= new Test3("subA");
		Test3 t2= new Test3("subB");
		t1.start();
		t2.start();
		
	}

}
