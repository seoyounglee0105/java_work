package ch11;

public class FruitMainTest {

	public static void main(String[] args) {
		// 다양한 형태로 클래스(타입)을 바라볼 수 있음 (다형성)

		Fruit fruit1 = new Banana(); // 업 캐스팅 *

		// 컴파일 시점에는 컴파일러가 앞에 선언된 데이터타입만 확인함
		// 부모 클래스의 멤버변수만 인식함 (업 캐스팅 상태)
		// banana의 orgin 멤버변수에 접근하지 못함 -> 다운캐스팅 필요
		Fruit fruit2 = new Peach();

		// 다운 캐스팅 (강제 형 변환과 유사)
		// fruit1가 Banana 클래스임을 컴파일러에게 명시
		String bananaOrigin = ((Banana) fruit1).origin;
		System.out.println("다운 캐스팅된 값 확인 : " + bananaOrigin);

		Fruit[] fruits = new Fruit[2];
		fruits[0] = fruit1;
		fruits[1] = fruit2;

		// 반복문
		// A instanceof B : A가 데이터 타입 B에 해당하면 true (반복문과 자주 쓰임)
		for (int i = 0; i < fruits.length; i++) {
			fruits[i].showInfo();
			// 바나나면 원산지를 출력하시오
			if (fruits[i] instanceof Banana)  { // fruits[i]가 Banana 타입이면
				// 다운 캐스팅
				String origin = ((Banana) fruits[i]).origin;
				System.out.println("원산지 : " + origin);
			}	

			System.out.println("--------------");
		}
	}

}
