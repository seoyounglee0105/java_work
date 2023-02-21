package ex07;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// 주의
// 쓰레드가 아님
// 메서드 호출시키기

public class BackgroundBubbleService {

	private BufferedImage image;
	private Bubble bubble;

	// 생성자
	public BackgroundBubbleService(Bubble bubble) {
		this.bubble = bubble;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("파일 경로를 확인해주세요");
		}
	}

	public boolean leftWall() {
		// RGB 값을 int로 확인 가능
		Color leftColor = new Color(image.getRGB(bubble.getX() + 10, bubble.getY()));

		// 빨간색이면 (왼쪽 벽에 부딪치면)
		if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
			return true;
		}

		return false;
	}

	public boolean rightWall() {
		// RGB 값을 int로 확인 가능
		Color rightColor = new Color(image.getRGB(bubble.getX() + 60, bubble.getY()));

		// 빨간색이면 (오른쪽 벽에 부딪치면)
		if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
			return true;
		}
		return false;
	}

	public boolean topWall() {
		// RGB 값을 int로 확인 가능
		Color topColor = new Color(image.getRGB(bubble.getX()+20, bubble.getY()));

		// 빨간색이면 (오른쪽 벽에 부딪치면)
		if (topColor.getRed() == 255 && topColor.getGreen() == 0 && topColor.getBlue() == 0) {
			return true;
		}
		return false;
	}

}
