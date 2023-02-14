package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

// 좌표 기반으로 컴포넌트 배치
public class NoLayoutEx1 extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	public NoLayoutEx1() {
		initData();
		setInitLayout();
		
	}
	
	public void initData() {
		setTitle("좌표 기반 연습");
		setSize(1_000, 1_000);  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 좌표 기반으로 세팅을 하면, 각 컴포넌트에 크기를 지정해주어야 함. (기본값 = 0)
		button1 = new JButton("button1");
		button1.setSize(100, 100);  // 가로길이, 세로길이
		button2 = new JButton("button2");
		button2.setSize(150, 50);
		button3 = new JButton("button3");
		button3.setSize(200, 30);
		
	}
	
	public void setInitLayout() {
		setLayout(null);  // 좌표 기반으로 컴포넌트 배치
		// 왼쪽 상단 꼭짓점이 (0, 0)
		
		// 요소 배치 시, 입력된 좌표는 요소의 왼쪽 위 꼭짓점의 좌표에 해당함.
		button1.setLocation(100, 100);  // x좌표, y좌표
		add(button1);
		
		button2.setLocation(200, 150);  // x좌표, y좌표
		add(button2);
		
		button3.setLocation(450, 200);  // x좌표, y좌표
		add(button3);

		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new NoLayoutEx1();
	}
	
}
