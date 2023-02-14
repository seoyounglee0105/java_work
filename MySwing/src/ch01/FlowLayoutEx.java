package ch01;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

// 배치 관리자 연습 - FlowLayout
// components(버튼, 텍스트 등의 요소)들을 수평, 수직으로 배치하는 역할
public class FlowLayoutEx extends JFrame {
	
	// 멤버변수
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	
	private FlowLayout flowLayout;
	
	// 생성자
	public FlowLayoutEx() {
		// 초기화 값 세팅 (메서드를 통해 역할 분담)
		initData();
		setInitLayout();
	}
	
	public void initData() {
		setTitle("FlowLayout 연습");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		button3 = new JButton("button3");
		button4 = new JButton("button4");
		button5 = new JButton("button5");
		button6 = new JButton("button6");
		
		flowLayout = new FlowLayout(FlowLayout.LEFT, 10, 200);
	}
	
	public void setInitLayout() {
		// 배치 관리자를 설정해보자.
		                                                // 정렬방향(왼쪽), 수평간격, 수직간격     // 정렬방향 기본값 CENTER
		setLayout(flowLayout);  // LEADING == LEFT
		
		//요소 추가
		add(button1); 
		add(button2);
		add(button3);
		add(button4); 
		add(button5);
		add(button6);
		
	}
	
	// 코드 테스트
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
	
}
