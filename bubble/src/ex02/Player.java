package ex02;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {
	
	private int x;
	private int y;
	private ImageIcon playerR, playerL;
	
	// 플레이어의 현재 움직임 상태를 기록
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	// 플레이어의 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;
	
	
	public Player() {
		initData();
		setInitLayout();
	}

	// setter 메서드
	public void setLeft(boolean left) {
		this.left = left;
	}
	
	public void setRight(boolean right) {
		this.right = right;
	}

	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		left = false;
		right = false;
		up = false;
		down = false;
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
		left = true;
		
		// 자연스럽게 움직이도록 하기
		// 한 번 왼쪽 키를 누르면 쓰레드가 생성됨
		// 여러 번 키를 누르면 쓰레드가 계속 생성돼서 속도가 점점 빨라짐
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (left) {
					setIcon(playerL);
					x -= SPEED;
					setLocation(x, y);
					// sleep 
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			}
		}).start();
		
	} // end of left method

	@Override
	public void right() {
		right = true;
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (right) {
					setIcon(playerR);
					x += SPEED;
					setLocation(x, y);
					// sleep
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			}
		}).start();
		
	} // end of right method

	@Override
	public void up() {
		up = true;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 130 / JUMPSPEED; i++) {
					y -= JUMPSPEED;
					setLocation(x, y);
					
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of for
				
				// 점프를 했으니, 이제 다시 자동으로 떨어져야 함
				up = false;
				down();
				
			} 
		}).start();
		
	} // end of up method

	@Override
	public void down() {
		down = true;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 130 / JUMPSPEED; i++) {
					y += JUMPSPEED;
					setLocation(x, y);
					// sleep
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				down = false;
				
			}
		}).start();
	}
	
}
