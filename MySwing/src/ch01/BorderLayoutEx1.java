package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx1 extends JFrame{
	// BorderLayout : 컴포넌트들을 동 서 남 북 센터에 
	
	JButton button1 = new JButton("동");
	JButton button2 = new JButton("서");
	JButton button3 = new JButton("남");
	JButton button4 = new JButton("북");
	JButton button5 = new JButton("센터");
	
	public BorderLayoutEx1() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("borderLayout 연습 1");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void setInitLayout() {
//		setLayout();  // 레이아웃 기본값 : BorderLayout
		
		// borderLayout은 매개변수 값 하나를 더 추가시킬 수 있다. (방향 지정 가능)
		add(button1, BorderLayout.EAST);
		add(button2, BorderLayout.WEST);
		add(button3, BorderLayout.SOUTH);
		add(button4, BorderLayout.NORTH);
		add(button5, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx1();
	}
	
}
