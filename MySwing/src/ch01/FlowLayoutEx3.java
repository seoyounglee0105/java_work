package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame {

	// 멤버 변수를 선언할 수 있는가
	// 배열을 활용할 수 있는가
	// 생성자 + 메서드를 호출
	// for 문을 활용할 수 있는가
	// GUI 프로그램 익숙해지기
	
	private final int BUTTON_COUNT = 8; // 버튼 개수
	private JButton[] buttons = new JButton[BUTTON_COUNT];

	private FlowLayout flowLayout;
	
	
	public FlowLayoutEx3() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("FlowLayout 연습 3");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 버튼 인스턴스화
		for (int i = 0; i < BUTTON_COUNT; i++) {
			buttons[i] = new JButton("버튼 " + (i + 1));
		}
		
		flowLayout = new FlowLayout(FlowLayout.LEFT, 100, 100);
		
	}
		
	private void setInitLayout() {
		setLayout(flowLayout);
		
		// 버튼 추가
		for (int j = 0; j < BUTTON_COUNT; j++) {
			add(buttons[j]);
		}
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx3();
	}

}
