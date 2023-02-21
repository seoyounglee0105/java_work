package ex05;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bubble extends JLabel {

	// 버블의 위치 상태 (플레이어에 의존)
	private int x;
	private int y;

	// 버블의 움직임 방향 상태 (플레이어에 의존)
	private boolean left;
	private boolean right;
	private boolean up;

	// 적군을 맞춘 상태 (0 : 기본 물방울, 1 : 적을 가둔 물방울)
	private int state;

	// 이미지
	private ImageIcon bubble; // 기본 물방울 이미지
	private ImageIcon bubbled; // 적을 가둔 물방울 이미지
	private ImageIcon bomb; // 터진 물방울 이미지

	private Player player;
	
	// Bubble은 Player에 의존하고 있다.
	// 생성자
	public Bubble(Player player) {
		this.player = player;
		initData();
		setInitLayout();
	}

	private void initData() {
		// 이미지 인스턴스화
		bubble = new ImageIcon("images/bubble.png");
		bubbled = new ImageIcon("images/bubbled.png");
		bomb = new ImageIcon("images/bomb.png");
		
		// 초기 값 세팅 (생략 가능)
		left = false;
		right = false;
		up = false;
		state = 0;
	}

	private void setInitLayout() {
		// 플레이어가 있는 위치에 태어나야 함
		x = player.getX();
		y = player.getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
