package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame {
	
	private final int BUTTON_COUNT = 8; // 버튼 개수
	private JButton[] buttons = new JButton[BUTTON_COUNT];

	private FlowLayout flowLayout;
	
	
	public FlowLayoutEx3() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("FlowLayout 연습");
		setSize(500, 500);
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
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx3();
	}

}
