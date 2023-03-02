package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// 클라이언트 측 코드
// 소켓 통신을 하려면 소켓이 필요함 (서버 측 연결을 담당하는 포트 번호를 알아야 접속할 수 있음)

public class ClientFile {
	Socket socket;
	final String MY_IP = "192.168.0.183"; // 바꿀 일이 없으니 상수로 선언
//	final String MY_IP = "localhost"; // 따로 안찾아도 이렇게 입력하면 자신의 IP주소가 알아서 들어감
	
	final String YOUR_IP = "192.168.0.137";
	
	public ClientFile() {
		// ip 주소 찾기
		// cmd -> 'ipconfig' 입력 -> IPv4 주소
		try {
			System.out.println("클라이언트 소켓 프로그램 시작");
			socket = new Socket(MY_IP, 11000);
//			socket = new Socket(YOUR_IP, 11000);
			System.out.println("소켓으로 연결 완료");
			
			// 입력 스트림
			// 키보드에서 데이터 입력 (표준 입출력 : 키보드) -> 키보드 연결 : System.in
			// 키보드 연결 스트림 생성
			InputStreamReader reader = new InputStreamReader(System.in);
			// 기존은 한 글자씩만 읽어짐 -> 기능 확장 : 보조 스트림
			BufferedReader bufferedReader = new BufferedReader(reader);
			System.out.println("키보드 입력 대기 : ");
			String keyboardMsg = bufferedReader.readLine(); // 엔터 키를 칠 때까지 계속 읽어 줌
			
			// 데이터를 보내야 해! -> 출력 스트림 이용
			OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
			// 기능 확장 : 보조 스트림
			BufferedWriter bufferedWriter = new BufferedWriter(osw);
			bufferedWriter.write("keyboardMsg : " + keyboardMsg + "\n");
			// 중요 : 메세지의 끝을 알려주어야 함
			bufferedWriter.flush();
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ClientFile();
	}
	
}
