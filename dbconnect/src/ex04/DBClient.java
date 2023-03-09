package ex04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DB 연결 기능을 클래스로 만들어 보자.
// 과제 : DBClient를 싱글톤 패턴으로 구현해보자.
public class DBClient {

	private static final String DB_HOST = "localhost";
	private static final int DB_PORT = 3306;
	private static String dbName = "showdb";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "root";
	private static final String DB_PASSWORD = "1234";
	
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public static void setDB_NAME(String dB_NAME) {
		dbName = dB_NAME;
	}

	public static String getDB_NAME() {
		return dbName;
	}
	
    // DBClient는 싱글톤 패턴으로 만들어서 활용할 수 있음
	// 싱글톤 패턴 만들기 // ---------
	
	// 자기 자신의 데이터 타입을 가진 static 변수
	private static DBClient dbClient;

	// 생성자의 접근 제어자를 private으로 변경
	private DBClient() {
		conn = getConnection();
	}
	
	// 외부에서 접근 가능한 static 메서드
	public static DBClient getInstance() {
		if (dbClient == null) {
			dbClient = new DBClient();
		}
		// 이미 저장되어 있다면
		return dbClient;
	}
	
	// ------------------------
	
	// format 메서드 사용법 : https://young0105.tistory.com/64
	public Connection getConnection() {
		// 방어적 코드
		if (conn == null) {   // %s : 문자열, %d : 정수가 들어갈 곳
			String urlFormat = "jdbc:mysql://%s:%d/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			// %로 지정된 공간에 순서대로 값이 들어감
			String url = String.format(urlFormat, DB_HOST, DB_PORT, dbName, DB_CHARSET);
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver"); // Connection 객체를 뽑을 드라이버 객체 로드
				conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
				System.out.println(">>> Connection Success <<<");
				
			} catch (Exception e) {
				System.out.println(">>> Connection Fail <<<");
				e.printStackTrace();
			}
		}
		return conn;
	}

	public void connectionClose() {
		// 방어적 코드
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
