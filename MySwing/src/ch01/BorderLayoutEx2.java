package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx2 extends JFrame{
	// BorderLayout : 컴포넌트들을 동 서 남 북 센터에 
	
	JButton[] buttons = new JButton[5];
	
	// 배열 선언과 동시에 초기화
	String[] directions = {BorderLayout.EAST, BorderLayout.WEST, 
			BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.CENTER};
	
	public BorderLayoutEx2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("borderLayout 연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(directions[i]);
		}
		
	}
	
	private void setInitLayout() {
//		setLayout();  // 레이아웃 기본값 : BorderLayout
		
		// 버튼 추가 반복문
		for (int i = 0; i < buttons.length; i++) {
			// 방어적 코드 작성을 염두에 둘 것 (오류가 발생할 가능성이 있음)
			add(buttons[i], directions[i]);
		}
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx2();
	}
	
}
