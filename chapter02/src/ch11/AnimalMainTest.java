package ch11;

public class AnimalMainTest {

	public static void main(String[] args) {
		// Human human = new Human();
		// 다형성을 적용하게 된다면 부모 타입으로 데이터 타입을 선언할 수 있고
		// 실제 메모리에 올라가는 객체를 다형성이 적용되는 클래스를 인스턴스화할 수 있다.
		// (인스턴스화 : 메모리에 올리다)
		Animal animalH = new Human(); // Human은 Animal을 상속받았기 때문에
		Animal animalT = new Tiger(); // Tiger는 Animal을 상속받았기 때문에
		
		// 다형성 : 하나의 형태에 대해 다양하게 바라볼 수 있는 관점

		// 다형성의 효용
		// 배열 : 연관된 데이터 타입을 모아서 관리할 수 있음
		Animal[] arrayAnimal = new Animal[10];
		arrayAnimal[0] = animalH;  // Human은 Animal 타입으로도 바라볼 수 있기 때문임
		arrayAnimal[1] = animalT;
		
		for (int i = 0; i < arrayAnimal.length; i++) {
			if (arrayAnimal[i] != null) {
				arrayAnimal[i].move();
				arrayAnimal[i].eating(); // Tiger는 eating 메서드가 없지만, Animal에게서 상속 받음
				                                            // Human은 eating 메서드가 있고 메서드 오버라이드가 적용돼서
														   	// Human의 eating 메서드가 호출됨
			}
		}
		
	}

}
