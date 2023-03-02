package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			// 경로와 파일명 입력
			fis = new FileInputStream("input.txt");
			
			int i;
			
			// file은 영속성이 있음 (컴퓨터를 꺼도 남아 있음)
			
			// file 내에 더 이상 읽을 값이 없다면 -1을 반환함
			// 읽어온 값이 -1이 아닌 동안 반복함
			System.out.println(">>> 기사 시작 <<<");
			while ( (i = fis.read()) != -1 ) {
				System.out.print((char) i);				
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
