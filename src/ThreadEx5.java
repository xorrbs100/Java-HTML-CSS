import javax.swing.JOptionPane;

public class ThreadEx5 {

	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i<101;i++) {
			System.out.print(i+" ");
			if(i%10==0) {
				System.out.println();
				Thread.sleep(100);
			}
			
		}
		String name = JOptionPane.showInputDialog("니이름이 뭐꼬~?"); //팝업입력창
		System.out.println(name);
		Thread.interrupted();	//스레드강제종료
			
	}

}
