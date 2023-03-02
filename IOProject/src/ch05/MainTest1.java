package ch05;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest1 {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("output3.txt");

			// 보조 스트림 (기반 스트림에 의존함)
					// 기반 스트림 : 데이터를 읽어 들이는 스트림	
					// 보조 스트림 : 기반 스트림에서 좀 더 확장해서 연결하는 스트림
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			bos.write(97);
			bos.write(98);
			bos.write(99);
			bos.flush();  // 물을 내리다
			
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
		
		
	} // end of main

}
