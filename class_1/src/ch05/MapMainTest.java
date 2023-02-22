package ch05;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

// Map : 키-값 쌍의 연관 배열 자료 구조를 구현한 인터페이스
// 키를 사용해서 값을 검색할 수 있음
// Map은 중복된 키를 허용하지 않음
// 하나의 키에 대해 하나의 값만 저장할 수 있음

// HashMap은 가장 많이 사용되는 Map 클래스
// 빠른 검색 속도 제공
// Map의 주요 메서드 : put, get, remove, containsKey, containsValue

public class MapMainTest {

	public static void main(String[] args) {

		// 순서가 없음
		Map map;

		// <Key, Value>
		Map<String, String> map1 = new HashMap<>(); // HashMap : Value에 null 값도 저장할 수 있음
		Hashtable<String, String> map2 = new Hashtable<>(); // HashTable : Value에 null 값을 저장할 수 없음

		// CRUD

		// 값 추가
		map1.put("A01", "김포공항 정문");
		map1.put("A02", "김포공항 후문");
		map1.put("A03", "김포공항 로비");
		map1.put("B01", "인천공항 정문");
		map1.put("B02", "인천공항 후문");
		map1.put("B03", "인천공항 로비");
		map1.put("C01", null);

		// 전체 key-value 값 확인 (오버라이드되어 주솟값 대신 값이 나옴)
		System.out.println(map1); // {key1 = value1, key2 = value2, ... }
		// == map1.toString();

		// 특정 value 가져오기
		System.out.println(map1.get("B03")); // 맵명.get(key); -> 키에 맞는 값 가져오기

		System.out.println(map1.get("b01")); // 없는 key 값을 입력하면 null 반환

		// 맵의 크기 확인
		System.out.println("size : " + map1.size());

//		for (int i = 0; i < map1.size(); i++) {
//			System.out.println(map1.get(i));  // 인덱스로 접근하는 것이 아니므로, 모두 null
//		}

		// ------------

		// 맵은 기본적으로 순서가 없지만, key 값을 인덱스 형식으로 지정해주면
		// for 문을 활용할 수 있음
		HashMap<Integer, String> map3 = new HashMap<>();
		map3.put(0, "A");
		map3.put(1, "B");
		map3.put(2, "C");
		map3.put(3, "D");
		map3.put(4, "E");

		for (int i = 0; i < map3.size(); i++) {
			System.out.println("value : " + map3.get(i));
		}

		// 값 삭제
		map1.remove("C01");
		System.out.println(map1.toString());

		// 전체 값 삭제
//		map1.clear();
		System.out.println(map1.toString()); // 빈 맵 : {}

		// 자료 구조는 반복문과 if문을 많이 활용함
		
		// map 계열에 대해 for 문을 활용하는 방법
		// 1. Entry
//		Entry<String, String> entry = (Entry<String, String>) map1.entrySet();
		
//		 크기만큼 반복하며, key, value를 한 번에 가져오기
		for (Entry<String, String> entry2 : map1.entrySet()) {
			System.out.println("key : " + entry2.getKey());
			System.out.println("value : " + entry2.getValue());
			System.out.println("-------------------------");
		}
		
		// key의 개수 확인
		System.out.println(map1.keySet().size());
		
	
		// map 값을 꺼낼 때는 key 값으로 접근 --> value 값 반환
//		String str = map1.get("A01");

		
		/// *********** 이 방법 활용하기 **************
		
//		                            key 값만 모아서 Set 형식으로
		for (String key : map1.keySet()) {
			System.out.println("key : " + key); // 반복하며 key 값을 출력함
			// 이것을 활용해서 value 값을 반복하며 꺼낼 수 있음
			System.out.println("value : " + map1.get(key));
		}
		
		
		

	} // end of main

}
