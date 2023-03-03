package ch01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	
	
	public static void main(String[] args) {
		// 글자를 만들어 두고 파일에다 출력하기
		// 출력 스트림 필요
		// 대상 : 파일 & 단위 : 문자
		// 기반 스트림 + 보조 스트림
		
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter("output1.txt"));
			writer.write("Hello, world");
			writer.newLine(); // 한줄 띄움
			writer.write("안녕하세요");
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
		}
		
	}
	
}
