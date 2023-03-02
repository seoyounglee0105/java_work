package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		// 파일이 없다면, 해당 이름으로 새 파일을 생성해줌
		try {
			byte[] bs = new byte[26];
			byte myData = 65; // A
			fos = new FileOutputStream("output2.txt");
			
			// 파일에 A부터 Z까지의 알파벳을 출력하고 싶다면?
			for (int i = 0; i < bs.length; i++) {
				fos.write(myData);
				myData++;
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
