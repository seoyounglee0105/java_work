package ch05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainTest4 {

	public static void main(String[] args) {

		FileReader fileReader = null;
		int count = 0;
		
		// 기반 스트림 + 보조 스트림 (자료형 : 문자 단위)
		try {
			File file = new File("output2.txt");
			fileReader = new FileReader(file);
			
			// 한 줄씩 읽기 - 보조 스트림 활용
			BufferedReader bufferedReader = new BufferedReader(fileReader);
		
			int i;
			
			// 기반 스트림만 사용할 때랑 반복 횟수는 같음
			
//			while ( (i = bufferedReader.read()) != -1 ) {
//				System.out.println((char) i);
//				count++;
//			}
			
			// 한 줄씩 읽어서 파일에다 출력하기
			FileWriter writer = new FileWriter("myText.txt");
			writer.write(bufferedReader.readLine());
			// flush를 해야 작업을 완료하고 출력됨
			writer.flush();
			
			
			// 기반 스트림만 사용해서 한 글자씩 읽음 (작업 시간이 더 오래 걸림)
//			while ( (i = fileReader.read()) != -1 ) {
//				System.out.println((char) i);
//				count++;
//			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		System.out.println("반복 횟수 : " + count);
		
		
	} // end of main

}
