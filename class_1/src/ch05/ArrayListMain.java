package ch05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		
		// List 계열
		List list0;
		// 순서가 있고(인덱스 번호가 있고)
		// 데이터의 중복이 가능함
		ArrayList<Integer> list = new ArrayList<>(); // 자료 구조 선언 : 정수를 담을 수 있는 메모리 공간 선언
		// 배열과 달리, 크기를 지정할 필요가 없음 (자동으로 크기가 늘었다 줄었다함)
		ArrayList<Student> members = new ArrayList<>();
		ArrayList<String> strings = new ArrayList<>();
		
		// CRUD
		// 값 추가 방법
		// 리스트명.add(값); :: 인덱스에 순차적으로 값을 추가함 (0번, 1번, 2번, 3번, ...)
		list.add(3); // 인덱스 0번에 3이 담김
		list.add(null); // Integer은 null 가능 -> 인덱스 1번에 null이 담김
		list.add(100); // 인덱스 2번에 100이 담김
		// 리스트명.add(인덱스, 값); :: 해당 인덱스에 값을 추가함
		list.add(1, 20); // 인덱스 1번에 20이 담김
		// => 기존에 이미 값(null 포함)이 추가되어 있는 인덱스에 적용할 경우,
		//      값이 덮어쓰기되는 것이 아니라 끼워넣어서 추가됨
		// 따라서, 원래 인덱스 1번, 2번에 담겨 있던 null과 100이
		// 인덱스 2번, 3번으로 밀려나고 1번에 20이 담김
		
		// 리스트 값 확인
		System.out.println(list.toString());
		// 리스트 크기 확인
		System.out.println(list.size());  // 배열의 length와 유사
		System.out.println("====================");
		
		// 값 삭제 방법
		// 리스트명.remove(인덱스);
		list.remove(2); // 인덱스 2번에 있던 값 삭제
		
		// 리스트 값 확인
		System.out.println(list.toString());
		// 리스트 크기 확인
		System.out.println(list.size());
		System.out.println("====================");
		
		// 값 전체 삭제
//		list.clear(); 
		
		// 리스트 값 확인
		System.out.println(list.toString());
		// 리스트 크기 확인
		System.out.println(list.size());
		System.out.println("====================");
		
		// 특정 값을 화면에 출력하는 방법
		System.out.println(list.get(2)); // 인덱스 2번의 값 가져오기   :: 배열의 인덱스 연산[]과 유사
//		System.out.println(list.get(20)); // IndexOutOfBoundsException
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		} // index for
		
		// for each
		// 자료형 변수명 : 리스트명
		// 리스트의 크기 만큼 반복함
		// 리스트의 처음부터 끝까지 반복할 때 
		// 변수명은 list의 각각의 요소를 가리킴
		// 반복 횟수 : list의 요소 개수 만큼
		for (int 변수명 : list) {
			System.out.println(변수명);
		} // 이니셜라이즈드 for
		
		// 값 검색 기능 
		// 리스트 안에 값이 있는지 없는지 확인하기
		// 리스트명.contains(값);
		// 리스트 내에 값이 있으면 true, 없으면 false
		// int 값은 자동으로 클래스 타입 Integer로 형 변환
		System.out.println(list.contains(70));
		System.out.println(list.contains(100));
		
		// 값이 있다면, 그 값이 인덱스 몇 번에 위치하는지 확인하기
		// 리스트명.indexOf(값);
		System.out.println(list.indexOf(100));
		// 값이 없는 경우 -1 반환
		System.out.println(list.indexOf(10));
		
		// 반복자 타입으로 형 변환
		Iterator<Integer> iter = list.iterator();
		// 요소가 있으면 true
		while(iter.hasNext()) {
			System.out.println("값 확인 방법 : " + iter.next());
		}
		
	}
	
}

class Student {
	
}