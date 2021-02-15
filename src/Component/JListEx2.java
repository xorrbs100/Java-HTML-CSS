//이미지

package Component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.font.ImageGraphicAttribute;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class JListEx2 extends JFrame{

	public JListEx2() {
		setTitle("이미지리스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		String[] fruits = {"apple","banana","mango","grape","melon",
				"watermelon","orange","pear","peach","berry",
				"mandarin"};
		ImageIcon [] img = {new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_01.jpg"),
				new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_04.jpg"),
				new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_05.jpg"),
				new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_06.jpg"),
				new ImageIcon(".\\IMGE\\KaKaoTalk_20201007_093259835_07.jpg"),
		};
		JList<ImageIcon> imglist = new JList<>(img);//=imglist.setListData(img);
		JScrollPane js = new JScrollPane(imglist);
		JList<String> fruitslist= new JList<String>(fruits);
		JScrollPane js1=new JScrollPane(fruitslist);
		c.add(js);
		c.add(js1);
		setSize(700,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new JListEx2();
		

	}

}
