package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 양방향 통신 구현하기
public class ServerTest {
	
	// 클라이언트로 연결받는 소켓
	ServerSocket serverSocket;

	// 실제 통신을 담당할 소켓
	Socket socket;
	
	// 입력 스트림 (소켓 담당)
	BufferedReader reader; 
	
	// 출력 스트림
	BufferedWriter writer;
	
	// 서버 측에서 키보드 데이터를 받기 위한 입력 스트림 필요
	BufferedReader keyboardReader;
	
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
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// 출력 스트림 연결 (데이터를 주고받기 위해)
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// 키보드에 연결
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));
						
			// 이미 메인 쓰레드는 while문을 구동하고 있으므로, 내부 클래스로 쓰레드를 하나 더 만들자.
			// 새로운 쓰레드를 생성해서 일을 시작시키기
			WriterThread writerThread = new WriterThread();
			// Runnable 타입을 익명 클래스인 Thread의 매개변수로 받고, start();
			new Thread(writerThread).start();
			
			// 메인 쓰레드의 while 문이 가장 아래에 있어야 정상 작동함
			// 데이터 읽기
			while (true) {
				String msg = "클라이언트 >>> " + reader.readLine() + "\n";
				System.out.println(msg);
			}
					
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // end of initData
	
	// 내부 클래스 생성
	class WriterThread implements Runnable {

		// 새로운 작업자(쓰레드)가 해야 할 일 정의
		@Override
		public void run() {
			while (true) {
				// 키보드에서 데이터를 입력받아 소켓 출력 스트림을 통해 데이터를 보내주어야 함
				try {
					// 키보드 데이터 받아오기
					String serverMsg = keyboardReader.readLine(); 
					
					// 소켓에 연결된 출력 스트림을 통해 데이터 보내기
					writer.write(serverMsg + "\n");
					writer.flush();
					
				} catch (IOException e) {
					e.printStackTrace();
				} 				
			} // end of while
			
		} // end of run
		
	} // end of inner class
	
	public static void main(String[] args) {
		new ServerTest();
	} // end of main
} // end of outer class
