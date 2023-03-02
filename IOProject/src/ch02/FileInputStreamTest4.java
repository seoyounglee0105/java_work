package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			// 경로와 파일명 입력
			fis = new FileInputStream("input.txt");
			byte[] bs = new byte[10];
			// bs 공간 만큼 읽어라
			fis.read(bs);
			for (byte b : bs) {
				System.out.println((char) b);
				
			}
			
			System.out.println("\n>>> 기사 종료 <<<");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어요.");
			
		} catch (IOException e) {
			System.out.println("입력 스트림 동작 시 오류가 발생했어요.");
			
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
