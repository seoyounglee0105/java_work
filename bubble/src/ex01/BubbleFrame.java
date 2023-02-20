package ex01;

import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player; // 플레이어 캐릭터를 클래스로 만듦

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(1000, 640);

		player = new Player();
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
			@Override
			public void keyPressed(KeyEvent e) {

				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.left();
					break;

				case KeyEvent.VK_RIGHT: // 콜론
					player.right();
					break;

				case KeyEvent.VK_UP: // 콜론
					player.up();
					break;

				case KeyEvent.VK_DOWN: // 콜론
					player.down();
					break;
				} // end of switch

			}

		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}

}
