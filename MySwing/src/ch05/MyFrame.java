package ch05;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

	// 그림 위에 그림 올리기
	// JLabel을 이용한 이미지 겹치기
	
	private JLabel backgroundMap;
	private JLabel player;
	
	public MyFrame() {
		initData();
		setInitLayout();
		
	}
	
	private void initData() {
		setTitle("이미지 겹치기 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Icon icon = new ImageIcon("images/background1.png");
		backgroundMap = new JLabel(icon);
		backgroundMap.setSize(500, 500);
		
		player = new JLabel(new ImageIcon("images/image3.png"));
		player.setSize(200, 200);
		
	}
	
	private void setInitLayout() {
		setLayout(null);
		backgroundMap.setLocation(0, 0);
		player.setLocation(200, 200);
		
		// add 실행의 흐름 : 앞쪽에 넣을 이미지에 대한 add 메서드를 먼저 호출하기
		add(player);
		add(backgroundMap);
		
		setVisible(true);
		
	}
	
}
