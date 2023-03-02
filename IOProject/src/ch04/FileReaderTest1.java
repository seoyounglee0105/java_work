package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) {

		// 문자 단위로 읽어 들이는 스트림
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("output2.txt");
			// 최소 2바이트씩 읽을 수 있음 -> 한글도 깨지지 않게 읽을 수 있음
			int temp = fr.read(); // 리턴 자료형 : int
			System.out.println("temp : " + (char) temp);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
