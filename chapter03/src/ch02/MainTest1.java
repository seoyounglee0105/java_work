package ch02;

import java.nio.file.ReadOnlyFileSystemException;

public class MainTest1 {

	public static void main(String[] args) {
		
		Televison televison = new Televison();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot robot = new ToyRobot();
		ToyCar toyCar = new ToyCar();
		
		// 다형성 
		RemoteController controller1 = televison;
		RemoteController controller2 = refrigerator;
		RemoteController controller3= robot;
		RemoteController controller4 = toyCar;
		
		// 배열
		RemoteController[] remoteControllers = new RemoteController[4];
		remoteControllers[0] = televison;
		remoteControllers[1] = refrigerator;
		remoteControllers[2] = robot;
		remoteControllers[3] = toyCar;
	
		// 문제 1 
		// for문을 활용해서 전원을 전부 켜주세요
		for (int i = 0; i < remoteControllers.length; i++) {
			remoteControllers[i].turnOn(); // 컴파일 시점, (turnOn, turnOff)
		}
		
		
		// 문제 2
		// 인덱스 값이 3번째면 어떠한 type을 가지는지 출력해주세요
		for (int i = 0; i < remoteControllers.length; i++) {
			if (i == 3) {
				System.out.println("3번째는 ToyCar 데이터 타입입니다.");
			}
		}
		
		// 문제 3 
		// 만약 데이터 타입이 ToyRobot이면 멤버 변수 name 값을 출력해주세요
		for (int i = 0; i < remoteControllers.length; i++) {
			if (remoteControllers[i] instanceof ToyRobot) {
				System.out.println(((ToyRobot)remoteControllers[i]).name);  // 다운 캐스팅
			}
		}
		
		// 문제 4
		// 냉장고에 소리 기능을 추가해주세요
		// 장난감 로봇에 소리 기능을 추가해주세요
		// 소리 기능을 인터페이스로 설계, 구현
		
		
		
	} // end of main
	
} // end of class
