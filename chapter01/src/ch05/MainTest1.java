package ch05;

public class MainTest1 {

	public static void main(String[] args) {

		// 객체 생성
		Warrior warrior1 = new Warrior();
		// . 연산자를 이용해서 객체에 접근
		// -> 멤버 변수의 값을 초기화(할당)
		warrior1.name = "티모";
		warrior1.power = 100;
		warrior1.color = "갈색";
		warrior1.height = 50;
		
		System.out.println(warrior1.name);
		System.out.println(warrior1.power);
		System.out.println(warrior1.color);
		System.out.println(warrior1.height);
		
		Warrior warrior2 = new Warrior();
		warrior2.name = "애쉬";
		warrior2.power = 80;
		warrior2.color = "파란색";
		warrior2.height = 40;
		
		System.out.println(warrior2.name);
		System.out.println(warrior2.power);
		System.out.println(warrior2.color);
		System.out.println(warrior2.height);
			
	}

}
