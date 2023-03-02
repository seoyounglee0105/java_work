package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest4 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		// 파일이 없다면, 해당 이름으로 새 파일을 생성해줌
		try {
			byte[] bs = new byte[26];
			byte myData = 65; // A
			fos = new FileOutputStream("output2.txt", true); // true : 기존 데이터를 그대로 두고, 거기에 값을 더 추가해서 출력함
			// false (기본값) : 기존 데이터를 초기화하고 값을 출력함
			
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
