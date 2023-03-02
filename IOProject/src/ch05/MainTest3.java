package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest3 {

	public static void main(String[] args) {

		long millisecond = 0;
		
		// 1
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("bubble.zip");
			fos = new FileOutputStream("bubblecopy.zip");
			int i;
			
			// 보조 스트림 활용하기
			// 보조 스트림의 생성자 매개변수에 기반 스트림을 받음
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			// 작업 전 현재 시간
			millisecond = System.currentTimeMillis();
			
			while ((i = bis.read()) != -1) {
				// i라는 공간 안에 zip 파일을 byte 단위로 읽는 중
				bos.write(i);
			}
			
			// 로직의 작업 시간 계산 = 작업 후 현재 시간 - 작업 전 현재 시간
			millisecond = System.currentTimeMillis() - millisecond;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("파일 복사 시 소요 시간 : " + millisecond);
		
	} // end of main

}
