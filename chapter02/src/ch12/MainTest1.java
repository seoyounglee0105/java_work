package ch12;

public class MainTest1 {

	public static void main(String[] args) {
//		기본적으로 추상 클래스는 new 키워드를 사용 할 수 없음 (강제성)
//		Animal animal =  new Animal(); <- 오류 
	
		Animal animalHuman = new Human();
		animalHuman.hunt();
		System.out.println("-------------------");
		Animal animal = new Person(); // 업 캐스팅
		
		
		
			
		}
		
	}

