package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		
		// 파일을 배우려면 IO 클래스에 대해 배워야 함
		FileInputStream fis = null;
		
//		fis = new FileInputStream("temp"); // 컴파일 오류
		
		try {
			fis = new FileInputStream("temp");
		
		} catch(FileNotFoundException f) {
			System.out.println("temp라는 파일이 없습니다.");
			
		}
		
		System.out.println("------------------");
		
//		try-catch-finally
		
		// try 문에서 예외가 발생하면, 그 밑의 코드는 실행되지 않고
		// 바로 catch문으로 넘어감
		try {
			fis = new FileInputStream("test1.txt");
			return;
		} catch (FileNotFoundException e) {
			System.out.println("파일명을 확인해주세요.");
		} catch (Exception e) {
			e.printStackTrace(); // 오류를 자세히 알려줌
		} finally {
			// 반드시 수행되는 코드
			// 심지어, 실행을 종료시키는 return; 키워드를 만나더라도 수행됨
			System.out.println("finally 수행");
		}
		
		System.out.println("비정상 종료되지 않았어요");
		
		
	} // end of main
	
} // end of class
