package ex11;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// 메인 쓰레드는 그림을 그리고, 이벤트 리스너를 받고 있음

// 백그라운드에서 계속 Player의 움직임을 관찰하는 기능을 부여할 클래스
public class BackgroundPlayerService implements Runnable {

	private Player player;
	// 사용자가 보는 화면보다 더 단순하고, 형태와 크기가 동일한 배경 이미지를 사용함
	// 이번 파일에서는 테스트용으로 작은 거 사용
	private BufferedImage image;

	public BackgroundPlayerService(Player player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("백그라운드 플레이어 서비스 객체에 사용하는 이미지 경로/파일명 다시 확인");
		}
	}

	@Override
	public void run() {
		// 계속 시킬 동작을 정의하면 됨
		// 시작은 Thread.start();

		while (true) {
			// 색상 확인
			// 왼쪽으로 갈 때는 좌표 지점을 보정해야 하고, 오른쪽으로 갈 때는 기준 좌표 지점을 보정해야 한다.

			// 기준 왼쪽
			Color leftColor = new Color(image.getRGB(player.getX() + 9, player.getY() + 25));
		
			// 기준 오른쪽
			Color rightColor = new Color(image.getRGB(player.getX() + 60, player.getY() + 25));
			
			// 바닥 충돌 감지
//			Color bottomColorLeft = new Color(image.getRGB(player.getX() + 10, player.getY() + 60));
			int bottomColorLeft = image.getRGB(player.getX() + 15, player.getY() + 55);
			int bottomColorRight = image.getRGB(player.getX() + 40, player.getY() + 55);
			
			// 천장 충돌 감지
//			Color topColor = new Color(image.getRGB(player.getX(), player.getY()));
			
			
			// 하얀색 (배경)일 때는 계속 떨어져야 함
			// 하얀색이 아니면 바닥임
			if (bottomColorLeft + bottomColorRight != -2) { // -1 : 하얀색
				// 바닥이면
//				System.out.println("여기는 바닥입니다.");
				player.setDown(false);
			} else {
				// 바닥이 아니면
				// 점프하는 순간 bottomColorLeft는 -1이 됨
				// 위쪽 방향키를 누르면 65번 반복적으로 y값을 마이너스해서 이미지를 위로 올리고, down() 메서드를 호출함
				
				if (player.isUp() == false && player.isDown() == false) {
					// down() 메서드가 한 번 호출되어야 함
					player.down();
				}
				
			}
			
			// 왼쪽 벽에 충돌함을 감지하기
			if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
//				System.out.println("왼쪽 벽에 충돌했어요!!!");
				player.setLeft(false);
				player.setLeftWallCrash(true);
			// 오른쪽 벽에 충돌함을 감지하기
			} else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
//				System.out.println("오른쪽 벽에 충돌했어요!!!");
				player.setRight(false);
				player.setRightWallCrash(true);
			// 천장에 충돌함을 감지하기
//			} else if (topColor.getRed() == 255 && topColor.getGreen() == 0 && topColor.getBlue() == 0) {
//				player.setUp(false);
//				player.setTopWallCrash(true);
			} else {
				// 충돌하지 않은 상태이면 초기화
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);
			}
			
			try {
				// 쓰레드가 많아지면 컴퓨터가 버티지 못할 수 있어, sleep을 주어야 함.
				// sleep을 주었더니 이 쓰레드가 쉴 때에는 감지를 못해서 벽을 뚫고 지나가는 버그 발생
				// => player.setRightWallCrash(true);를 추가해서
				//      충돌함을 표시해서 충돌했을 때는 움직이지 못하게 하면 해결
				Thread.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		} // end of while

//		// 좌표 값을 이용해서 이미지에서 특정 지점의 색 코드(int)를 추출할 수 있음
//		// 이미지명.getRGB(x좌표, y좌표)
//		int result = image.getRGB(player.getX(), player.getY());
//		System.out.println("색 result : " + result);
//
//		// 색상을 만드는 객체
//		Color rightColor = new Color(result);
//		// RGB 코드 추출 
//		// 최대 : 255, 255, 255 - 하얀색
//		// 최소 : 0, 0, 0 - 검은색
//		rightColor.getRed();
//		rightColor.getGreen();
//		rightColor.getBlue();
//		
//		// 계속 관찰해야 함, 반복 횟수 지정 X
//		if (rightColor.getRed() == 255 && rightColor.getGreen() == 255 && rightColor.getBlue() == 255) {
//			System.out.println("여기는 하얀색");
//		}
//		// 벽이 빨간색이므로, player의 위치가 빨간색으로 판별되면 벽에 부딪혔다고 인식할 수 있음

	} // end of run

}
