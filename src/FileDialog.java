import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileDialog extends JFrame {

	JLabel imgLabel;
	public FileDialog() {
		setTitle("FileDialog");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		imgLabel = new JLabel();
		c.add(imgLabel);
		//메소드호출
		creatMenu();
		
		setSize(600,400);
		setVisible(true);
		
	}
	void creatMenu() {
		JMenuBar jbar = new JMenuBar();
		JMenu jm = new JMenu("File");
		JMenuItem jt = new JMenuItem("OPEN");
		jt.addActionListener(new OpenListener());
		jm.add(jt);
		jbar.add(jm);
		setJMenuBar(jbar);
	}
	class OpenListener implements ActionListener{
		JFileChooser jc;
		public OpenListener() {
			//1. 파일 탐색기창을 생성
			jc=new JFileChooser(); //파일탐색기
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			//2. 필터를 활용해서 파일의 종류내용 설정
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG&GIF이미지", "jpg","gif");
			//3. 파일탐색창에 필터부착
			jc.setFileFilter(filter);
			//4. 파일창열기
			int ret=jc.showOpenDialog(null);  // null - 전체화면을 기준으로 위치를 잡게된다.
			//5. 비정상처리 : APPROVE_OPTION - 정상종료 ,!=APPROVE_OPTION(비정상종료)
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다","경고",JOptionPane.WARNING_MESSAGE);
				return;
			}
			//6.정상종료 - 파일을 선택하고 종료된 경우
			String filePath = jc.getSelectedFile().getPath();		//파일경로 가져오기
			imgLabel .setIcon(new ImageIcon(filePath));				//선택파일이 미지를 레이블에 출력
			System.out.println(filePath);
			pack();				//이미지에 맞춰서 프레임 크기조절
			
		}	
	}
	public static void main(String[] args) {
		new FileDialog();

	}

}
