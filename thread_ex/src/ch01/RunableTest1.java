package ch01;

import javax.swing.JFrame;

public class RunableTest1 {

	// 쓰레드의 생성 방법, 사용 방법을 학습했다.
	// 만약 코드가 JFrame을 상속받았다면, 자바는 단일 상속을 지원하기 때문에 다중 상속을 할 수 없다.
	// 그래서 인터페이스인 Runnable 구현 방법을 알아야 한다.
	
	public static void main(String[] args) {
		// 사용하는 방법
		System.out.println("main thread 시작");
		SubWorker subWorker = new SubWorker();
//		subWorker.start();   // 현재 start 메서드가 없다. (이유 : Runnable 기능은 구현했지만, Thread 클래스를 상속받지는 않았기 때문임)
		
		// Thread를 상속받지 않고 start 메서드를 사용하려면 어떻게 해야 할까?
		
		// start 메서드는 Thread가 가지고 있다.
		// Thread의 생성자 중에서는 Runnable 타입을 매개변수로 받는 것이 있다.
		// 다형성을 통해, subWorker는 Runnable 타입으로도 볼 수 있다.
		Thread thread1 = new Thread(subWorker);
		Thread thread2 = new Thread(subWorker);
		
		// 시작 시점은 자유롭게 설정할 수 있다. (이벤트, 연산 이후, ...)
		thread1.start();
		thread2.start();
		
	} // end of main

} // end of class

// 생성하는 방법
class SubWorker extends JFrame implements Runnable {

	// 나중에 쓰레드가 동작해야 하는 부분을 run 안에서 작성함
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.print("i : " + i + " \t");
		}
	}
	
	
	
}
