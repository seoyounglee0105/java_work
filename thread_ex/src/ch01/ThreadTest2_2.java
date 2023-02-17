package ch01;

public class ThreadTest2_2 {

	public static void main(String[] args) {
		
		Worker2 worker1 = new Worker2("워커 1");
		Worker2 worker2 = new Worker2("워커 2");
		
		worker1.start();
		worker2.start();
		
		
		
	} // end of main
	
} // end of class

class Worker2 extends Thread {
	private String name;
	
	public Worker2(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "이 " + (i + 1) + "번째 작업을 시작합니다.");
			System.out.println(Thread.currentThread());
			
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + "이 " + (i + 1) + "번째 작업을 끝냈습니다.");
		}
	}
}
