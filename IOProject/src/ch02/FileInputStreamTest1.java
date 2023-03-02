package ch02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			// 경로와 파일명 입력
			fis = new FileInputStream("input.txt");
			
			// 한 글자씩 출력됨
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			
			
//			// 파일에서 한 글자를 읽어서 가져옴
//			int temp = fis.read();
//			System.out.println(temp);
//			System.out.println((char) temp);
			
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				fis.close(); // 메모리 해제 (목적을 달성했다면 finally 문에서 스트림을 닫음)
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
