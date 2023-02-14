package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame {

	// 1단계 : JButton 2개 생성
	// 배치 관리자 FlowLayout 멤버 변수로 선언
	// 화면에 Components를 그려주세요

	// 배열로 선언해보기
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	
	JButton[] buttons = new JButton[8]; 

	private FlowLayout flowLayout;
	
	public FlowLayoutEx2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("FlowLayout 연습2");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 버튼 인스턴스화를 for문으로 간소화
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼" + (i + 1));
		}
		
		flowLayout = new FlowLayout(FlowLayout.RIGHT, 20, 20);
	}
	
	private void setInitLayout() {
		setLayout(flowLayout);

		// 버튼 add를 for문으로 간소화
		for (int j = 0; j < buttons.length; j++) {
			add(buttons[j]);
		}
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx2();
		
	}
	
}
