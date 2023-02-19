package ch09;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 화면 구현 위주
// 기능은 LottoRandomNumber에게서 받아오기
public class LottoFrameAfter extends JFrame implements ActionListener {

	JButton button;
	int[] lotto = new int[6];

	public LottoFrameAfter() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("Lotto Game");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("Lotto Start");
	}

	private void setInitLayout() {
		// root 패널의 레이아웃은 기본값인 BorderLayout을 사용함
		add(button, BorderLayout.NORTH); // 버튼을 위쪽에 추가
		setVisible(true);
	}

	private void addEventListener() {
		// 이벤트 등록
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("게임 시작 ~");
		LottoRandomNumberBefore lottoRandomNumber = new LottoRandomNumberBefore(); // 객체 생성
		lotto = lottoRandomNumber.lottoNumber(); // 번호 생성
		// 콘솔에 번호 출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("lotto : " + lotto[i]);
		}
		repaint();
	}

	// paint는 직접 호출하지 않아도, 실행의 흐름이 이미 정해져 있어서
	// 자동으로 호출이 됨
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font f = new Font("궁서체", Font.ITALIC, 25);
		g.setFont(f);
		if (lotto[0] == 0) {
			g.drawString("버튼을 눌러 번호를 확인하세요!", 120, 200);
			return;
		}
		int x = 50;
		for (int i = 0; i < lotto.length; i++) {
			if (i == 0) {
				g.drawString(lotto[i] + "", x, 200);
			} else {
				g.drawString(lotto[i] + "", x += 100, 200);
			}
		} // end of for

	} // end of paint

}
