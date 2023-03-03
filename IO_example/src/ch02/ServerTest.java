package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// 서버와 클라이언트는 코드로 연결되는 것이 아니라, 통신으로 연결되는 것
// 커넥션 풀 : 소켓은 계속 연결되어 있음
public class ServerTest {
	
	// 클라이언트로 연결받는 소켓
	ServerSocket serverSocket;

	// 실제 통신을 담당할 소켓
	Socket socket;
	
	public ServerTest() {
		initData();
		
	}

	private void initData() {
		try {
			System.out.println("서버 실행");
			// 서버 소켓 생성
			serverSocket = new ServerSocket(10000);
			// 클라이언트 접속 대기
			socket = serverSocket.accept(); // 클라이언트가 접속하면 socket을 반환함
			System.out.println("클라이언트 연결 완료");
			
			// 입력 스트림 연결 (데이터를 주고받기 위해)
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// 데이터 읽기
			while (true) {
				String msg = "클라이언트에서 온 메시지 : " + reader.readLine();
				System.out.println(msg + "\n");				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ServerTest();
	} // end of main
}
