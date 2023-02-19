package ch10;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AmongUsFrame2 extends JFrame implements KeyListener {
	
	// 배경 이미지
	// 버퍼 -> 어떠한 데이터를 담을 수 있는 박스, 데이터를 담아두었다가 한번에 옮김
	BufferedImage backgroundMap;
	// 캐릭터 어몽어스 이미지 1
	BufferedImage pinkImage1;
	// 캐릭터 어몽어스 (적군) 이미지 1
	BufferedImage grayImage1;
	BufferedImage grayImage2;
	BufferedImage tempImage;

	// JPanel 상속 --> inner class
	CustomPanel customPanel;

	int pinkX = 200;
	int pinkY = 200;
	int grayX = -20;
	int grayY = 400;

	public AmongUsFrame2() {
		initData();
		setInitLayout();
		addEventListener();
//		Thread thread = new Thread(customPanel);
//		thread.start();

		new Thread(customPanel).start();
	}

	private void initData() {
		setTitle("미니어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 이미지 3개 있음. CustomPanel
		try {
			backgroundMap = ImageIO.read(new File("images/background_map.png"));
			pinkImage1 = ImageIO.read(new File("images/pink_image1.png"));
			grayImage1 = ImageIO.read(new File("images/gray_image.png"));
			grayImage2 = ImageIO.read(new File("images/gray_image_die.png"));
			tempImage = ImageIO.read(new File("images/gray_image_ghost.png"));
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
			e.printStackTrace();
		}
		// customPanel 메모리에 올라가는 순간 paintComponents() 메서드 호출
		customPanel = new CustomPanel();
	}

	private void setInitLayout() {
		// 레이아웃은 기본 레이아웃 기반으로 설정함
		// add 호출시 paintComponent 메서드 실행
		add(customPanel);

		setVisible(true);
	}

	private void addEventListener() {
		// 이벤트 리스너 등록 처리
		this.addKeyListener(this);
	}

//        파스칼표기법
	class CustomPanel extends JPanel implements Runnable {

		// BufferedImage
		// paintComponents면 작동 안함
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundMap, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(pinkImage1, pinkX, pinkY, 100, 100, null);
			g.drawImage(grayImage1, grayX, grayY, 100, 100, null);
		}

		@Override
		public void run() {
			boolean isRight = true;
			boolean isDie = false;
			int count = 0;

			while (true) {
				if (grayX == pinkX && grayY == pinkY) {
					count++;
					if(count == 1) { // 첫 번째로 만나면
						grayImage1 = grayImage2; // 시체 이미지로 변경
					}
					grayX = pinkX; // 만나면 멈추게 함
					isDie = true;
					repaint();
				} else { // 만나지 않았을 때, 이미 만난 적이 있다면 유령 이미지 상태로 변경됨
					isDie = false;
					if(count >= 1) {
						grayImage1 = tempImage;
					}
				}
				if (isDie == false) {
					if (isRight) {
						grayX += 10;
					} else {
						grayX -= 10;
					}

					// 방향 체크
					if (grayX == 500) {
						isRight = false;
					}
					if (grayX == -20) {
						isRight = true;
					}
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					repaint();
				}
			}
		}
	} // end of inner class

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		System.out.println("keyCode: " + keyCode);
		if (keyCode == KeyEvent.VK_LEFT) {
			// 왼쪽 이동
			pinkX = (pinkX < 0) ? -20 : pinkX - 10;
//			pinkX -= 10;
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			// 오른쪽 이동
			pinkX = (pinkX < 510) ? pinkX + 10 : 510;
		} else if (keyCode == KeyEvent.VK_UP) {
			// 위로 이동
			pinkY = (pinkY < 0) ? -10 : pinkY - 10;
//			pinkY -= 10;
		} else if (keyCode == KeyEvent.VK_DOWN) {
			// 아래로 이동
			pinkY = (pinkY < 470) ? pinkY + 10 : 470;
//			pinkY += 10;
		}

		// 그림을 다시 그려주다 실행
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

} // end of outer class