package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		// 현재 output.txt는 없는 상태
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("output.txt");
			
			// 파일을 새로 생성해서 정수 값에 해당하는 문자를 입력함
			// byte 단위로 읽음
			fos.write(97);
			fos.write(98);
			fos.write(99);
			fos.write(100);
			
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
