package re02;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

// 플레이어 캐릭터를 클래스로 구현
public class Player extends JLabel implements Moveable {

	private int x; // x 좌표
	private int y; // y 좌표
	private ImageIcon playerR, playerL;
	
	// +++ 플레이어의 현재 움직임 상태 (초깃값 false)
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	// 플레이어의 속도 상태 (상수)
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;
	
	
	public Player() {
		initData();
		setInitLayout();
	}
	
	// +++ setter 메서드
	public void setLeft(boolean left) {
		this.left = left;
	}
	
	public void setRight(boolean right) {
		this.right = right;
	}	
	
	private void initData() {
		// 오른쪽으로 이동할 때의 모습
		playerR = new ImageIcon("images/playerR.png");
		// 왼쪽으로 이동할 때의 모습
		playerL = new ImageIcon("images/playerL.png");
	}
	

	private void setInitLayout() {
		// 초기 위치
		x = 55;
		y = 535;
		
		setSize(50, 50);
		setLocation(x, y);
		
		// JLabel에 아이콘 세팅
		setIcon(playerR);
		
		setVisible(true);
	}

	// 인터페이스에서 받아온 추상 메서드를 재정의해서 이동 기능 구현
	@Override
	public void left() {
		// +++ 왼쪽으로 이동중임을 표시
		left = true;
		
		// +++ 뚝뚝 끊기지 않고 자연스럽게 움직이도록 쓰레드를 생성함
		// 한 번 왼쪽 키를 누르면 쓰레드가 생성되고,
		// 여러 번 누르면 쓰레드가 계속 생성돼서 속도가 점점 빨라짐
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// left가 true인 동안 반복
				while (left) {
					setIcon(playerL); // 왼쪽으로 이동하는 모습으로 변경
					x -= SPEED; // x가 감소하면 왼쪽으로 이동
					setLocation(x, y);
					// sleep
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			} // end of run method
		}).start(); // 쓰레드가 작업을 시작함
	} // end of left method

	@Override
	public void right() {
		// +++ 오른쪽으로 이동중임을 표시
		right = true;
		
		// +++ 뚝뚝 끊기지 않고 자연스럽게 움직이도록 쓰레드를 생성함
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// right가 true인 동안 반복
				while (right) {
					setIcon(playerR); // 오른쪽으로 이동하는 모습으로 변경
					x += SPEED; // x가 증가하면 오른쪽으로 이동
					setLocation(x, y);
					// sleep
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			} // end of run method
		}).start(); // 쓰레드가 작업을 시작함
	} // end of right method

	// +++ 점프 기능
	@Override
	public void up() {
		// 위로 올라가고 있음을 표시
		up = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 130 / JUMPSPEED; i++) {
					y -= JUMPSPEED; // y가 감소하면 위로 이동
					setLocation(x, y);
					
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of for
				
				// 점프한 후에는 아래로 떨어져야 함
				up = false; // 올라가지 않는 상태
				down();
				
			} // end of run method
		}).start(); // 쓰레드가 작업을 시작함
	} // end of up method

	// +++ 아래로 떨어지는 기능
	@Override
	public void down() {
		// 아래로 떨어지고 있음을 표시
		down = true;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 130 / JUMPSPEED; i++) {
					y += JUMPSPEED; // y가 증가하면 아래로 이동
					setLocation(x, y);
					// sleep
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				down = false; // 떨어지지 않는 상태
			} // end of run method
		}).start(); // 쓰레드가 작업을 시작함
	} // end of down method
} // end of class
