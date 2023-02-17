package ch01;

public class ThreadTest1 {

	// 메인 쓰레드
	public static void main(String[] args) {
		
		for (int i = 0; i < 30; i++) {
//			System.out.print("i : " + i + "\t");
			System.out.print("-");
			
			// 작업을 1초씩 쉬면서 좀 천천히 해. (컴파일 오류 - 예외 처리로 해결)
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  // 밀리세컨드 ( 1000ms = 1s)
		}
		
		
		
	} // end of main
	
} // end of class
