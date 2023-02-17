package ch01;

//쓰레드를 생성하는 방법

//1) 상속을 활용해서 쓰레드(작업자) 만들기
//Worker : 쓰레드를 상속한 클래스 (즉, Worker는 Thread 타입으로도 볼 수 있음 - 다형성)
//Thread는 Runnable 인터페이스를 받음

//약속된 부분
//start 메서드를 통해 쓰레드에게 일을 시작하라고 명령할 수 있음
//그러면 쓰레드는 run 메서드 안에 있는 부분을 수행시킴

public class Worker extends Thread {
	
	private String name;
	
	public Worker(String name) {
		this.name = name;
	}
	

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("worker : " + name + " : " + i);
			System.out.println(Thread.currentThread());
			
			// 클래스 이름으로 접근하므로, sleep은 static 메서드
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} // end of run
}