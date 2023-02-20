package re02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player; 
	
	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫으면 프로그램 종료
		setTitle("버블버블 게임");
		setSize(1000, 640);
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setContentPane(backgroundMap); // 배경 이미지 설정
		
		player = new Player();
	}
	
	private void setInitLayout() {
		setLayout(null); // 좌표 기반 레이아웃
		setResizable(false); // 창 크기 조절 불가
		setLocationRelativeTo(null); // 창을 화면 가운데에 배치
		
		add(player);
		
		setVisible(true);
	}
	
	private void addEventListener() {
		// KeyAdapter는 추상 메서드가 없어, 원하는 메서드만 재정의 가능
		this.addKeyListener(new KeyAdapter() {
			
			// 키를 눌렀을 때
			@Override
			public void keyPressed(KeyEvent e) {
				
				// KeyCode 값에 따라 코드가 실행되도록 함
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT :
					player.left();
					break;
					
				case KeyEvent.VK_RIGHT :
					player.right();
					break;
					
				case KeyEvent.VK_UP:
					player.up();
					break;
					
				case KeyEvent.VK_DOWN :
					player.down();
					break;
				} // end of switch
			} // end of Pressed method
			
			// +++ 키를 뗐을 때
			@Override
			public void keyReleased(KeyEvent e) {
				
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT :
					// 왼쪽 키를 떼면 player가 멈추게 하기
					player.setLeft(false); // while이 멈추며, 쓰레드가 dead 상태가 됨
					break;
					
				case KeyEvent.VK_RIGHT :
					// 오른쪽 키를 떼면 player가 멈추게 하기
					player.setRight(false);
					break;
				} // end of switch
			} // end of Released method
		});
	}
	
	public static void main(String[] args) {
		new BubbleFrame();
	} // end of main
}
