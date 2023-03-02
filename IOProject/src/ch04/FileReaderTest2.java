package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {

	public static void main(String[] args) {

		// 문자 단위로 읽어 들이는 스트림
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("output2.txt");
			// 최소 2바이트씩 읽을 수 있음 -> 한글도 깨지지 않게 읽을 수 있음
			int i;
			
			// 더 이상 읽을 값이 없으면 -1 반환
			while ( (i = fr.read()) != -1) {
				System.out.print((char) (i));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
