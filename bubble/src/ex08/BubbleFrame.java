package ex08;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// ***** main 함수를 갖는 클래스는 프로그램에 사용하는 참조 변수를 모두 알 수 있음
public class BubbleFrame extends JFrame {

	// +++
	private BubbleFrame mContext = this; // 자기 자신의 주솟값을 변수 값으로 받음
	
	private JLabel backgroundMap;
	private Player player; // 플레이어 캐릭터를 클래스로 만듦

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();
		
		// player는 이미 메모리가 올라가 있는 상태
		// run 메서드 내 동작 처리
		new Thread(new BackgroundPlayerService(player)).start();
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap); // 배경으로 삽입하고 싶은 이미지
		setSize(1000, 640);

		// +++
		// 부모의 주솟값을 자식에게 던져주기
		player = new Player(mContext);
	}

	private void setInitLayout() {
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치

		add(player);

		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			// 추상 메서드가 없어, 원하는 메서드만 재정의 가능
			// 키를 눌렀을 때
			@Override
			public void keyPressed(KeyEvent e) {

				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 여러 번 눌러도 한 번만 호출되도록 방어적 코드 작성
					// 해당 코드가 없으면 쓰레드가 마구 생성돼서 속도가 빨라짐
					if (player.isLeft() == false && player.isLeftWallCrash() == false) {
						// player가 왼쪽으로 움직이는 상태가 아니라면(false) 호출됨
						// 움직이고 있는 상태라면(true) 호출되지 않음
						// 벽에 충돌한 상태면(true) 호출되지 않음
						player.left();						
					}
					break;

				case KeyEvent.VK_RIGHT: // 콜론
					if (player.isRight() == false && player.isRightWallCrash() == false) {
						player.right();						
					}
					break;

				case KeyEvent.VK_UP: // 콜론
					if (!player.isUp() && !player.isDown()) {
						player.up();						
					}
					break;

				case KeyEvent.VK_DOWN: // 콜론
					player.down();
					break;
					
				// +++ 스페이스를 누르면 물방울을 발사함
				case KeyEvent.VK_SPACE:
					// 기존 코드를 지움
					player.attack(); // attack에서 생성
					break;
					
					
				} // end of switch
			} // end of Pressed method
			
			// 키를 뗐을 때
			@Override
			public void keyReleased(KeyEvent e) {
				
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 왼쪽 키를 떼면 player가 멈추게 하기
					player.setLeft(false); // while이 멈추며, 쓰레드가 dead 상태가 됨
					break;

				case KeyEvent.VK_RIGHT: // 콜론
					// 오른쪽 키를 떼면 player가 멈추게 하기
					player.setRight(false);
					break;

//				case KeyEvent.VK_UP: // 콜론
//					player.setUp(false);
//					break;
//
//				case KeyEvent.VK_DOWN: // 콜론
//					player.setDown(false);
//					break;
				} // end of switch
				
			}

		});
	}

	// ***** 자바 프로그램 중 main 함수를 가지는 클래스는 
	// 프로그램에서 사용하는 모든 참조 값을 알 수 있다. *****
	public static void main(String[] args) {
		new BubbleFrame();
	}

}
