package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile {

	// 소켓 통신을 구현
	
	// 1. 서버 측, 클라이언트 측은 통신을 통해서 데이터를 주고 받음.
	// 서버 측을 만들 때는 서버 소켓을 준비해야 함.
	
	// 소켓은 양 끝단에 포트 번호를 달아야 함.
	// 한 대의 컴퓨터는 포트 번호를 0 ~ 65335번까지 사용할 수 있음
	// 그 중에, 0 ~ 1023번까지는 잘 알려진 포트 번호라서 가능한 사용하지 않는 것을 권장함 (시스템에서 미리 선점한 포트들이 있음)
	
	// 클라이언트 연결만 받는 소켓
	ServerSocket serverSocket;
	
	// 실제 통신을 하는 소켓
	Socket socket;
	
	BufferedReader bufferedReader;
	
	// 생성자
	public ServerFile() {
		System.out.println(">> 1. 서버 소켓 시작 <<");
		
		try {
			// 서버 소켓을 포트 번호와 함께 생성함
			serverSocket = new ServerSocket(11000); // 매개변수 : 포트번호
			socket = serverSocket.accept(); // 클라이언트 접속 대기 중 (접속 전까지는 여기서 멈춰있음)
			System.out.println("2. 클라이언트 연결 완료");
			
			// 프로토콜 : 서버와 클라이언트 간의 동등한 약속
			
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			String getMsg = bufferedReader.readLine();
//			System.out.println("서버 측에서 확인 : " + getMsg);
//			String getMsg2 = bufferedReader.readLine();
//			System.out.println("서버 측에서 확인 : " + getMsg2);
			
			
			// 이런 식으로 여러 번 반복해서 메시지를 주고받을 수 있음
			while (true) {
				String getMsg = bufferedReader.readLine();
				System.out.println("받은 메세지 : " + getMsg + "\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("여기에 코드가 내려왔나요?");
		
	} // end of constructor

	public static void main(String[] args) {
		
		new ServerFile();
		
	} // end of main


}
