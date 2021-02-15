/*
 	KeyEvent - KeyListener
 	
 		1. 특징  .응용프로그램내에 현재 Focus가진 컴포넌트가 키 입력을 독점한다.
 			.키를 입력하더라도 포커스를 가지고 있지않다면 Key이벤트를 받을 수 없다.
 			.포커스를 가진 컴포넌트에서 이벤트가 발생한다.
 		
 		2. 포커스를 주는 방법
 			. setVisible(true) 다음코드 아래에.
 			. setFocusable(true)
 			. requestFocus() 코드를 작성한다. 
		3. 자판은 두가지로 분류된다.
			. 문자자판 (유니코드) : KeyPressed->KeyReleased -> KeyTyped - 이벤트 3번발생
			. 그외 자판		 :     "			"     		(x)    - 이벤트 2번발생
 		4. 자판에는 3가지 이름이 있다.
 			. 코드값 : getKeyCode(), KeyEvent.가상키  
 			. 문자값 : getKeyChar()
 			. 이름값 : getKeyText(keyCode);
 		5. 가상키(VK_)
 			. VK_0,,,,,VK_9
 			. VK_A,,,,,VK_Z
 			. VK_F1,,,,VK_F24
 			. VK_HOME/END/PGUP/PGDN
 			. VK_LEFT/RIGHT/UP/DOWN
 */

package Listener;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class KeyListener1 extends JFrame{
	JTextField te1,te2,te3;
	public KeyListener1() {
		setTitle("KeyListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel c = new JPanel();
		setContentPane(c);
		c.setLayout(new GridLayout(2,3));
		c.add(new JLabel("자판문자",JLabel.CENTER));
		c.add(new JLabel("자판코드",JLabel.CENTER));
		c.add(new JLabel("자판이름",SwingConstants.CENTER));
		te1 = new JTextField();
		te1.setBackground(Color.ORANGE);
		te2 = new JTextField();
		te2.setBackground(Color.GREEN);
		te3 = new JTextField();
		te3.setBackground(Color.RED);
		//리스너 부착
		te1.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar=e.getKeyChar();
				te1.setText(Character.toString(keyChar));
				int keyCode=e.getKeyCode();
				te2.setText(Integer.toString(keyCode));
				String s = KeyEvent.getKeyText(e.getKeyCode());
				te3.setText(s);
			}
		});
		te2.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {
			
			}
		});
		te3.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {
			
			}
		});
		c.add(te1);
		c.add(te2);
		c.add(te3);
		
		setSize(300,200);
		setVisible(true);
		//KeyListener사용시 포커스 설정필요
		c.setFocusable(true);
		c.requestFocus();
	}
/*	class MyKeyListener extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			//자판의 문자처리 getKeyChar
			char keyChar=e.getKeyChar();
			te1.setText(Character.toString(keyChar));	//스트링 타입으로
			//자판의 코드처리 getKeyCode
			int keyCode=e.getKeyCode();
			te2.setText(Integer.toString(keyCode));		//int->String
			//자판의 이름처리 getKeyText(keyCode)
			String s = KeyEvent.getKeyText(e.getKeyCode());
			te3.setText(s);
			
		}
		
	}*/
	public static void main(String[] args) {
		new KeyListener1();

	}

}
