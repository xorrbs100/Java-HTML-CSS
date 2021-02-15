import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx1 extends JFrame{

	public MenuEx1() {
		setTitle("윈도우창만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		creatMenu();
		Container c = getContentPane();
		setSize(250,200);
		setVisible(true);
	}
	void creatMenu() {
		JMenuBar jb = new JMenuBar();
		JMenu jm = new JMenu("File");
		JMenuItem ji1 = new JMenuItem("New");
		JMenuItem ji2 = new JMenuItem("Open File");
		JMenuItem ji3 = new JMenuItem("Close");
		JMenuItem ji4 = new JMenuItem("Save");
		JMenuItem ji5 = new JMenuItem("Refresh");
		JMenuItem ji6 = new JMenuItem("Run");
		jm.add(ji1);
		jm.add(ji2);
		jm.add(ji3);
		jm.add(ji4);
		jm.add(ji5);
		jm.add(ji6);
		jb.add(jm);
		setJMenuBar(jb);
		
		
	}
	public static void main(String args[]) {
		new MenuEx1();
	}
}
