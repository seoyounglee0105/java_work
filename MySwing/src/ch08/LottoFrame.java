package ch08;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

// 버튼이 눌러지면 6개의 난수를 생성하기 (1~45)
public class LottoFrame extends JFrame implements ActionListener {

	JButton button;
	int[] lotto = new int[6];

	public LottoFrame() {
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
		lotto = getLottoNumber();
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("lotto : " + lotto[i]);
		}

		// 그림을 다시 그리다
		repaint(); // [F5] 새로고침과 같은 역할 -> paint 메서드를 호출함

	}

	// paint 메서드 오버라이드
	@Override
	public void paint(Graphics g) {
		super.paint(g);
//		g.setColor(Color.black);
		Font f = new Font("궁서체", Font.BOLD, 25); // "글꼴명", 스타일, 글자크기
		g.setFont(f);
		if (lotto[0] == 0) {
			// 게임 초기 상태 (int의 기본값 = 0)
			// 문자열 추가 (해당 문자열은 초기 상태에서만 출력)
			g.drawString("로또 번호를 클릭하세요", 160, 200); // "문자열", x좌표, y좌표
			return;
		}
		// 코드가 여기로 내려오면 버튼을 누른 것. (로또 번호가 출력되어야 함)
		// 메서드와 멤버 변수를 활용해서 그림을 그릴 수 있음
		
		// 비추천 (for 문 안에 여러 식을 넣을 수 있으나, 추천되지는 않는 형식)
		for (int i = 0, x = 50; i < lotto.length; i++, x+=100) {
			g.drawString(lotto[i] + "", x, 200);
		}
	}

	// 6개의 난수를 생성해서 배열에 넣기
	public int[] getLottoNumber() {
		Random r = new Random();
		for (int i = 0; i < lotto.length; i++) {
			int j = r.nextInt(45) + 1; // 1 ~ 45
			lotto[i] = j;
			// 중복 값 확인을 위한 반복문 생성
			for (int e = 0; e < i; e++) {
				if (lotto[i] == lotto[e]) { // 중복이 발생한다면
					i = i - 1; // i를 되돌려서 다시 반복시킴
					break; // 중복이 확인되면 나머지는 확인할 필요가 없음
				}
			}
		} // end of for
			// 오름차순 정렬
		Arrays.sort(lotto); // 배열을 정렬해주는 메서드
		return lotto;
	}

	// =============== 코드 테스트
	public static void main(String[] args) {
		new LottoFrame();

	} // end of main

} // end of public class
