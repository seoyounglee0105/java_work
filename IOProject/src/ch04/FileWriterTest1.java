package ch04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		char[] buf = {'반', '갑', '습', '니', '다'}; 
		
		try {
			fw = new FileWriter("writer1.txt");
			fw.write('H'); // 문자 하나만 출력 -> 파일에
//			fw.write(buf); // 배열 내 문자들을 파일에 출력
			fw.write("사실 그냥 문자열로 출력할래"); // 문자열로 바로 출력도 가능
			
//			fw.write(buf, 1, 2); // 배열명, 시작인덱스a, 길이n -> 시작인덱스 a부터 n개 만큼의 문자들을 출력
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
