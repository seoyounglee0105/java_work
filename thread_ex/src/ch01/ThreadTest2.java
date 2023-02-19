package ch01;

public class ThreadTest2 {

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




