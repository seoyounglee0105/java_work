package ch05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class SetMainTest {

	public static void main(String[] args) {

		// Set 계열
		// 순서가 없고 (인덱스 번호가 없고) 중복 불가
		// index for 구문을 사용할 수 없음
		
		// 값 추가
		Set<Integer> set1 = new HashSet<>();
		set1.add(1); 
		set1.add(10); 
		set1.add(100); 
		set1.add(500); 
		
		System.out.println(set1.toString());
		System.out.println(set1.size());
		
		// 값 삭제
		set1.remove(500); // 해당 값 삭제
		set1.remove(1000); // 해당 값이 없더라도, 오류가 나지 않고 무시함
		
		// 전체삭제
		set1.clear();
		System.out.println(set1.toString());
		
		// Set 계열을 반복문 처리할 때 Iterator 타입으로 변환해서 처리할 수 있음
		Iterator<Integer> iter = set1.iterator(); // 반복자로 형 변환 처리
		
		System.out.println(iter.next());

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
//		try {
//			System.out.println("next 사용 : " + iter.next());
//			System.out.println("next 사용2 : " + iter.next());
//			System.out.println("next 사용 3: " + iter.next());
//		} catch (NoSuchElementException e) {
//			System.out.println("자료구조 안에 값이 없어");
//		}
		
	}
	
}
