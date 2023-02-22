package ch05;

import java.util.HashMap;

public class MainTest3 {
	public static void main(String[] args) {
		// Map 자료 구조를 이용해서 전화번호를 저장해주세요
		// 1 - String, String
		
		HashMap<String, String> map1 = new HashMap<>();
		
		map1.put("이서영", "010-3333-4444");
		map1.put("홍길동", "010-5555-4444");
		map1.put("김영희", "010-7777-4444");
		
		String phoneNumber = map1.get("홍길동");
		System.out.println(phoneNumber);
		
		// 같은 이름의 key는 단 하나만 저장됨
		
		
		// 2 - String, Object(Person)
		
		HashMap<String, Object> map2 = new HashMap<>();

		map2.put("010-1234-1234", "김철수");
		map2.put("010-2345-6789", "박감자");
		map2.put("010-3456-6543", "김철이");
		
		
		
		
	}
	
}
