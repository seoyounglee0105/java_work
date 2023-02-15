package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MyKeyFrame extends JFrame implements KeyListener{

	private JTextArea area;
	private JLabel label;
	
	
	public MyKeyFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("키 이벤트 연습하기");
		setSize(500, 500);
		setDefaultCloseOperation(3);
		area = new JTextArea();
		label = new JLabel();
	}
	
	private void setInitLayout() {
		add(area);
		add(label);
		setVisible(true);
	}
	
	private void addEventListener() {
		area.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// 특정 숫자를 맞히는 게임 (up down 게임)
		if (e.getKeyChar() > '5') {
			System.out.println("현재 수보다 down"); // 콘솔 창
			label.setText("현재 수보다 down"); 
		} else if (e.getKeyChar() < '5') {
			System.out.println("현재 수보다 up");
			label.setText("현재 수보다 up"); 
		} else if (e.getKeyChar() == '5') {
			System.out.println("정답입니다!");
			label.setText("정답입니다!"); 
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	// 메인 함수
	public static void main(String[] args) {
		new MyKeyFrame();
	} // end of main
	
}
