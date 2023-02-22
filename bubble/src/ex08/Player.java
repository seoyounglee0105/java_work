package ex08;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {
	
	// +++
	BubbleFrame mContext;
	
	private int x;
	private int y;
	private ImageIcon playerR, playerL;
	
	// +++ 플레이어의 방향 상태 (enum 타입 사용 : 데이터의 범주화)
	private PlayerWay pWay;
	
	// 플레이어의 현재 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	// 플레이어의 충돌 여부 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;
	private boolean topWallCrash;
	
	// 플레이어의 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;
	
	// +++
	public Player(BubbleFrame mContext) {
		this.mContext = mContext;
		initData();
		setInitLayout();
	}

	// getter 메서드
	public boolean isLeft() {
		return left;
	}
	
	public boolean isRight() {
		return right;
	}
	
	public boolean isLeftWallCrash() {
		return leftWallCrash;
	}
	
	public boolean isRightWallCrash() {
		return rightWallCrash;
	}
		
	public boolean isTopWallCrash() {
		return topWallCrash;
	}
	
	public boolean isUp() {
		return up;
	}
	
	public boolean isDown() {
		return down;
	}
	
	public int getSPEED() {
		return SPEED;
	}
	
	public int getJUMPSPEED() {
		return JUMPSPEED;
	}
	
	public PlayerWay getpWay() {
		return pWay;
	}
	
	
	// setter 메서드
	
	public void setpWay(PlayerWay pWay) {
		this.pWay = pWay;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public void setRight(boolean right) {
		this.right = right;
	}
	
	public void setLeftWallCrash(boolean leftWallCrash) {
		this.leftWallCrash = leftWallCrash;
	}

	public void setRightWallCrash(boolean rightWallCrash) {
		this.rightWallCrash = rightWallCrash;
	}
	
	public void setTopWallCrash(boolean topWallCrash) {
		this.topWallCrash = topWallCrash;
	}
	
	public void setUp(boolean up) {
		this.up = up;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		left = false;
		right = false;
		up = false;
		down = false;
		leftWallCrash = false;
		rightWallCrash = false;
		pWay = PlayerWay.RIGHT;
	}
	
	private void setInitLayout() {
		// 초기 위치
		x = 450;
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
		pWay = PlayerWay.LEFT;
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
		pWay = PlayerWay.RIGHT;
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

				while (down) {
					y = y + JUMPSPEED;
					setLocation(x, y);

					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				} // end of while
				down = false;
				
				// 상태값을 다룰 때는 상황이 변하면 초기값 관리를 잘하자
				
			}
		}).start();
	}
	
	public void attack() {
		Bubble bubble = new Bubble(this);
		// +++ 부모의 .add()를 사용할 수 있음
		mContext.add(bubble);
		
		
	}
	
}
