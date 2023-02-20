package ex01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {
	
	private int x;
	private int y;
	private ImageIcon playerR, playerL;
	
	public Player() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
	}
	
	private void setInitLayout() {
		// 초기 위치
		x = 55;
		y = 535;
		
		// 좌표 기반 -> JLabel 크기 지정 필요
		setSize(50, 50);
		setLocation(x, y);
		// JLabel에 아이콘을 세팅하는 메서드
		setIcon(playerR);  // ImageIcon 타입을 매개변수로 받음
		
		setVisible(true);
	}

	@Override
	public void left() {
		// 이미지 변경
		setIcon(playerL);
		// 왼쪽으로 이동
		x -= 10;
		setLocation(x, y);
		
	}

	@Override
	public void right() {
		// 이미지 변경
		setIcon(playerR);
		// 오른쪽으로 이동
		x += 10;
		setLocation(x, y);
	}

	@Override
	public void up() {
		System.out.println("점프");
		
	}

	@Override
	public void down() {
		System.out.println("p down");
		
	}
	
}
