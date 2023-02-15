package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MyKeyEvent2 extends JFrame {
	
	private JTextArea area;  // 키보드로 입력할 수 있음
	
	public MyKeyEvent2() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("키 이벤트");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 프레임 사이즈 조절 불가 설정
		area = new JTextArea();
	}
	
	private void setInitLayout() {
		add(area);
		setVisible(true);
	}
	
	private void addEventListener() {
		KeyListener keyListener;  // 인터페이스
		// 인터페이스는 기본적으로 new할 수 없다.
		// 하지만 인터페이스를 구현 클래스로 변형해서 사용할 수 있다
		
		// 구현 클래스 
		// : 인터페이스 + 추상 클래스를 '구현 클래스'로 만들 수 있다.
		area.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println(e.getKeyCode());
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	
	}
	
}
