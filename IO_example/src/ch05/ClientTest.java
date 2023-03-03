package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {

	// 통신을 하기 위한 소켓 필요 + IP 주소 필요 + 포트 번호 필요

//	final String MY_IP = "localhost"; // 192.168.0.183
	final String MY_IP = "192.168.0.183";
	final String YOUR_IP = "192.168.0.137";
	Socket socket;
	final int PORT = 10000;

	BufferedReader keyboardReader;
	BufferedWriter writer;

	// 소켓 통신을 통해 들어온 데이터를 입력받아야 함
	// 입력 스트림
	BufferedReader socketReader;

	public ClientTest() {
		initData();

	}

	private void initData() {
		System.out.println("클라이언트에서 서버 접속 요청");
		try {
//			socket = new Socket(MY_IP, PORT);
			socket = new Socket(YOUR_IP, PORT);

			// 클라이언트와 서버 연결 완료

			// 키보드에서 데이터 입력받기
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));

			// 소켓 통신을 통해 데이터 출력하기
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 소켓과 입력 스트림 연결하기 (초기화)
			socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// 익명 클래스로 간소화
			new Thread(new ReadThread()).start();
			
			while (true) {
				String input = keyboardReader.readLine();
				writer.write(input);
				writer.newLine(); // 문장의 끝을 알려줘야 함
				writer.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				keyboardReader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // end of initData

	// 내부 클래스
	class ReadThread implements Runnable {

		@Override
		public void run() {
			// 소켓 통신으로 들어온 데이터를 읽어오기
			while (true) {
				try {
					String serverMsg = socketReader.readLine();
					System.out.println("서버 >>> " + serverMsg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} // end of while
		}
	}

	public static void main(String[] args) {
		new ClientTest();
	}
}
