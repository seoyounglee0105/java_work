package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {

		// output3.txt에 hello world를 찍어주세요

		FileOutputStream fos = null;
		byte[] bs = new byte[11];
		try {
			fos = new FileOutputStream("output3.txt");
			System.out.println("문자열을 입력해주세요.");
			for (int i = 0; i < bs.length; i++) {
				bs[i] = (byte) System.in.read();
			}
			fos.write(bs);
			
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} 

}
