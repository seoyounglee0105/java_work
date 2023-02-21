package ex06;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/// +++ 인터페이스 구현
public class Bubble extends JLabel implements Moveable {

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
		initThread();
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

	// 굳이 거품은 쓰레드를 방향마다 만들어줄 필요가 없다.
	
	// +++ 거품이 날아가게 하기
	private void initThread() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// player의 현재 움직임 상태를 이용해서 거품의 방향을 설정함
				if (player.getpWay() == PlayerWay.LEFT) {
					// 왼쪽 발사
					left();
				} else {
					// 오른쪽 발사
					right();
				}
			}
		}).start();
	} // end of right method
	
	@Override
	public void left() {
		
		left = true;
		for (int i = 0; i < 400; i++) {
			x--;
			setLocation(x, y);
			// sleep
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // end of for
		// 왼쪽 이동이 끝나면 위로
		up();
	} // end of left method

	@Override
	public void right() {
		
		right = true;
		for (int i = 0; i < 400; i++) {
			x++;
			setLocation(x, y);
			// sleep
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // end of for
		// 오른쪽 이동이 끝나면 위로
		up();
	} // end of right method

	@Override
	public void up() {
		
		up = true;
		while (true) {
			y--;
			setLocation(x, y);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
