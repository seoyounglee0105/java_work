package ch01;

import java.io.IOException;
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
	
	// 생성자
	public ServerFile() {
		System.out.println(">> 1. 서버 소켓 시작 <<");
		
		try {
			// 서버 소켓을 포트 번호와 함께 생성함
			serverSocket = new ServerSocket(11000); // 매개변수 : 포트번호
			// 누군가 접속하기 위해서는 서버 소켓을 대기시켜야 함
			socket = serverSocket.accept(); // 클라이언트 접속 대기 중 (접속 전까지는 여기서 멈춰있음), accept는 Socket을 리턴함 -> socket에 담기
			// 클라이언트가 연결되면 통신을 담당하는 소켓을 생성 (점유하고 있지 않은 랜덤 포트 번호를 생성해줌)
			
			System.out.println("2. 클라이언트 연결 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("여기에 코드가 내려왔나요?");
		
	} // end of constructor

	public static void main(String[] args) {
		
		new ServerFile();
		
	} // end of main


}
