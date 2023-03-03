package ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	ServerSocket serverSocket;
	Socket socket;
	
	// 키보드 읽기용
	BufferedReader keyboardReader;
	
	// 소켓 보내기용
	BufferedWriter socketWriter;
	
	// 소켓 읽기용
	BufferedReader socketReader;
	
	public ServerTest() {
		initData();
	} // end of 생성자
	
	private void initData() {
		try {
			System.out.println("서버 실행");
			serverSocket = new ServerSocket(10000);
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결 완료");
			
			socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			socketWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));
			
			new Thread(new KeyboardThread()).start();
			
			while (true) {
				String clientMsg = socketReader.readLine();
				System.out.println("클라이언트 >>> " + clientMsg);
			}
			
			
		} catch (IOException e) {
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
	
	// 키보드 입력을 받고 보내는 메서드
	class KeyboardThread implements Runnable {

		@Override
		public void run() {
			while (true) {
				try {
					String serverMsg = keyboardReader.readLine();
					
					socketWriter.write(serverMsg + "\n");
					socketWriter.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	} // end of inner class
	
	public static void main(String[] args) {
		new ServerTest();
	}
	
}
