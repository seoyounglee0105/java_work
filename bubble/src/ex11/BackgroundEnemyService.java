package ex11;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import ex10.Enemy;

// 메인 쓰레드는 그림을 그리고, 이벤트 리스너를 받고 있음

// 백그라운드에서 계속 Player의 움직임을 관찰하는 기능을 부여할 클래스
public class BackgroundEnemyService implements Runnable {

	private Enemy enemy;
	// 사용자가 보는 화면보다 더 단순하고, 형태와 크기가 동일한 배경 이미지를 사용함
	// 이번 파일에서는 테스트용으로 작은 거 사용
	private BufferedImage image;
	
	private int JUMPCOUNT = 0;
	private int FIRST  = 0; // 바닥이면 0, 꼭대기면 1
	private int BOTTOM_COLOR = -1;

	public BackgroundEnemyService(Enemy enemy) {
		this.enemy = enemy;
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

		// 적군이 살아 있을 때만 반복
		while (enemy.getState() == 0) {
			// 색상 확인
			// 왼쪽으로 갈 때는 좌표 지점을 보정해야 하고, 오른쪽으로 갈 때는 기준 좌표 지점을 보정해야 한다.

			// 기준 왼쪽
			Color leftColor = new Color(image.getRGB(enemy.getX() + 9, enemy.getY() + 25));
		
			// 기준 오른쪽
			Color rightColor = new Color(image.getRGB(enemy.getX() + 60, enemy.getY() + 25));
			
			// 바닥 충돌 감지
//			Color bottomColorLeft = new Color(image.getRGB(player.getX() + 10, player.getY() + 60));
			int bottomColorLeft = image.getRGB(enemy.getX() + 15, enemy.getY() + 55);
			int bottomColorRight = image.getRGB(enemy.getX() + 40, enemy.getY() + 55);

			// 바닥 충돌 확인
			// 둘 다 흰색이 아니라면 == 바닥이라면
			if (bottomColorLeft + bottomColorRight != -2) {
				enemy.setDown(false);
			} else {
				enemy.setDown(true);
			}
			
			// 외벽 충돌 확인
			// 꼭대기 도착
//			if ()
				
			// 오른쪽 구석
			
			// 왼쪽 구석
			
			
			
		} // end of while
	} // end of run

}
