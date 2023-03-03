package ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientTest {

	final String MY_IP = "192.168.0.183";
	final String YOUR_IP = "192.168.0.137";
	Socket socket;
	final int PORT = 10000;

	// 키보드 읽기용
	BufferedReader keyboardReader;

	// 소켓 보내기용
	BufferedWriter socketWriter;

	// 소켓 읽기용
	BufferedReader socketReader;

	public ClientTest() {
		initData();
	}

	private void initData() {
		System.out.println("클라이언트에서 서버 접속 요청");
		try {
			socket = new Socket(MY_IP, PORT);

			keyboardReader = new BufferedReader(new InputStreamReader(System.in));
			socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			socketWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			new Thread(new KeyboardThread()).start();

			while (true) {
				String serverMsg = socketReader.readLine();
				System.out.println("서버 >>> " + serverMsg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				keyboardReader.close();
				socketWriter.close();
				socketReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end of initData

	class KeyboardThread implements Runnable {

		@Override
		public void run() {
			try {
				String clientMsg = keyboardReader.readLine();
				socketWriter.write(clientMsg + "\n");
				socketWriter.flush();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	} // end of inner class

	public static void main(String[] args) {
		new ClientTest();
	}
	
}
