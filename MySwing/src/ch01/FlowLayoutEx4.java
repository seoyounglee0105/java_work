package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx4 extends JFrame {

	// 멤버 변수 선언
	private JButton[] buttons = new JButton[5]; // 배열 선언

	public FlowLayoutEx4() {

		initData();
		setInitLayout();

	}

	private void initData() {
		setTitle("배열 활용");
		setSize(600, 600);
		// static 변수&함수는 클래스 이름으로도 접근 가능
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 버튼 인스턴스화 반복문
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + (i + 1));
		}
	}

	private void setInitLayout() {
		// 배치 관리자 (레이아웃)
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		
		// 버튼 추가 반복문
		for (int i = 0; i < buttons.length; i++) {
			// 방어적 코드 작성을 염두에 둘 것 (오류가 발생할 가능성이 있음)
			add(buttons[i]);
		}
				
		// 가장 나중에 실행 (순서에 따라 오류가 발생할 수 있음) -> 버튼 인스턴스화 이전에 호출하면 버튼이 보이지 않음
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutEx4();
	}
	
}
