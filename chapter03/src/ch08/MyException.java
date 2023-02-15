package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MyException {
	public static void main(String[] args) {
		
		TxtFileInputManager inputManager = 
				new TxtFileInputManager("test.txt");
		
		try {
			String result = inputManager.readTxtFileData();
			System.out.println("result : " + result );
		} catch (IOException e) {
			System.out.println("예외처리됨");
			e.printStackTrace();
		}
		
	}
}

class TxtFileInputManager {
	
	// 외부 파일을 내 메모리 상으로 가져올 수 있게 하는 역할
	private FileInputStream fis;
	private String fileName;
	
	public TxtFileInputManager(String fileName) {
		this.fileName = fileName;
	}
	
	public String readTxtFileData() throws IOException {
		
		// IOException이 FileNotFoundException의 부모
		
		fis = new FileInputStream(fileName);
		Properties prop = new Properties();
		prop.load(fis);
		// KEY = VALUE : 데이터를 읽어주는 것
		// name=홍길동 -> 홍길동 추출
		String name = prop.getProperty("name");
		
		return name;
	}
	
	class MyABException extends IOException {
		// 사용자 정의 예외 메서드
	}
	
}