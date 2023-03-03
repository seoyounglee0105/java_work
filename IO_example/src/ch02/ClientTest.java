package ch02;

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
	Socket socket;
	final int PORT = 10000;
	
	BufferedReader reader;
	BufferedWriter writer;
	
	public ClientTest() {
		initData();
		
	}	
	
	private void initData() {
		System.out.println("클라이언트에서 서버 접속 요청");
		try {
			socket = new Socket(MY_IP, PORT);
			
			// 클라이언트와 서버 연결 완료
			
			// 키보드에서 데이터 입력받기
			reader = new BufferedReader(new InputStreamReader(System.in));
			
			// 소켓 통신을 통해 데이터 출력하기
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while (true) {
				System.out.println("키보드 입력 대기");			
				String input = reader.readLine(); 
				writer.write(input);
				writer.newLine(); // 문장의 끝을 알려줘야 함
				writer.flush();
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new ClientTest();
	}
}
