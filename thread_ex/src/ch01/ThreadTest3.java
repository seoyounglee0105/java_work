package ch01;

public class ThreadTest3 {

	// 메인 쓰레드
	public static void main(String[] args) {

		// 쓰레드를 사용하는 방법
		
		// 현재 쓰레드가 누군지 알아보는 명령어
		System.out.println("main 쓰레드 시작-----------");
		System.out.println(Thread.currentThread());  // -> Thread[쓰레드명, 우선순위, 그룹
		
		// 작업자 하나 만들어 내기
		Worker worker1 = new Worker("워커 1");
		
		// 니가 위임받은 일을 시작해 : start();
		worker1.start();
		
		// 작업자 하나 더 만들어 내기
		Worker worker2 = new Worker("워커2");
		worker2.start();
		System.out.println("main 쓰레드 종료-----------");
		
		// 작업자의 실행 순서를 개발자가 완벽히 제어할 수는 없다
		// 우선순위를 통해 어느 정도는 제어 가능
		
	} // end of main

} // end of class

// 쓰레드를 생성하는 방법

// 1) 상속을 활용해서 쓰레드(작업자) 만들기
// Worker : 쓰레드를 상속한 클래스 (즉, Worker는 Thread 타입으로도 볼 수 있음 - 다형성)
// Thread는 Runnable 인터페이스를 받음

	// 약속된 부분
	// start 메서드를 통해 쓰레드에게 일을 시작하라고 명령할 수 있음
	// 그러면 쓰레드는 run 메서드 안에 있는 부분을 수행시킴
	