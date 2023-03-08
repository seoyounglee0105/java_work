package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {
	// 준비물
	// mysql 계정 정보 + 비밀번호
	// 접속 경로 : URL 주소
	//      프로토콜           IP주소    포트번호   DB명              지역 정보(아시아, 서울)               UTF-8 언어
	// "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
	
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "1234";
	private static final String URL = "jdbc:mysql://localhost:3306/showdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
	
	// DB 접근 기술 - 필요한 클래스들
	
	static Connection connect; // DB 커넥션 : 연결 객체
	static Statement stmt; // 문자열들을 SQL로 변경하거나 명령문을 실행시켜주는 인터페이스 
	static ResultSet rs; // SQL의 결과 집합을 받아주는 인터페이스
	
	
	public static void main(String[] args) {
		// 드라이버 로드 - 동적 로딩 (기존 : 컴파일 시점 선언과 다름)
		// 실행 시점에 객체를 메모리에 올리는 것
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 기억하기
			// Driver <- 동작을 시켜야 함
			connect = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			
			// 연결 객체에서 Statement를 뽑아낼 수 있음
			stmt = connect.createStatement();
			
			// 쿼리 문을 실행해서 결과 집합을 rs에 담음
			String sql = "SELECT * FROM userTBL "; // SQL 쿼리문 쓸 때 마지막은 공백 하나 (나중에 오류날 수 있다고 함)
			rs = stmt.executeQuery(sql);
			
			// rs에 값이 있다면 (레코드 개수 만큼 반복됨)
			while (rs.next()) {
				String username = rs.getString("username"); // 테이블 컬럼명을 매개변수로 입력 (VARCHAR를 String으로 받음)
				String birthYear = rs.getString("birthYear");
				String addr = rs.getString("addr");
				String mobile = rs.getString("mobile");
				System.out.println(username + ", " + birthYear + ", " + addr + ", " + mobile);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 닫는 건 최근에 사용한 순서대로
				rs.close();
				stmt.close();
				connect.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	} // end of main
	
} // end of class
