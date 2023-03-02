package ch02;

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
	final String MY_IP = "192.168.0.183"; // 바꿀 일이 없으니 상수로 선언
//	final String MY_IP = "localhost"; // 따로 안찾아도 이렇게 입력하면 자신의 IP주소가 알아서 들어감
	final String YOUR_IP = "192.168.0.137";
	
	Socket socket;
	BufferedWriter bufferedWriter;
	
	public ClientFile() {
		// ip 주소 찾기
		// cmd -> 'ipconfig' 입력 -> IPv4 주소
		try {
			System.out.println("1. 클라이언트 소켓 프로그램 시작");
			socket = new Socket(MY_IP, 11000);
//			socket = new Socket(YOUR_IP, 11000);
			System.out.println("2. 소켓으로 연결 완료");
			
			// 데이터 보내기
			
			// ch01보다 코드를 좀 더 간소화
			// 소켓에다가 버퍼스트림 연결
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			bufferedWriter.write("안녕 글 잘 가니?\n"); // 문장의 끝 확인 : \n
		
			bufferedWriter.flush(); // 버퍼 비우기
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new ClientFile();
	}
	
}
