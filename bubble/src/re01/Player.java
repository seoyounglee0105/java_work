package re01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

// 플레이어 캐릭터를 클래스로 구현
public class Player extends JLabel implements Moveable {

	private int x; // x 좌표
	private int y; // y 좌표
	private ImageIcon playerR, playerL;
	
	// 플레이어의 속도 상태 (상수)
	private final int SPEED = 4;
	
	public Player() {
		initData();
		setInitLayout();
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
		// 왼쪽으로 이동하는 모습으로 이미지 변경
		setIcon(playerL);
		// 왼쪽으로 이동
		x -= SPEED;
		setLocation(x, y);
	}

	@Override
	public void right() {
		// 오른쪽으로 이동하는 모습으로 이미지 변경
		setIcon(playerR);
		// 오른쪽으로 이동
		x += SPEED;
		setLocation(x, y);
	}

	@Override
	public void up() {
		
	}

	@Override
	public void down() {
		
	}
	

}
