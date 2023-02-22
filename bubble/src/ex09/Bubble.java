package ex09;

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
	private BackgroundBubbleService backgroundBubbleService;
	
	// Bubble은 Player에 의존하고 있다.
	// 생성자
	public Bubble(Player player) {
		this.player = player;
		initData();
		setInitLayout();
		backgroundBubbleService = new BackgroundBubbleService(this); // 코드 위치에 따라 nullpointer ~ 뜰 수 있으니 주의
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
				clearBubble();
			}
		}).start();
	} // end of right method
	
	@Override
	public void left() {
		
		left = true;
		for (int i = 0; i < 400; i++) {
			// 왼쪽 벽에 부딪쳤는지 체크
			if (backgroundBubbleService.leftWall()) {
				break;
			}
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
			if (backgroundBubbleService.rightWall()) {
				break;
			}
			x++;
			setLocation(x, y);
			// sleep
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // end of for
		// 오른쪽 이동이 끝나면 위로
		up();
	} // end of right method

	@Override
	public void up() {
		
		up = true;
		while (!backgroundBubbleService.topWall()) {
			y--;
			setLocation(x, y);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 메서드 이름 : 동사 + 목적어 형식으로
	private void clearBubble() {
		try {
			// 2초 후 터지기
			Thread.sleep(2000);
			setIcon(bomb);
			// 0.5초 후 사라지기
			Thread.sleep(500);
//			setVisible(false); 
			// 또는 
			setIcon(null);
			repaint(); // 버그 방지 (대신 전부 새로 그려야 해서 부하가 큼)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
