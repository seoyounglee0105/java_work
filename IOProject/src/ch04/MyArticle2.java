package ch04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyArticle2 {

	public static void main(String[] args) {
		
		// 파일 입출력을 활용해서 코드를 작성해주세요
		
		// 입력 대상 : article1.txt
		// 출력 대상 : today_article.txt
		
		FileReader fr = null; 
		FileWriter fw = null;
		
		try {
			fr = new FileReader("article1.txt");
			fw = new FileWriter("today_article.txt");
			
			fw.write("MVC 뉴스\n\n");
			
			int i;
			
			// Reader 기반은 2바이트 이상 처리 가능 -> 한글이 깨지지 않음 
			while ( (i = fr.read()) != -1 ) {
//				System.out.print((char) i);
				fw.write(i);
			}
			
			fw.write("\n\n작성자 : 이서영");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				fr.close();
				// Writer를 작성할 때 스트림이 열려 있으면 잠시 '버퍼'라는 공간에 담아 두었다가
				// 스트림이 종료(close)되거나 flush 메서드를 만나면 실제로 파일에 출력함
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
