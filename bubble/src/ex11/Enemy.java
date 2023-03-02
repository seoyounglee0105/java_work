package ex11;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Enemy extends JLabel implements Moveable {
	
	// 살아있는 상태(0), 물방울에 죽은 상태(1)
	private int state;

	// 위치 상태
	private int x;
	private int y;
	
	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	// 적군 속도 상태
	private final int SPEED = 3;
	private final int JUMPSPEED = 1;
	
	// 적군 이미지
	private ImageIcon enemyR, enemyL;
	
	// 적군 방향
	EnemyWay enemyWay;
	
	// 생성자
	public Enemy() {
		initData();
		setInitLayout();
		
		left();
	}
	
	public void setState(int state) {
		this.state = state;
	}

	public int getState() {
		return state;
	}

	private void initData() {
		enemyR = new ImageIcon("images/enemyR.png");
		enemyL = new ImageIcon("images/enemyL.png");
		x = 720;
		y = 175;
		left = false;
		right = false;
		up = false;
		down = false;
		enemyWay = EnemyWay.LEFT;
		state = 0;
	}
	
	private void setInitLayout() {
		setIcon(enemyL);
		setSize(50, 50);
		setLocation(x, y);
	}
	
	
	@Override
	public void left() {
		enemyWay = EnemyWay.LEFT;
		left = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					x = x - SPEED;
					setLocation(x, y);
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
			}
		}).start();
		left = false;
	}

	@Override
	public void right() {
		enemyWay = EnemyWay.RIGHT;
		right = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					x = x + SPEED;
					setLocation(x, y);
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
			}
		}).start();
		right = false;
	} // end of right

	@Override
	public void up() {
		up = true;
		// 람다 표현식 사용해보기 (축약)
		new Thread(() -> {
			// run 메서드 구현부
			for (int i = 0; i < 130 / JUMPSPEED; i++) {
				y = y - JUMPSPEED;
				setLocation(x, y);
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			up = false;
			down();
		}).start();
	} // end of up

	@Override
	public void down() {
		down = true;
		new Thread(() -> {
			// run 메서드 구현부
			while (true) {
				y = y + JUMPSPEED;
				setLocation(x, y);

				try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		}).start();
		down = false;
	}
	
	
}
