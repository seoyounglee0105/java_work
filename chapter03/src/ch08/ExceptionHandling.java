package ch08;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		// try-catch-finally
		// finally 문은 언제 사용해야 할까?
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			int result = scanner.nextInt();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			scanner.close(); // 자원 해제 용도
			
		}
		
		
	} // end of main

}
