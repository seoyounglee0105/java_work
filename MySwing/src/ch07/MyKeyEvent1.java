package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MyKeyEvent1 extends JFrame implements KeyListener {
	
	private JTextArea area;  // 키보드로 입력할 수 있음
	
	public MyKeyEvent1() {
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
		area.addKeyListener(this);
	}

	// 문자 키 입력에 대해 반응함
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped : " + e.toString());
		
	}

	// 모든 키 입력에 대해 반응함
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed : " + e.toString());
		// 문제 : 제어문을 활용해서 방향키 위가 눌러졌을 때 콘솔에 up이라는 문자열을 출력
		// 방향키 왼쪽, 오른쪽, 아래
		
		// 위일 때
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("up"); // 콘솔 창
//			area.setText(area.getText() + "\n위쪽");
			area.append("\n위쪽"); // 프레임에 출력
			// 오른쪽일 때
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("right");
//			area.setText(area.getText() + "\n오른쪽");
			area.append("\n오른쪽");
		// 아래일 때
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("down");
//			area.setText(area.getText() + "\n아래쪽");
			area.append("\n아래쪽");
		// 왼쪽일 때
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("left");
//			area.setText(area.getText() + "\n왼쪽");
			area.append("\n왼쪽");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
//		System.out.println("keyReleased : " + e.toString());
		
	}
	

}
