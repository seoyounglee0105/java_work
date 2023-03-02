package ch06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest1 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("data.txt");
			// 보조 기반 스트림 활용
			DataOutputStream dos = new DataOutputStream(fos);
			
//			dos.write(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14F);
			dos.writeUTF("TEST UTF"); // 문자열 출력
			dos.flush(); // 항상 기억하기
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 데이터 단위로 읽어보기
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("data.txt");
			
			// 보조 스트림 + data 
			DataInputStream dis = new DataInputStream(fis);
			
			// 강제 형 변환할 필요가 없어짐
			
			char a = dis.readChar();
			int b  = dis.readInt();
			float c = dis.readFloat();
			String d = dis.readUTF(); // 문자열 읽기
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
